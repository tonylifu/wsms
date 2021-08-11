package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.RusticateEntry;

public class DeleteRusticateEntry {
	public void deleteRusticateEntry(String stdNo) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		RusticateEntry std = entitymanager.find(RusticateEntry.class, stdNo);
	
		entitymanager.remove(std);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//delete text
	public void deleteRusticateEntryText(String stdNo, String text) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		RusticateEntry std = entitymanager.find(RusticateEntry.class, stdNo);
		
		std.getRusticateTextFlow().remove(text);
	
		//entitymanager.remove(patient);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
