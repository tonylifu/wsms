package wsms.com.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BarcodeScannedSpecial {
	
	@Id
	private String bsId;
	private String stdNo;
	private String surName, otherNames, user;
	private LocalDate date;
	private LocalDateTime dateTime;
	private double balance;
	private String stdClass, status, reason;
	
	public BarcodeScannedSpecial(String bsId, String stdNo, String surName, String otherNames, double balance, 
			LocalDate date, LocalDateTime dateTime, String user, String stdClass, String status, String reason) {
		super();
		this.bsId = bsId;
		this.stdNo = stdNo;
		this.surName = surName;
		this.otherNames = otherNames;
		this.balance = balance;
		this.date = date;
		this.dateTime = dateTime;
		this.stdClass = stdClass;
		this.status = status;
		this.reason = reason;
		this.user = user;
	}
	public BarcodeScannedSpecial() {
		super();
	}
	
	public String getBsId() {
		return bsId;
	}
	public void setBsId(String bsId) {
		this.bsId = bsId;
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
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public String getStdClass() {
		return stdClass;
	}
	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
