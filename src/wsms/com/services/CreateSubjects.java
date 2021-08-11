package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import wsms.com.entity.*;

public class CreateSubjects {
	public void createSubject(TextField subjectId, ComboBox<String> subjectName, TextField teacher) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		SubjectNames std = new SubjectNames();
		std.setSubjectCode(Integer.parseInt(subjectId.getText()));
		std.setSubjectName(subjectName.getValue());
		std.setTeacher(teacher.getText());		
		
		entitymanager.persist(std);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	

}
