package wsms.com.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import wsms.com.entity.AccountBalance;
import wsms.com.entity.BillingsInformation;
import wsms.com.entity.TillTransactions;
import wsms.com.entity.Tills;
import wsms.com.entity.Transactions;

public class CreateTransactions {
	
	//Post a Transaction
	public void postTransactions(String TID, String stdNo, String accountName, String depWithdrawal,
			String txnCode, LocalDate txnDate, double amount,
			double availableBalance, double credits, double debits, LocalDateTime dateTime, String user, String invId) {
			
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
			Transactions transact2 = new Transactions();
			
			transact2.setTID(invId); 
			transact2.setAccountNumber(stdNo);
			transact2.setAccountName(accountName);
			transact2.setDepWithdrawal(depWithdrawal);
			transact2.setTxnCode(txnCode);
			transact2.setTxnDate(txnDate);
			transact2.setAmount(amount);
			transact2.setAvailableBalance(availableBalance);
			transact2.setCredits(credits);
			transact2.setDebits(debits);
			transact2.setUser(user);
			
			entitymanager.persist(transact2);
			
			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
		//}
		
	}
	
	//Post a Transaction Till/GL
	public void postTransactionsGL(String TID, String GLAcct, String accountName, String toCustAcct,
			String toCustName, LocalDate txnDate, double amount,
			double availableBalance, double credits, double debits, LocalDateTime dateTime, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
				
		TillTransactions transact2 = new TillTransactions();
		
		transact2.setTTID(GLAcct+dateTime); 
		transact2.setCustomerAcctNo(toCustAcct); 
		transact2.setCustomerAcctName(toCustName);
		transact2.setTillAcctNo(GLAcct);
		transact2.setTillAcctName(accountName);
		transact2.setTxnDate(txnDate);
		transact2.setCredits(credits);
		transact2.setBalance(availableBalance);
		transact2.setDebits(debits);
		transact2.setUser(user);
		
		entitymanager.persist(transact2);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}

	//DecimalFormat fm = new DecimalFormat("#0.00");
	
	//Initialize new account
	public void createTransactions(String TID, String stdNo, String names, LocalDate date, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Transactions transact = new Transactions();
		
		transact.setTID(TID);
		transact.setAccountNumber(stdNo);
		transact.setAccountName(names);
		transact.setDepWithdrawal("system");
		transact.setTxnCode("select option");
		transact.setTxnDate(date);
		transact.setAmount(0.0);
		transact.setAvailableBalance(0.0);
		transact.setCredits(0.0);
		transact.setDebits(0.0);
		transact.setUser(user);
		
		entitymanager.persist(transact);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//create TID set
	//public class CreateTID {
	public void createTID(String TID, String stdNo) {
			
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AccountBalance customer = entitymanager.find(AccountBalance.class, stdNo);
		
		customer.setTIDSet(TID);
		
		entitymanager.persist(customer);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//Update Balance from deposit CR post
	public void updateAcctBalance(String stdNo, double balance) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AccountBalance customer = entitymanager.find(AccountBalance.class, stdNo);
		
		customer.setBalance(customer.getBalance()+balance);
				
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//update debit DR
	public void updateAcctBalanceDr(String stdNo, double balance) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AccountBalance customer = entitymanager.find(AccountBalance.class, stdNo);
		
		customer.setBalance(customer.getBalance() - balance);
		
		entitymanager.persist(customer);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//GL Account debit credit updates
	//Update Balance from deposit CR post
	public void updateAcctBalanceGL(String tillAcct, double balance) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Tills customer = entitymanager.find(Tills.class, tillAcct);
		
		customer.setBalance(customer.getBalance()+balance);
		
		entitymanager.persist(customer);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//update debit DR GL
	public void updateAcctBalanceDrGL(String tillAcct, double balance) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Tills customer = entitymanager.find(Tills.class, tillAcct);
		
		customer.setBalance(customer.getBalance() - balance);
		
		entitymanager.persist(customer);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}

	//TILL
	//Update Till Balance from deposit CR post
	public void updateTillBalance(String tillAcct, double balance) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Tills customer = entitymanager.find(Tills.class, tillAcct);
		
		customer.setBalance(customer.getBalance() - balance);
				
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//update Till debit DR
	public void updateTillBalanceDr(String tillAcct, double balance) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Tills customer = entitymanager.find(Tills.class, tillAcct);
		
		customer.setBalance(customer.getBalance() + balance);
				
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//Create Till Accounts
	public void createTillAccount(String tillAcctNo, String tillAcctName, double balance, String tillUser,
			String acctClass, String tillCategory, LocalDate tillTxnDate) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Tills till = new Tills();
		
		if(acctClass.equalsIgnoreCase("Till")) {
			till.setTillAcctNo(tillAcctNo);
			till.setTillName(tillAcctName);
			till.setBalance(balance);
			till.setTillUser(tillUser);
			till.setTillAcctClassification(acctClass);
			till.setTillCategory("till");
			till.setTxnDate(tillTxnDate);
			
			entitymanager.persist(till);
		}
		else {
			till.setTillAcctNo(tillAcctNo);
			till.setTillName(tillAcctName);
			till.setBalance(balance);
			till.setTillUser("system");
			till.setTillAcctClassification(acctClass);
			till.setTillCategory(tillCategory);
			till.setTxnDate(tillTxnDate);
			
			entitymanager.persist(till);
		}
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//initialize tilltransactions after creation
	public void initializeTillAccount(String tillAcctNo, String tillAcctName, String tillUser,
			String acctClass, LocalDate tillTxnDate, LocalDateTime date, String user) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Tills till = entitymanager.find(Tills.class, tillAcctNo);
		
		TillTransactions till2 = new TillTransactions();
		
		till2.setTTID(String.valueOf(till.getTillAcctNo())+date);
		till2.setCredits(0.0);
		till2.setDebits(0.0);
		till2.setBalance(0.0);
		till2.setCustomerAcctNo(till.getTillAcctNo());
		till2.setCustomerAcctName(tillAcctName);
		till2.setTillAcctNo(till.getTillAcctNo());
		till2.setTillAcctName(tillAcctName);
		till2.setTxnDate(tillTxnDate);
		till2.setUser(user);
		
		entitymanager.persist(till2);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//Posting Till Transactions
	public void postTillTransactions(String TTID, double credits, double debits, double balance,
			String customerAcctNo, String tillAcctNo, String tillAcctName, String customerAcctName, 
			LocalDate txnDate, String user, LocalDateTime dateTime, String invId) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
				
		TillTransactions till2 = new TillTransactions();
		
		till2.setTTID(invId);
		till2.setCredits(credits);
		till2.setDebits(debits);
		till2.setBalance(balance);
		till2.setCustomerAcctNo(customerAcctNo);
		till2.setCustomerAcctName(customerAcctName);
		till2.setTillAcctNo(tillAcctNo);
		till2.setTillAcctName(tillAcctName);
		till2.setTxnDate(txnDate);
		till2.setUser(user);
		
		entitymanager.persist(till2);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//create TTID Set
	public void createTTIDSet(String TID, String tillAcctNo) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Tills till = entitymanager.find(Tills.class, tillAcctNo);
		
		till.setTTIDSet(TID);
		
		entitymanager.persist(till);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
}