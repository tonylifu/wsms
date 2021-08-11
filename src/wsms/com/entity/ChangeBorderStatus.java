package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ChangeBorderStatus{
	@Id
	private String changeBorderId;
	private String stdId, name, stdClass, currentBorderStatus, year, term, newBorderStatus, user;
	private LocalDate entryDate;
	
	//constructors
	public ChangeBorderStatus(String changeBorderId, String stdId, String name, String stdClass, String currentBorderStatus,
			String year, String term, String newBorderStatus, String user, LocalDate entryDate) {
		super();
		this.changeBorderId = changeBorderId;
		this.stdId = stdId;
		this.name = name;
		this.stdClass = stdClass;
		this.currentBorderStatus = currentBorderStatus;
		this.year = year;
		this.term = term;
		this.newBorderStatus = newBorderStatus;
		this.user = user;
		this.entryDate = entryDate;
	}
	
	public ChangeBorderStatus() {
		super();
	}

	//Getters and Setters
	public String getChangeBorderId() {
		return changeBorderId;
	}

	public void setChangeBorderId(String changeBorderId) {
		this.changeBorderId = changeBorderId;
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

	public String getStdClass() {
		return stdClass;
	}

	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
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

	public String getNewBorderStatus() {
		return newBorderStatus;
	}

	public void setNewBorderStatus(String newBorderStatus) {
		this.newBorderStatus = newBorderStatus;
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
