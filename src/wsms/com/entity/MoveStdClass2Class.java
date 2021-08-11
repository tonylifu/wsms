package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MoveStdClass2Class{
	@Id
	private String moveStdClassId;
	private String stdId, currentClass, newClass, user;
	private LocalDate entryDate;
	
	//constructors
	public MoveStdClass2Class(String moveStdClassId, String stdId, String currentClass, String newClass, String user, LocalDate entryDate) {
		super();
		this.moveStdClassId = moveStdClassId;
		this.stdId = stdId;
		this.currentClass = currentClass;
		this.newClass = newClass;
		this.user = user;
		this.entryDate = entryDate;
	}
	
	public MoveStdClass2Class() {
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

	public String getMoveStdClassId() {
		return moveStdClassId;
	}

	public void setMoveStdClassId(String moveStdClassId) {
		this.moveStdClassId = moveStdClassId;
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

	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

}
