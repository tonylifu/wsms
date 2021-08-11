package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.CommendationEntry;

public class DeleteCommendationEntry {
	public void deleteCommendationEntry(String stdNo) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		CommendationEntry std = entitymanager.find(CommendationEntry.class, stdNo);
	
		entitymanager.remove(std);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//delete text
	public void deleteCommendationEntryText(String stdNo, String text) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		CommendationEntry std = entitymanager.find(CommendationEntry.class, stdNo);
		
		std.getCommendTextFlow().remove(text);
	
		//entitymanager.remove(patient);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
