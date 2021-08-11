package wsms.com.services;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.Students;
import wsms.com.entity.Suspended;

public class CreateSuspended {
	
	public void createSuspended(String sid, String stdNo, String surName, String otherNames, String reason, String sex, 
			String borderStatus, String stdClass, String user, LocalDate entryDate, LocalDate suspUntilDate, String status) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Suspended susp = new Suspended();
		
		susp.setSid(sid);
		susp.setStdNo(stdNo);
		susp.setSurName(surName);
		susp.setOtherNames(otherNames);
		susp.setReason(reason);
		susp.setSex(sex);
		susp.setBorderStatus(borderStatus);
		susp.setStdClass(stdClass);
		susp.setUser(user);
		susp.setEntryDate(entryDate);
		susp.setSuspUntilDate(suspUntilDate);
		susp.setStatus(status);
		
		entitymanager.persist(susp);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//update students
	public void createSuspendedStdUpdate(String stdNo, String status, String user) {
		
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
