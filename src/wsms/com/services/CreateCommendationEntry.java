package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.CommendationEntry;

public class CreateCommendationEntry {
	
	public void createCommendation(String stdNo, String text, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		CommendationEntry commend = entitymanager.find(CommendationEntry.class, stdNo);
		
		commend.setCommendTextFlow(text);
		commend.setUser(user);
		
		entitymanager.persist(commend);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//Create new commendation at creation of patients
	public void createCommendationEntryStudent(String stdNo, String surName, String otherNames, String age, String sex, 
			String borderStatus, String stdClass, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		CommendationEntry disc = new CommendationEntry();
		
		disc.setStdNo(stdNo);
		disc.setSurName(surName);
		disc.setOtherNames(otherNames);
		disc.setAge(age);
		disc.setSex(sex);
		disc.setBorderStatus(borderStatus);
		disc.setStdClass(stdClass);
		disc.setUser(user);
		
		entitymanager.persist(disc);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//update commendation entry
	public void updateCommendationEntryStudent(String stdNo, String surName, String otherNames, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		CommendationEntry disc = entitymanager.find(CommendationEntry.class, stdNo);
		
		disc.setSurName(surName);
		disc.setOtherNames(otherNames);
		disc.setUser(user);
		
		entitymanager.persist(disc);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
}
