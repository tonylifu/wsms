package wsms.com.services;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.AccountBalance;

public class UpdateAccountBalance {
	
	public void updateAccountBalance(String stdNo, double balance, LocalDate lastUpdateDate, String tid,
			String user) {
		
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
	
	//update new account at creation of patients
	public void updateAccountBalancePatient(String stdNo, String surName, String otherNames, 
			double balance, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AccountBalance bal = entitymanager.find(AccountBalance.class, stdNo);
		
		bal.setSurName(surName);
		bal.setOtherNames(otherNames);
		bal.setUser(user);
		
		entitymanager.persist(bal);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
}
