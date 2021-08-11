package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javafx.scene.control.TextField;
import wsms.com.entity.*;

public class DeleteSubjects {
	public void deleteSubject(TextField id) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		String id2 = id.getText();
		int id3 = Integer.parseInt(id2);
		
		SubjectNames subj = entitymanager.find(SubjectNames.class, id3);
		entitymanager.remove(subj);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
