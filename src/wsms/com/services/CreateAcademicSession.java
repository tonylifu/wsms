package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.*;

public class CreateAcademicSession {
	public void createAcademicSession(String yearId, String yearName, String description, LocalDate yearBegins,
			LocalDate yearEnds, LocalDate date, LocalDate lastUpdateDate, String user,
			String lastUpdateUser, int noOfDaysInYr, int noOfPossibleAttendanceYr) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AcademicSession year = new AcademicSession();
		
		year.setYearId(yearId);
		year.setYearName(yearName);
		year.setDescription(description);
		year.setYearBegins(yearBegins);
		year.setYearEnds(yearEnds);
		year.setDate(date);
		year.setLastUpdateDate(lastUpdateDate);
		year.setUser(user);
		year.setLastUpdateUser(lastUpdateUser);
		year.setNoOfDaysInYr(noOfDaysInYr);
		year.setNoOfPossibleAttendanceYr(noOfPossibleAttendanceYr);
		
		entitymanager.persist(year);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
}
