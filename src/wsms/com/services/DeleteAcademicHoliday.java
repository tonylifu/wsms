package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.AcademicHoliday;

public class DeleteAcademicHoliday {
	public void deleteAcademicHoliday(String ahid) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AcademicHoliday holiday = entitymanager.find(AcademicHoliday.class, ahid);
	
		entitymanager.remove(holiday);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
