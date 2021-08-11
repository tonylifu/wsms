package wsms.com.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AcademicHoliday {
	
	@Id
	private String ahid; // year + term + holidayname
	private String holidayName, holidayDesc, holidayType, year, term, user, lastUpdUser;
	private LocalDate holidayBegins, holidayEnds, date, lastUpdDate;
	private int noHolidays;
	
	public AcademicHoliday(String ahid, String holidayName, String holidayDesc, String holidayType, 
			String year, String term, String user, String lastUpdUser, LocalDate holidayBegins, 
			LocalDate holidayEnds, LocalDate date, LocalDate lastUpdDate, int noHolidays) {
		super();
	}
	
	public AcademicHoliday() {
		super();
	}
	
	//Getters and Setters
	public String getAhid() {
		return ahid;
	}

	public void setAhid(String ahid) {
		this.ahid = ahid;
	}

	public String getHolidayName() {
		return holidayName;
	}

	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}

	public String getHolidayDesc() {
		return holidayDesc;
	}

	public void setHolidayDesc(String holidayDesc) {
		this.holidayDesc = holidayDesc;
	}

	public String getHolidayType() {
		return holidayType;
	}

	public void setHolidayType(String holidayType) {
		this.holidayType = holidayType;
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

	public String getLastUpdUser() {
		return lastUpdUser;
	}

	public void setLastUpdUser(String lastUpdUser) {
		this.lastUpdUser = lastUpdUser;
	}

	public LocalDate getHolidayBegins() {
		return holidayBegins;
	}

	public void setHolidayBegins(LocalDate holidayBegins) {
		this.holidayBegins = holidayBegins;
	}

	public LocalDate getHolidayEnds() {
		return holidayEnds;
	}

	public void setHolidayEnds(LocalDate holidayEnds) {
		this.holidayEnds = holidayEnds;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalDate getLastUpdDate() {
		return lastUpdDate;
	}

	public void setLastUpdDate(LocalDate lastUpdDate) {
		this.lastUpdDate = lastUpdDate;
	}

	public int getNoHolidays() {
		return noHolidays;
	}

	public void setNoHolidays(int noHolidays) {
		this.noHolidays = noHolidays;
	}
}
