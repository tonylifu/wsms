package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.*;

public class UpdateAcademicHoliday {
	public void updateAcademicHoliday(String ahid, String holidayName, String holidayDesc, String holidayType, 
			String year, String term, String user, String lastUpdUser, LocalDate holidayBegins, 
			LocalDate holidayEnds, LocalDate date, LocalDate lastUpdDate, int noHolidays) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AcademicHoliday holiday = entitymanager.find(AcademicHoliday.class, ahid);
		
		holiday.setHolidayName(holidayName);
		holiday.setHolidayDesc(holidayDesc);
		holiday.setHolidayType(holidayType);
		holiday.setYear(year);
		holiday.setTerm(term);
		holiday.setUser(user);
		holiday.setLastUpdUser(lastUpdUser);
		holiday.setHolidayBegins(holidayBegins);
		holiday.setHolidayEnds(holidayEnds);
		holiday.setDate(date);
		holiday.setLastUpdDate(lastUpdDate);
		holiday.setNoHolidays(noHolidays);
			
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
}
