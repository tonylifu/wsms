package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.*;

public class CreateAnnualClassResults {
	public void createAnnualClassResults(String aRId, String stdNo, String name, String sex, String stdClass, 
			String session, String position, int noInClass, int noDaysInTerm, int noDaysPresent, int noDaysAbsent, 
			int age, LocalDate date, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AnnualClassResults result = new AnnualClassResults();
		
		result.setARId(aRId);
		result.setStdNo(stdNo);
		result.setName(name);
		result.setSex(sex);
		result.setStdClass(stdClass);
		result.setSession(session);
		result.setPosition(position);
		result.setNoInClass(noInClass);
		result.setNoDaysInTerm(noDaysInTerm);
		result.setNoDaysPresent(noDaysPresent);
		result.setNoDaysAbsent(noDaysAbsent);
		result.setAge(age);
		result.setDate(date);
		result.setUser(user);
		
		entitymanager.persist(result);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	public void updateAnnualClassResults(String aRId, String stdNo, String name, String sex, String stdClass, 
			String session, String position, int noInClass, int noDaysInTerm, int noDaysPresent, int noDaysAbsent, 
			int age, LocalDate date, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AnnualClassResults result = entitymanager.find(AnnualClassResults.class, aRId);
		
		result.setStdNo(stdNo);
		result.setName(name);
		result.setSex(sex);
		result.setStdClass(stdClass);
		result.setSession(session);
		result.setPosition(position);
		result.setNoInClass(noInClass);
		result.setNoDaysInTerm(noDaysInTerm);
		result.setNoDaysPresent(noDaysPresent);
		result.setNoDaysAbsent(noDaysAbsent);
		result.setAge(age);
		result.setDate(date);
		result.setUser(user);
			
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
}
