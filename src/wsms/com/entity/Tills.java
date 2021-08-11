package wsms.com.entity;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tills {
	@Id
	private String tillAcctNo;
	private String tillName, tillUser, tillAcctClassification, tillCategory;
	private LocalDate txnDate;
	private double balance;
	private LinkedHashSet<String> TTIDSet = new LinkedHashSet<>();
	
	public Tills(String tillAcctNo, String tillName, double balance, String tillUser, 
			String tillAcctClassification, String tillCategory, LocalDate txnDate, 
			LinkedHashSet<String> TTIDSet) {
		super();
		this.tillAcctNo = tillAcctNo;
		this.tillName = tillName;
		this.balance = balance;
		this.tillUser = tillUser;
		this.txnDate = txnDate;
		this.TTIDSet = TTIDSet;
		this.tillAcctClassification = tillAcctClassification;
		this.tillCategory = tillCategory;
	}
	public Tills() {
		super();
	}
	
	public String getTillAcctNo() {
		return tillAcctNo;
	}
	public void setTillAcctNo(String tillAcctNo) {
		this.tillAcctNo = tillAcctNo;
	}
	public String getTillName() {
		return tillName;
	}
	public void setTillName(String tillName) {
		this.tillName = tillName;
	}
	public String getTillUser() {
		return tillUser;
	}
	public void setTillUser(String tillUser) {
		this.tillUser = tillUser;
	}
	
	public LocalDate getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(LocalDate txnDate) {
		this.txnDate = txnDate;
	}
	public LinkedHashSet<String> getTTIDSet() {
		return TTIDSet;
	}
	public void setTTIDSet(String TTID) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add(TTID);
		this.TTIDSet.addAll(set);
	}
	public String getTillAcctClassification() {
		return tillAcctClassification;
	}
	public void setTillAcctClassification(String tillAcctClassification) {
		this.tillAcctClassification = tillAcctClassification;
	}
	public String getTillCategory() {
		return tillCategory;
	}
	public void setTillCategory(String tillCategory) {
		this.tillCategory = tillCategory;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
