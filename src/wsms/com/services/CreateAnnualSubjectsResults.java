package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.*;

public class CreateAnnualSubjectsResults {
	public void createAnnualSubjectsResults(String aRId, String stdNo, String name, String subjectName, String stdClass, 
			String session, String position, String grade, String remark, int subjectCode, double firstTerm,
			double secondTerm, double thirdTerm, double total, double annualAvg,
			double classHighest, double classLowest, LocalDate date, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AnnualSubjectsResults subject = new AnnualSubjectsResults();
		
		subject.setARId(aRId);
		subject.setStdNo(stdNo);
		subject.setName(name);
		subject.setSubjectName(subjectName);
		subject.setStdClass(stdClass);
		subject.setSession(session);
		subject.setPosition(position);
		subject.setGrade(grade);
		subject.setRemark(remark);
		subject.setSubjectCode(subjectCode);
		subject.setFirstTerm(firstTerm);
		subject.setSecondTerm(secondTerm);
		subject.setThirdTerm(thirdTerm);
		subject.setTotal(total);
		subject.setAnnualAvg(annualAvg);
		subject.setClassHighest(classHighest);
		subject.setClassLowest(classLowest);
		subject.setDate(date);
		subject.setUser(user);
		
		entitymanager.persist(subject);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	public void updateAnnualSubjectsResults(String aRId, String stdNo, String name, String subjectName, String stdClass, 
			String session, String position, String grade, String remark, int subjectCode, double firstTerm,
			double secondTerm, double thirdTerm, double total, double annualAvg,
			double classHighest, double classLowest, LocalDate date, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AnnualSubjectsResults subject = entitymanager.find(AnnualSubjectsResults.class, aRId);
		
		subject.setStdNo(stdNo);
		subject.setName(name);
		subject.setSubjectName(subjectName);
		subject.setStdClass(stdClass);
		subject.setSession(session);
		subject.setPosition(position);
		subject.setGrade(grade);
		subject.setRemark(remark);
		subject.setSubjectCode(subjectCode);
		subject.setFirstTerm(firstTerm);
		subject.setSecondTerm(secondTerm);
		subject.setThirdTerm(thirdTerm);
		subject.setTotal(total);
		subject.setAnnualAvg(annualAvg);
		subject.setClassHighest(classHighest);
		subject.setClassLowest(classLowest);
		subject.setDate(date);
		subject.setUser(user);
			
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
}
