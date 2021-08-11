package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.SuspensionEntry;

public class DeleteSuspensionEntry {
	public void deleteSuspensionEntry(String stdNo) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		SuspensionEntry std = entitymanager.find(SuspensionEntry.class, stdNo);
	
		entitymanager.remove(std);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//delete text
	public void deleteSuspensionEntryText(String stdNo, String text) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		SuspensionEntry std = entitymanager.find(SuspensionEntry.class, stdNo);
		
		std.getSuspendTextFlow().remove(text);
	
		//entitymanager.remove(patient);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
