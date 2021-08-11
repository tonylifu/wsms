package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FeeConcession {
	@Id
	private String cid;
	private String stdNo, name, sex, stdClassId, session, term, user, lastUpdateUser, 
		concessionStatus, aoi;
	private double balAtConcession, amtPay, updBalance;
	private int graceDaysGiven, graceDaysRemains;
	private LocalDate date, expectedPayDate, lastUpdPayDate;
	
	//constructors
	public FeeConcession(String cid, String stdNo, String name, String sex, String stdClassId, 
			String session, String term, String user, String lastUpdateUser, 
			String concessionStatus, String aoi, double balAtConcession, double amtPay, 
			double updBalance, int graceDaysGiven, int graceDaysRemains, 
			LocalDate date, LocalDate expectedPayDate, LocalDate lastUpdPayDate) {
		super();
		this.cid = cid;
		this.stdNo = stdNo;
		this.name = name;
		this.sex = sex;
		this.stdClassId = stdClassId;
		this.session = session;
		this.term = term;
		this.user = user;
		this.lastUpdateUser = lastUpdateUser;
		this.concessionStatus = concessionStatus;
		this.aoi = aoi;
		this.balAtConcession = balAtConcession;
		this.amtPay = amtPay;
		this.updBalance = updBalance;
		this.graceDaysGiven = graceDaysGiven;
		this.graceDaysRemains = graceDaysRemains;
		this.date = date;
		this.expectedPayDate = expectedPayDate;
		this.lastUpdPayDate = lastUpdPayDate;
	}
	public FeeConcession() {
		super();
	}
	
	//Getters and Setters
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getStdNo() {
		return stdNo;
	}
	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getStdClassId() {
		return stdClassId;
	}
	public void setStdClassId(String stdClassId) {
		this.stdClassId = stdClassId;
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
	public String getConcessionStatus() {
		return concessionStatus;
	}
	public void setConcessionStatus(String concessionStatus) {
		this.concessionStatus = concessionStatus;
	}
	public String getAoi() {
		return aoi;
	}
	public void setAoi(String aoi) {
		this.aoi = aoi;
	}
	public double getBalAtConcession() {
		return balAtConcession;
	}
	public void setBalAtConcession(double balAtConcession) {
		this.balAtConcession = balAtConcession;
	}
	public double getAmtPay() {
		return amtPay;
	}
	public void setAmtPay(double amtPay) {
		this.amtPay = amtPay;
	}
	public double getUpdBalance() {
		return updBalance;
	}
	public void setUpdBalance(double updBalance) {
		this.updBalance = updBalance;
	}
	public int getGraceDaysGiven() {
		return graceDaysGiven;
	}
	public void setGraceDaysGiven(int graceDaysGiven) {
		this.graceDaysGiven = graceDaysGiven;
	}
	public int getGraceDaysRemains() {
		return graceDaysRemains;
	}
	public void setGraceDaysRemains(int graceDaysRemains) {
		this.graceDaysRemains = graceDaysRemains;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalDate getExpectedPayDate() {
		return expectedPayDate;
	}
	public void setExpectedPayDate(LocalDate expectedPayDate) {
		this.expectedPayDate = expectedPayDate;
	}
	public LocalDate getLastUpdPayDate() {
		return lastUpdPayDate;
	}
	public void setLastUpdPayDate(LocalDate lastUpdPayDate) {
		this.lastUpdPayDate = lastUpdPayDate;
	}
	
	
}
