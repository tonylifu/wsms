package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.ChangeStdClass;

public class UpdateChangeStdClass {
	public void updateChangeStdClass(String stdClassId, String stdId, String name, String currentBorderStatus, String currentStdClass, 
			String year, String term, String newStdClass, String user, LocalDate entryDate) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		ChangeStdClass std = entitymanager.find(ChangeStdClass.class, stdClassId);
		
		std.setStdId(stdId);
		std.setCurrentStdClass(currentStdClass);
		std.setName(name);
		std.setCurrentBorderStatus(currentBorderStatus);
		std.setYear(year);
		std.setTerm(term);
		std.setNewStdClass(newStdClass);
		std.setUser(user);
		std.setEntryDate(entryDate);
		
		entitymanager.persist(std);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
}
