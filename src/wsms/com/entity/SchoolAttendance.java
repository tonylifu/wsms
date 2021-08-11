package wsms.com.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SchoolAttendance {
	
	@Id
	private String saId; //stdId + year + term + date
	private String stdId, name, stdClass, year, term, user, lastUpdateUser;
	private boolean isPresent;
	private int presents, absents, termlyPossible, termlyPossibleCurrent;
	private LocalDate attendanceDate, date, lastUpdateDate;
	
	public SchoolAttendance(String saId, String stdId, String name, String stdClass, 
			String year, String term, String user, String lastUpdateUser, boolean isPresent, 
			int presents, int absents, int termlyPossible, int termlyPossibleCurrent, 
			LocalDate attendanceDate, LocalDate date, LocalDate lastUpdateDate) {
		super();
		this.saId = saId;
		this.stdId = stdId;
		this.name = name;
		this.stdClass = stdClass;
		this.year = year;
		this.term = term;
		this.user = user;
		this.lastUpdateUser = lastUpdateUser;
		this.isPresent = isPresent;
		this.presents = presents;
		this.absents = absents;
		this.termlyPossible = termlyPossible;
		this.termlyPossibleCurrent = termlyPossibleCurrent;
		this.attendanceDate = attendanceDate;
		this.date = date;
		this.lastUpdateDate = lastUpdateDate;
	}
	
	public SchoolAttendance() {
		super();
	}
	
	//Getters and Setters
	public String getSaId() {
		return saId;
	}

	public void setSaId(String saId) {
		this.saId = saId;
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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getLastUpdateUser() {
		return lastUpdateUser;
	}

	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}

	public boolean getIsPresent() {
		return isPresent;
	}

	public void setIsPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	public int getPresents() {
		return presents;
	}

	public void setPresents(int presents) {
		this.presents = presents;
	}

	public int getAbsents() {
		return absents;
	}

	public void setAbsents(int absents) {
		this.absents = absents;
	}

	public int getTermlyPossible() {
		return termlyPossible;
	}

	public void setTermlyPossible(int termlyPossible) {
		this.termlyPossible = termlyPossible;
	}

	public int getTermlyPossibleCurrent() {
		return termlyPossibleCurrent;
	}

	public void setTermlyPossibleCurrent(int termlyPossibleCurrent) {
		this.termlyPossibleCurrent = termlyPossibleCurrent;
	}

	public LocalDate getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(LocalDate attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalDate getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(LocalDate lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

}
