package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.*;

public class UpdateAcademicSession {
	public void updateAcademicSession(String yearId, String yearName, String description, LocalDate yearBegins,
			LocalDate yearEnds, LocalDate date, LocalDate lastUpdateDate, String user,
			String lastUpdateUser, int noOfDaysInYr, int noOfPossibleAttendanceYr) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AcademicSession year = entitymanager.find(AcademicSession.class, yearId);
		
		year.setYearName(yearName);
		year.setDescription(description);
		year.setYearBegins(yearBegins);
		year.setYearEnds(yearEnds);
		//year.setDate(date);
		year.setLastUpdateDate(lastUpdateDate);
		//year.setUser(user);
		year.setLastUpdateUser(lastUpdateUser);
		year.setNoOfDaysInYr(noOfDaysInYr);
		year.setNoOfPossibleAttendanceYr(noOfPossibleAttendanceYr);
			
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	public void updateAcadSession(String yearId, String lastUpdateUser, LocalDate lastUpdateDate, 
			int noOfPossibleAttendanceYr) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AcademicSession year = entitymanager.find(AcademicSession.class, yearId);
		
		year.setLastUpdateDate(lastUpdateDate);
		year.setLastUpdateUser(lastUpdateUser);
		year.setNoOfPossibleAttendanceYr(noOfPossibleAttendanceYr);
			
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
}
