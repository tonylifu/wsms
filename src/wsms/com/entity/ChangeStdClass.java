package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ChangeStdClass{
	@Id
	private String stdClassId;
	private String stdId, name, currentBorderStatus, currentStdClass, year, term, newStdClass, user;
	private LocalDate entryDate;
	
	//constructors
	public ChangeStdClass(String stdClassId, String stdId, String name, String currentBorderStatus, String currentStdClass, 
			String year, String term, String newStdClass, String user, LocalDate entryDate) {
		super();
		this.stdClassId = stdClassId;
		this.stdId = stdId;
		this.name = name;
		this.currentStdClass = currentStdClass;
		this.currentBorderStatus = currentBorderStatus;
		this.year = year;
		this.term = term;
		this.newStdClass = newStdClass;
		this.user = user;
		this.entryDate = entryDate;
	}
	
	public ChangeStdClass() {
		super();
	}

	//Getters and Setters
	public String getStdClassId() {
		return stdClassId;
	}

	public void setStdClassId(String stdClassId) {
		this.stdClassId = stdClassId;
	}

	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrentStdClass() {
		return currentStdClass;
	}

	public void setCurrentStdClass(String currentStdClass) {
		this.currentStdClass = currentStdClass;
	}

	public String getCurrentBorderStatus() {
		return currentBorderStatus;
	}

	public void setCurrentBorderStatus(String currentBorderStatus) {
		this.currentBorderStatus = currentBorderStatus;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getNewStdClass() {
		return newStdClass;
	}

	public void setNewStdClass(String newStdClass) {
		this.newStdClass = newStdClass;
	}

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

}
