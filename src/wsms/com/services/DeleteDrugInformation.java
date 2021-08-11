package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.DrugInformation;

public class DeleteDrugInformation {
	public void deleteDrugInformation(String itemIdNo) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		DrugInformation drug = entitymanager.find(DrugInformation.class, itemIdNo);
	
		entitymanager.remove(drug);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
