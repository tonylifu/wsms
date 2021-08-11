package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.ChangeBorderStatus;

public class DeleteChangeBorderStatus {
	public void deleteChangeBorderStatus(String changeBorderId) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		ChangeBorderStatus status = entitymanager.find(ChangeBorderStatus.class, changeBorderId);
	
		entitymanager.remove(status);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
