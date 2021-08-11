package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.DisciplinaryEntry;

public class DeleteDisciplinaryEntry {
	public void deleteDisciplinaryEntry(String stdNo) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		DisciplinaryEntry std = entitymanager.find(DisciplinaryEntry.class, stdNo);
	
		entitymanager.remove(std);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//delete text
	public void deleteDisciplinaryEntryText(String stdNo, String text) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		DisciplinaryEntry std = entitymanager.find(DisciplinaryEntry.class, stdNo);
		
		std.getDcTextFlow().remove(text);
	
		//entitymanager.remove(patient);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
