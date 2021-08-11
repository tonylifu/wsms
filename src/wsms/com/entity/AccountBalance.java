package wsms.com.entity;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountBalance {
	
	@Id
	private String stdNo;
	private String surName, otherNames, user;
	private LocalDate acctOpenDate, lastUpdateDate;
	private double balance;
	LinkedHashSet<String> TIDSet = new LinkedHashSet<>();
	
	public AccountBalance(String stdNo, String surName, String otherNames, double balance, 
			LinkedHashSet<String> TIDSet, LocalDate acctOpenDate, LocalDate lastUpdateDate, String user) {
		super();
		this.stdNo = stdNo;
		this.surName = surName;
		this.otherNames = otherNames;
		this.balance = balance;
		this.TIDSet = TIDSet;
		this.acctOpenDate = acctOpenDate;
		this.lastUpdateDate = lastUpdateDate;
		this.user = user;
	}
	public AccountBalance() {
		super();
	}
	
	//getters and setters
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
	
	public LinkedHashSet<String> getTIDSet() {
		return TIDSet;
	}
	public void setTIDSet(String TIDSet) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add(TIDSet);
		this.TIDSet.addAll(set);
	}
	public LocalDate getAcctOpenDate() {
		return acctOpenDate;
	}
	public void setAcctOpenDate(LocalDate acctOpenDate) {
		this.acctOpenDate = acctOpenDate;
	}
	public LocalDate getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(LocalDate lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
}
