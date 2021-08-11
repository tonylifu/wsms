package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.RusticateEntry;

public class CreateRusticateEntry {
	
	public void createRusticate(String stdNo, String text, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		RusticateEntry rust = entitymanager.find(RusticateEntry.class, stdNo);
		
		rust.setRusticateTextFlow(text);
		rust.setUser(user);
		
		entitymanager.persist(rust);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//Create new rustication entry at creation of std
	public void createRusticateEntryStudent(String stdNo, String surName, String otherNames, String age, String sex, 
			String borderStatus, String stdClass, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		RusticateEntry disc = new RusticateEntry();
		
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
	
	//update rustication entry
	public void updateRusticateEntryStudent(String stdNo, String surName, String otherNames, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		RusticateEntry disc = entitymanager.find(RusticateEntry.class, stdNo);
		
		disc.setSurName(surName);
		disc.setOtherNames(otherNames);
		disc.setUser(user);
		
		entitymanager.persist(disc);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
}
