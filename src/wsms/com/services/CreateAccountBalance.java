package wsms.com.services;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.AccountBalance;

public class CreateAccountBalance {
	
	public void createAccountBalance(String stdNo, double balance, LocalDate lastUpdateDate, 
			String tid, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AccountBalance bal = entitymanager.find(AccountBalance.class, stdNo);
		
		bal.setBalance(balance);
		bal.setLastUpdateDate(lastUpdateDate);
		bal.setTIDSet(tid);
		bal.setUser(user);
		
		entitymanager.persist(bal);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//Create new Account at creation of patients
	public void createAccountBalancePatient(String stdNo, String surName, String otherNames, 
			double balance, LocalDate acctOpenDate, LocalDate lastUpdateDate, String tid, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AccountBalance bal = new AccountBalance();
		
		bal.setStdNo(stdNo);
		bal.setSurName(surName);
		bal.setOtherNames(otherNames);
		bal.setBalance(balance);
		bal.setAcctOpenDate(acctOpenDate);
		bal.setLastUpdateDate(lastUpdateDate);
		bal.setTIDSet(tid);
		bal.setUser(user);
		
		entitymanager.persist(bal);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
}
