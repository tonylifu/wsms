package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MoveClass2Class{
	@Id
	private String moveClassId;
	private String currentClass, newClass, user;
	private LocalDate entryDate;
	
	//constructors
	public MoveClass2Class(String moveClassId, String currentClass, String newClass, String user, LocalDate entryDate) {
		super();
		this.moveClassId = moveClassId;
		this.currentClass = currentClass;
		this.newClass = newClass;
		this.user = user;
		this.entryDate = entryDate;
	}
	
	public MoveClass2Class() {
		super();
	}

	//Getters and Setters

	public LocalDate getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMoveClassId() {
		return moveClassId;
	}

	public void setMoveClassId(String moveClassId) {
		this.moveClassId = moveClassId;
	}

	public String getCurrentClass() {
		return currentClass;
	}

	public void setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
	}

	public String getNewClass() {
		return newClass;
	}

	public void setNewClass(String newClass) {
		this.newClass = newClass;
	}

}
