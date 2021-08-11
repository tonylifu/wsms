package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rusticated {
	
	@Id
	private String rid;
	private String stdNo, surName, otherNames, reason, sex, borderStatus, stdClass, user, status;
	private LocalDate entryDate;
	
	public Rusticated(String rid, String stdNo, String surName, String otherNames, String reason, String sex, 
			String borderStatus, String stdClass, String user, LocalDate entryDate,	String status) {
		super();
		this.rid = rid;
		this.stdNo = stdNo;
		this.surName = surName;
		this.otherNames = otherNames;
		this.reason = reason;
		this.sex = sex;
		this.borderStatus = borderStatus;
		this.stdClass = stdClass;
		this.user = user;
		this.entryDate = entryDate;
		this.status = status;
	}
	public Rusticated() {
		super();
	}
	
	//getters and setters
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
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

