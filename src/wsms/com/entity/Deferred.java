package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Deferred {
	@Id
	private String did;
	private String setId, stdNo;
	private String stdName, setYear, stdClass, user;
	private double outstandingBal;
	private LocalDate txnDate;
	
	//constructors
	public Deferred(String did, String setId, String stdNo, String stdName, String setYear, String stdClass, 
			double outstandingBal, LocalDate txnDate, String user) {
		super();
		this.did = did;
		this.setId = setId;
		this.stdNo = stdNo;		
		this.stdName = stdName;
		this.setYear = setYear;
		this.stdClass = stdClass;
		this.outstandingBal = outstandingBal;
		this.txnDate = txnDate;
		this.user = user;
	}
	public Deferred() {
		super();
	}
	
	//getters and setters
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	
	public String getSetId() {
		return setId;
	}
	public void setSetId(String setId) {
		this.setId = setId;
	}
	
	public String getStdNo() {
		return stdNo;
	}
	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getSetYear() {
		return setYear;
	}
	public void setSetYear(String setYear) {
		this.setYear = setYear;
	}
	public String getStdClass() {
		return stdClass;
	}
	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
	public double getOutstandingBal() {
		return outstandingBal;
	}
	public void setOutstandingBal(double outstandingBal) {
		this.outstandingBal = outstandingBal;
	}
	public LocalDate getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(LocalDate txnDate) {
		this.txnDate = txnDate;
	}
}
