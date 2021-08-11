package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javafx.scene.control.TextField;
import wsms.com.entity.*;

public class DeleteStudent {
	public void deleteStudent(TextField id) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		String id2 = id.getText();
		
		Students std = entitymanager.find(Students.class, id2);
	
		entitymanager.remove(std);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
