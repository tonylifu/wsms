package wsms.com.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.POSTransactions;

public class CreatePOSTransactions {
	
	//Post a Transaction
	public void postPOSTransactions(String TID, String stdNo, String accountName, String depWithdrawal,
		String txnCode, LocalDate txnDate, double amount, double credits, double debits, 
		LocalDateTime dateTime, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
	
		POSTransactions transact2 = new POSTransactions();
		
		transact2.setTID(stdNo+dateTime);
		transact2.setAccountNumber(stdNo); 
		transact2.setAccountName(accountName);
		transact2.setDepWithdrawal(depWithdrawal);
		transact2.setTxnCode(txnCode);
		transact2.setTxnDate(txnDate);
		transact2.setAmount(amount);
		transact2.setCredits(credits);
		transact2.setDebits(debits);
		transact2.setUser(user);
		
		entitymanager.persist(transact2);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
}