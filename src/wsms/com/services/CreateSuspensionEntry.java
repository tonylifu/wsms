package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.SuspensionEntry;

public class CreateSuspensionEntry {
	
	public void createSuspension(String stdNo, String text, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		SuspensionEntry susp = entitymanager.find(SuspensionEntry.class, stdNo);
		
		susp.setSuspendTextFlow(text);
		susp.setUser(user);
		
		//entitymanager.persist(susp);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//Create new susp creation of stds
	public void createSuspensionEntryStudent(String stdNo, String surName, String otherNames, String age, String sex, 
			String borderStatus, String stdClass, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		SuspensionEntry disc = new SuspensionEntry();
		
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
	
	//update suspension entry
	public void updateSuspensionEntryStudent(String stdNo, String surName, String otherNames, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		SuspensionEntry disc = entitymanager.find(SuspensionEntry.class, stdNo);
		
		disc.setSurName(surName);
		disc.setOtherNames(otherNames);
		disc.setUser(user);
		
		entitymanager.persist(disc);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
}
