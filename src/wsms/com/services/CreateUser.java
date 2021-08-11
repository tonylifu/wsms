package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import wsms.com.entity.Users;

public class CreateUser {
	public void createUser(String userName, TextField userStaffID, TextField name, String password, 
			ComboBox<String> userClass, TextField dept) {
		EntityManagerFactory emfactory = 
				Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Users user = new Users();
		
		user.setUserName(userName.toUpperCase());
		user.setUserStaffID(userStaffID.getText());
		user.setName(name.getText());
		user.setPassword(password);
		user.setUserClass(userClass.getValue());
		user.setDept(dept.getText());
		
		entitymanager.persist(user);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}

}
