package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.*;

public class UpdateAcademicAssessment {
	public void updateAcademicAssessment(String aid, String assessName, String assessDesc, String assessType, 
			String year, String term, String user, String lastUpdUser, LocalDate assessBegins, 
			LocalDate assessEnds, LocalDate date, LocalDate lastUpdDate) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AcademicAssessment assess = entitymanager.find(AcademicAssessment.class, aid);
		
		assess.setAssessName(assessName);
		assess.setAssessDesc(assessDesc);
		assess.setAssessType(assessType);
		assess.setYear(year);
		assess.setTerm(term);
		assess.setUser(user);
		assess.setLastUpdUser(lastUpdUser);
		assess.setAssessBegins(assessBegins);
		assess.setAssessEnds(assessEnds);
		assess.setDate(date);
		assess.setLastUpdDate(lastUpdDate);
			
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
}
