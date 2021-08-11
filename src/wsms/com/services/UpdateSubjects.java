package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import wsms.com.entity.SubjectNames;

public class UpdateSubjects {
	public void updateSubjects(TextField subjectIdTF, ComboBox<String> subjectNameTF, TextField teacherNameTF) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		String id = subjectIdTF.getText();
		int id2 = Integer.parseInt(id);
		
		SubjectNames subj = entitymanager.find(SubjectNames.class, id2);
		subj.setSubjectName(subjectNameTF.getValue());
		subj.setTeacher(teacherNameTF.getText());
		
		entitymanager.persist(subj);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}

}
