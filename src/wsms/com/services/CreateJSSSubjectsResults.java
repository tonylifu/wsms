package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.*;

public class CreateJSSSubjectsResults {
	public void createJSSSubjectsResults(String rId, String stdNo, String name, String subjectName, String stdClass, String term, 
		String session, String position, String grade, String remark, int subjectCode, double CA1,
		double CA2, double CA3, double CA4, double CA5, double CA6, double exam, double total, double classAvg,
		double classHighest, double classLowest, LocalDate date, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		JSSSubjectsResults subject = new JSSSubjectsResults();
		
		subject.setRId(rId);
		subject.setStdNo(stdNo);
		subject.setName(name);
		subject.setSubjectName(subjectName);
		subject.setStdClass(stdClass);
		subject.setTerm(term);
		subject.setSession(session);
		subject.setPosition(position);
		subject.setGrade(grade);
		subject.setRemark(remark);
		subject.setSubjectCode(subjectCode);
		subject.setCA1(CA1);
		subject.setCA2(CA2);
		subject.setCA3(CA3);
		subject.setCA4(CA4);
		subject.setCA5(CA5);
		subject.setCA6(CA6);
		subject.setExam(exam);
		subject.setTotal(total);
		subject.setClassAvg(classAvg);
		subject.setClassHighest(classHighest);
		subject.setClassLowest(classLowest);
		subject.setDate(date);
		subject.setUser(user);
		
		entitymanager.persist(subject);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	public void updateJSSSubjectsResults(String rId, String stdNo, String name, String subjectName, String stdClass, String term, 
		String session, String position, String grade, String remark, int subjectCode, double CA1,
		double CA2, double CA3, double CA4, double CA5, double CA6, double exam, double total, double classAvg,
		double classHighest, double classLowest, LocalDate date, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		JSSSubjectsResults subject = entitymanager.find(JSSSubjectsResults.class, rId);
		
		subject.setStdNo(stdNo);
		subject.setName(name);
		subject.setSubjectName(subjectName);
		subject.setStdClass(stdClass);
		subject.setTerm(term);
		subject.setSession(session);
		subject.setPosition(position);
		subject.setGrade(grade);
		subject.setRemark(remark);
		subject.setSubjectCode(subjectCode);
		subject.setCA1(CA1);
		subject.setCA2(CA2);
		subject.setCA3(CA3);
		subject.setCA4(CA4);
		subject.setCA5(CA5);
		subject.setCA6(CA6);
		subject.setExam(exam);
		subject.setTotal(total);
		subject.setClassAvg(classAvg);
		subject.setClassHighest(classHighest);
		subject.setClassLowest(classLowest);
		subject.setDate(date);
		subject.setUser(user);
			
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
}
