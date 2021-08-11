package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.Staff;

public class DeleteStaff {
	public void deleteStaff(String id) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Staff staff = entitymanager.find(Staff.class, id);
	
		entitymanager.remove(staff);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
