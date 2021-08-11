package wsms.com.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AcademicTerm {
	
	@Id
	private String ATID; // year+term
	private String session, term, user, lastUpdateUser;
	private LocalDate termBegins, termEnds, date, dateLastUpdate;
	private int noWeeksInTerm, noDaysInTerm, noSchoolDays, 
		noHolyDays, noDaysToday;
	
	public AcademicTerm(String ATID, String session, String term, String user, String lastUpdateUser,
			LocalDate termBegins, LocalDate termEnds, LocalDate date, LocalDate dateLastUpdate, 
			int noWeeksInTerm, int noDaysInTerm, int noSchoolDays, int noHolyDays, int noDaysToday) {
		super();
		this.ATID = ATID; 
		this.session = session;
		this.term = term;
		this.user = user;
		this.lastUpdateUser = lastUpdateUser;
		this.termBegins = termBegins;
		this.termEnds = termEnds;
		this.date = date;
		this.dateLastUpdate = dateLastUpdate;
		this.noWeeksInTerm = noWeeksInTerm;
		this.noDaysInTerm = noDaysInTerm;
		this.noSchoolDays = noSchoolDays;
		this.noHolyDays = noHolyDays;
		this.noDaysToday = noDaysToday;
	}
	
	public AcademicTerm() {
		super();
	}

	public String getATID() {
		return ATID;
	}

	public void setATID(String aTID) {
		ATID = aTID;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
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

	public LocalDate getTermBegins() {
		return termBegins;
	}

	public void setTermBegins(LocalDate termBegins) {
		this.termBegins = termBegins;
	}

	public LocalDate getTermEnds() {
		return termEnds;
	}

	public void setTermEnds(LocalDate termEnds) {
		this.termEnds = termEnds;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalDate getDateLastUpdate() {
		return dateLastUpdate;
	}

	public void setDateLastUpdate(LocalDate dateLastUpdate) {
		this.dateLastUpdate = dateLastUpdate;
	}

	public int getNoWeeksInTerm() {
		return noWeeksInTerm;
	}

	public void setNoWeeksInTerm(int noWeeksInTerm) {
		this.noWeeksInTerm = noWeeksInTerm;
	}

	public int getNoDaysInTerm() {
		return noDaysInTerm;
	}

	public void setNoDaysInTerm(int noDaysInTerm) {
		this.noDaysInTerm = noDaysInTerm;
	}

	public int getNoSchoolDays() {
		return noSchoolDays;
	}

	public void setNoSchoolDays(int noSchoolDays) {
		this.noSchoolDays = noSchoolDays;
	}

	public int getNoHolyDays() {
		return noHolyDays;
	}

	public void setNoHolyDays(int noHolyDays) {
		this.noHolyDays = noHolyDays;
	}

	public int getNoDaysToday() {
		return noDaysToday;
	}

	public void setNoDaysToday(int noDaysToday) {
		this.noDaysToday = noDaysToday;
	}

}
