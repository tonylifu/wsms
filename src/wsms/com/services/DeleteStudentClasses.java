package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.StudentClasses;

public class DeleteStudentClasses {
	public void deleteStudentClasses(String classId) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		StudentClasses classes = entitymanager.find(StudentClasses.class, classId);
	
		//entitymanager.remove(classes);
		classes.setStatus("InActive");
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
