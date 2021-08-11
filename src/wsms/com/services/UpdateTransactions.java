package wsms.com.services;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.TillTransactions;
import wsms.com.entity.Tills;
import wsms.com.entity.Transactions;

public class UpdateTransactions {
	public void updateTillAccount(String tillAcctNo, String tillAcctName, String tillUser,
			String acctClass, String tillCategory, LocalDate tillTxnDate) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Tills till = entitymanager.find(Tills.class, tillAcctNo);
		
		till.setTillName(tillAcctName);
		//till.setBalance(balance);
		till.setTillUser(tillUser);
		till.setTillAcctClassification(acctClass);
		//till.setTillCategory(tillCategory);
		till.setTxnDate(tillTxnDate);
		
		entitymanager.persist(till);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//tilltransactions
	public void updateTillTransactions(String tillAcctNo, String tillAcctName, LocalDate tillTxnDate) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		TillTransactions till = entitymanager.find(TillTransactions.class, tillAcctNo+"1000");
		
		till.setTillAcctName(tillAcctName);
		till.setCustomerAcctName(tillAcctName);
		till.setTxnDate(tillTxnDate);
		
		entitymanager.persist(till);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//update transactions
	public void updateTransactions(String TID, String AcctName, LocalDate TxnDate, String user) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Transactions trans = entitymanager.find(Transactions.class, TID);
		
		trans.setAccountName(AcctName);
		trans.setTxnDate(TxnDate);
		trans.setUser(user);
		
		entitymanager.persist(trans);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
