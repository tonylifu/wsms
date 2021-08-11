package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.StudentClasses;

public class UpdateStudentClasses {
	public void updateStudentClasses(String classId, String classNo, String classLetter, String year, String term,
			String user, LocalDate entryDate) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		StudentClasses classes = entitymanager.find(StudentClasses.class, classId);
		
		classes.setClassNo(classNo);
		classes.setClassLetter(classLetter);
		classes.setYear(year);
		classes.setTerm(term);
		//classes.setClassCostList(classCostList);
		classes.setUser(user);
		classes.setEntryDate(entryDate);
		classes.setStatus("Active");
		
		entitymanager.persist(classes);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
}
