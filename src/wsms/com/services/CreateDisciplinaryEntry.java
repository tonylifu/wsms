package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.DisciplinaryEntry;

public class CreateDisciplinaryEntry {
	
	public void createDisciplinary(String stdNo, String text, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		DisciplinaryEntry disc = entitymanager.find(DisciplinaryEntry.class, stdNo);
		
		disc.setDcTextFlow(text);
		disc.setUser(user);
		
		entitymanager.persist(disc);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//Create new disc at creation of std
	public void createDisciplinaryEntryStudent(String stdNo, String surName, String otherNames, String age, String sex, 
			String borderStatus, String stdClass, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		DisciplinaryEntry disc = new DisciplinaryEntry();
		
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
	
	//update disciplinary entry
	public void updateDisciplinaryEntryStudent(String stdNo, String surName, String otherNames, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		DisciplinaryEntry disc = entitymanager.find(DisciplinaryEntry.class, stdNo);
		
		disc.setSurName(surName);
		disc.setOtherNames(otherNames);
		disc.setUser(user);
		
		entitymanager.persist(disc);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
}
