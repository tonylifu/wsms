package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AcademicAssessment {
	
	@Id
	private String aid; // year + term + assessname
	private String assessName, assessDesc, assessType, year, term, user, lastUpdUser;
	private LocalDate assessBegins, assessEnds, date, lastUpdDate;
	
	public AcademicAssessment(String aid, String assessName, String assessDesc, String assessType, 
			String year, String term, String user, String lastUpdUser, LocalDate assessBegins, 
			LocalDate assessEnds, LocalDate date, LocalDate lastUpdDate) {
		super();
	}
	
	public AcademicAssessment() {
		super();
	}
	
	//Getters and Setters
	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getAssessName() {
		return assessName;
	}

	public void setAssessName(String assessName) {
		this.assessName = assessName;
	}

	public String getAssessDesc() {
		return assessDesc;
	}

	public void setAssessDesc(String assessDesc) {
		this.assessDesc = assessDesc;
	}

	public String getAssessType() {
		return assessType;
	}

	public void setAssessType(String assessType) {
		this.assessType = assessType;
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

	public LocalDate getAssessBegins() {
		return assessBegins;
	}

	public void setAssessBegins(LocalDate assessBegins) {
		this.assessBegins = assessBegins;
	}

	public LocalDate getAssessEnds() {
		return assessEnds;
	}

	public void setAssessEnds(LocalDate assessEnds) {
		this.assessEnds = assessEnds;
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

}
