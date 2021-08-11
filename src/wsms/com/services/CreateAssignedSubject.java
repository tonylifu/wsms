package wsms.com.services;

import java.time.LocalDate;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import wsms.com.entity.AssignedSubjects;

public class CreateAssignedSubject {
	public void createAssignedSubject(String staffId, String surName, String otherNames, 
			LocalDate lastUpdateDate, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AssignedSubjects assign = new AssignedSubjects();
		
		assign.setStaffId(staffId);
		assign.setSurName(surName);
		assign.setOtherNames(otherNames);
		assign.setLastUpdateDate(lastUpdateDate);
		assign.setUser(user);
		
		entitymanager.persist(assign);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	public void addAssignedSubject(String staffId, String subjectCodeStr, String subjectName, 
			LocalDate lastUpdateDate, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AssignedSubjects assign = entitymanager.find(AssignedSubjects.class, staffId);
		
		assign.setSubjectCodeList(subjectCodeStr);
		assign.setSubjectList(subjectName);
		assign.setLastUpdateDate(lastUpdateDate);
		assign.setUser(user);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	public void removeAssignedSubject(String staffId, String subjectCodeStr, String subjectName, 
			LocalDate lastUpdateDate, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		AssignedSubjects assign = entitymanager.find(AssignedSubjects.class, staffId);
		
		if(assign.getSubjectCodeList().size() > 0) {
			assign.getSubjectCodeList().remove(subjectCodeStr);
			assign.getSubjectList().remove(subjectName);
			assign.setLastUpdateDate(lastUpdateDate);
			assign.setUser(user);
		}
		else {
			//
		}
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
}
