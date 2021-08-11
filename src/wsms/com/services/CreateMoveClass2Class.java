package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.MoveClass2Class;

public class CreateMoveClass2Class {
	public void createMoveClass2Class(String moveClassId, String currentClass, String newClass, String user, LocalDate entryDate) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		MoveClass2Class move = new MoveClass2Class();
		
		move.setMoveClassId(moveClassId);
		move.setCurrentClass(currentClass);
		move.setNewClass(newClass);
		move.setUser(user);
		move.setEntryDate(entryDate);
		
		entitymanager.persist(move);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
}
