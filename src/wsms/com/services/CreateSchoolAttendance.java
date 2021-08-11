package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.*;

public class CreateSchoolAttendance {
	public void createSchoolAttendance(String saId, String stdId, String name, String stdClass, 
			String year, String term, String user, String lastUpdateUser, boolean isPresent, 
			int presents, int absents, int termlyPossible, int termlyPossibleCurrent, 
			LocalDate attendanceDate, LocalDate date, LocalDate lastUpdateDate) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		SchoolAttendance attend = new SchoolAttendance();
		
		attend.setSaId(saId);
		attend.setStdId(stdId);
		attend.setName(name);
		attend.setStdClass(stdClass);
		attend.setYear(year);
		attend.setTerm(term);
		attend.setUser(user);
		attend.setLastUpdateUser(lastUpdateUser);
		attend.setIsPresent(isPresent);
		attend.setPresents(presents);
		attend.setAbsents(absents);
		attend.setTermlyPossible(termlyPossible);
		attend.setTermlyPossibleCurrent(termlyPossibleCurrent);
		attend.setAttendanceDate(attendanceDate);
		attend.setDate(date);
		attend.setLastUpdateDate(lastUpdateDate);
		
		entitymanager.persist(attend);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
}
