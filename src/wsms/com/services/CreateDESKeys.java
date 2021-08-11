package wsms.com.services;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.*;

public class CreateDESKeys implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public void createDESKeys(String userName, LinkedHashMap<String, SecretKey> keyVal, 
			LinkedHashMap<String, Cipher> ecipherVal, LinkedHashMap<String, Cipher> dcipherVal,
			String user, String updateUser, 
			LocalDateTime localDateTime, LocalDateTime lastUpdateTime) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		DESKeys keyz = new DESKeys();
		
		keyz.setUserName(userName);
		keyz.setKeyVal(keyVal);
		keyz.setEcipherVal(ecipherVal);
		keyz.setDcipherVal(dcipherVal);
		keyz.setUser(user);
		keyz.setUpdateUser(updateUser);
		keyz.setLocalDateTime(localDateTime);
		keyz.setLastUpdateTime(lastUpdateTime);
		
		entitymanager.persist(keyz);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	public void updateDESKeys(String userName, LinkedHashMap<String, SecretKey> keyVal, 
			LinkedHashMap<String, Cipher> ecipherVal, LinkedHashMap<String, Cipher> dcipherVal, 
			String updateUser, LocalDateTime lastUpdateTime) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		DESKeys keyz = entitymanager.find(DESKeys.class, userName);
		
		keyz.setKeyVal(keyVal);
		keyz.setEcipherVal(ecipherVal);
		keyz.setDcipherVal(dcipherVal);
		//keyz.setUser(user);
		keyz.setUpdateUser(updateUser);
		//keyz.setLocalDateTime(localDateTime);
		keyz.setLastUpdateTime(lastUpdateTime);
			
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	public void deleteDESKeys(String userName) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		DESKeys keyz = entitymanager.find(DESKeys.class, userName);
		
		entitymanager.remove(keyz);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
}
