package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Suspended {
	
	@Id
	private String sid;
	private String stdNo, surName, otherNames, reason, sex, borderStatus, stdClass, user, status;
	private LocalDate entryDate, suspUntilDate;
	
	public Suspended(String sid, String stdNo, String surName, String otherNames, String reason, String sex, 
			String borderStatus, String stdClass, String user, LocalDate entryDate, LocalDate suspUntilDate, 
			String status) {
		super();
		this.sid = sid;
		this.stdNo = stdNo;
		this.surName = surName;
		this.otherNames = otherNames;
		this.reason = reason;
		this.sex = sex;
		this.borderStatus = borderStatus;
		this.stdClass = stdClass;
		this.user = user;
		this.entryDate = entryDate;
		this.suspUntilDate = suspUntilDate;
		this.status = status;
	}
	public Suspended() {
		super();
	}
	
	//getters and setters
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	public String getStdNo() {
		return stdNo;
	}
	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getOtherNames() {
		return otherNames;
	}
	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBorderStatus() {
		return borderStatus;
	}
	public void setBorderStatus(String borderStatus) {
		this.borderStatus = borderStatus;
	}
	public String getStdClass() {
		return stdClass;
	}
	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
	public LocalDate getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}
	public LocalDate getSuspUntilDate() {
		return suspUntilDate;
	}
	public void setSuspUntilDate(LocalDate suspUntilDate) {
		this.suspUntilDate = suspUntilDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}

