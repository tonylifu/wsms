package wsms.com.services;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.Rusticated;
import wsms.com.entity.Students;

public class CreateRusticated {
	
	public void createRusticated(String rid, String stdNo, String surName, String otherNames, String reason, String sex, 
			String borderStatus, String stdClass, String user, LocalDate entryDate, String status) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Rusticated susp = new Rusticated();
		
		susp.setRid(rid);
		susp.setStdNo(stdNo);
		susp.setSurName(surName);
		susp.setOtherNames(otherNames);
		susp.setReason(reason);
		susp.setSex(sex);
		susp.setBorderStatus(borderStatus);
		susp.setStdClass(stdClass);
		susp.setUser(user);
		susp.setEntryDate(entryDate);
		susp.setStatus(status);
		
		entitymanager.persist(susp);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//update students
	public void createRusticatedStdUpdate(String stdNo, String status, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Students std = entitymanager.find(Students.class, stdNo);
		
		std.setStatus(status);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
}
