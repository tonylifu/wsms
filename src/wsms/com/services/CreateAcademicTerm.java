package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.*;

public class CreateAcademicTerm {
	public void createAcademicTerm(String ATID, String session, String term, String user, String lastUpdateUser,
			LocalDate termBegins, LocalDate termEnds, LocalDate date, LocalDate dateLastUpdate, 
			int noWeeksInTerm, int noDaysInTerm, int noSchoolDays, int noHolyDays, int noDaysToday) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AcademicTerm at = new AcademicTerm();
		
		at.setATID(ATID);
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
		
		entitymanager.persist(at);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
}
