package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.ChangeBorderStatus;

public class UpdateChangeBorderStatus {
	public void updateChangeBorderStatus(String changeBorderId, String stdId, String name, String stdClass, String currentBorderStatus,
			String year, String term, String newBorderStatus, String user, LocalDate entryDate) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		ChangeBorderStatus border = entitymanager.find(ChangeBorderStatus.class, changeBorderId);
		
		border.setStdId(stdId);
		border.setStdClass(stdClass);
		border.setName(name);
		border.setCurrentBorderStatus(currentBorderStatus);
		border.setYear(year);
		border.setTerm(term);
		border.setNewBorderStatus(newBorderStatus);
		border.setUser(user);
		border.setEntryDate(entryDate);
		
		entitymanager.persist(border);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
}
