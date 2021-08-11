package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.MoveStdClass2Class;

public class CreateMoveStdClass2Class {
	public void createMoveStdClass2Class(String moveStdClassId, String stdId, String currentClass, String newClass, String user, 
			LocalDate entryDate) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		MoveStdClass2Class move = new MoveStdClass2Class();
		
		move.setMoveStdClassId(moveStdClassId);
		move.setStdId(stdId);
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
