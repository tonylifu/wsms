package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.*;

public class UpdateAcademicTerm {
	public void updateAcademicTerm(String ATID, String session, String term, String user, String lastUpdateUser,
			LocalDate termBegins, LocalDate termEnds, LocalDate date, LocalDate dateLastUpdate, 
			int noWeeksInTerm, int noDaysInTerm, int noSchoolDays, int noHolyDays, int noDaysToday) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AcademicTerm at = entitymanager.find(AcademicTerm.class, ATID);
		
		at.setSession(session);
		at.setTerm(term);
		at.setUser(user);
		at.setLastUpdateUser(lastUpdateUser);
		at.setTermBegins(termBegins);
		at.setTermEnds(termEnds);
		at.setDate(date);
		at.setDateLastUpdate(dateLastUpdate);
		at.setNoWeeksInTerm(noWeeksInTerm);
		at.setNoDaysInTerm(noDaysInTerm);
		at.setNoSchoolDays(noSchoolDays);
		at.setNoHolyDays(noHolyDays);
		at.setNoDaysToday(noDaysToday);
			
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	public void updateAcademicTermHols(String ATID, String lastUpdateUser, LocalDate dateLastUpdate, 
			int noSchoolDays, int noHolyDays) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AcademicTerm at = entitymanager.find(AcademicTerm.class, ATID);
		
		at.setLastUpdateUser(lastUpdateUser);
		at.setDateLastUpdate(dateLastUpdate);
		at.setNoSchoolDays(noSchoolDays);
		at.setNoHolyDays(noHolyDays);
			
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
}
