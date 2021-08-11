package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javafx.scene.control.ComboBox;
import wsms.com.entity.Users;

public class DeleteUser {
	public void deleteUser(ComboBox<String> userName) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		String id = userName.getValue().toUpperCase();
		Users user = entitymanager.find(Users.class, id);
		entitymanager.remove(user);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	public void deleteUser(String id) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Users user = entitymanager.find(Users.class, id);
		entitymanager.remove(user);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}

}
