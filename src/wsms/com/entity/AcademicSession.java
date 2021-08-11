package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AcademicSession {
	
	@Id
	private String yearId; // year
	private String yearName, description, user, lastUpdateUser;
	private LocalDate yearBegins, yearEnds, date, lastUpdateDate;
	private int noOfDaysInYr, noOfPossibleAttendanceYr;
	
	public AcademicSession(String yearId, String yearName, String description, LocalDate yearBegins,
			LocalDate yearEnds, LocalDate date, LocalDate lastUpdateDate, String user,
			String lastUpdateUser, int noOfDaysInYr, int noOfPossibleAttendanceYr) {
		super();
		this.yearId = yearId;
		this.yearName = yearName;
		this.description = description;
		this.user = user;
		this.lastUpdateUser = lastUpdateUser;
		this.yearBegins = yearBegins;
		this.yearEnds = yearEnds;
		this.date = date;
		this.lastUpdateDate = lastUpdateDate;
		this.noOfDaysInYr = noOfDaysInYr;
		this.noOfPossibleAttendanceYr = noOfPossibleAttendanceYr;
	}
	
	public AcademicSession() {
		super();
	}
	
	//Getters and Setters
	public String getYearId() {
		return yearId;
	}

	public void setYearId(String yearId) {
		this.yearId = yearId;
	}

	public String getYearName() {
		return yearName;
	}

	public void setYearName(String yearName) {
		this.yearName = yearName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public LocalDate getYearBegins() {
		return yearBegins;
	}

	public void setYearBegins(LocalDate yearBegins) {
		this.yearBegins = yearBegins;
	}

	public LocalDate getYearEnds() {
		return yearEnds;
	}

	public void setYearEnds(LocalDate yearEnds) {
		this.yearEnds = yearEnds;
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

	public int getNoOfDaysInYr() {
		return noOfDaysInYr;
	}

	public void setNoOfDaysInYr(int noOfDaysInYr) {
		this.noOfDaysInYr = noOfDaysInYr;
	}

	public int getNoOfPossibleAttendanceYr() {
		return noOfPossibleAttendanceYr;
	}

	public void setNoOfPossibleAttendanceYr(int noOfPossibleAttendanceYr) {
		this.noOfPossibleAttendanceYr = noOfPossibleAttendanceYr;
	}

}
