package wsms.com.entity;

import java.text.DecimalFormat;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TillTransactions {
	@Id
	private String TTID;
	//private long txnSeqNo;
	private String credits, debits, balance;
	private String customerAcctNo, tillAcctNo;
	private String customerAcctName, tillAcctName, user;
	private LocalDate txnDate;
	//private LinkedList<String> txnSeqNoSet = new LinkedList<>();
	
	//Constructors
	public TillTransactions(String TTID, String credits, String debits, String balance,
			String customerAcctNo, String tillAcctNo, String tillAcctName, String customerAcctName, 
			LocalDate txnDate, String user) {
		super();
		this.TTID = TTID;
		this.credits = credits;
		this.debits = debits;
		this.balance = balance;
		this.customerAcctNo = customerAcctNo;
		this.tillAcctNo = tillAcctNo;
		this.tillAcctName = tillAcctName;
		this.customerAcctName = customerAcctName;
		this.txnDate = txnDate;
		this.user = user;
	}
	public TillTransactions() {
		super();
	}
	//getters and setters
	public String getTTID() {
		return TTID;
	}
	public void setTTID(String TTID) {
		this.TTID = TTID;
	}
	
	DecimalFormat fmt = new DecimalFormat("#.00");
	public String getTillAcctNo() {
		return tillAcctNo;
	}
	public void setTillAcctNo(String tillAcctNo) {
		this.tillAcctNo = tillAcctNo;
	}
	public String getTillAcctName() {
		return tillAcctName;
	}
	public void setTillAcctName(String tillAcctName) {
		this.tillAcctName = tillAcctName;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = fmt.format(credits);
	}
	public String getDebits() {
		return debits;
	}
	public void setDebits(double debits) {
		this.debits = fmt.format(debits);
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = fmt.format(balance);
	}
	public String getCustomerAcctNo() {
		return customerAcctNo;
	}
	public void setCustomerAcctNo(String customerAcctNo) {
		this.customerAcctNo = customerAcctNo;
	}
	public String getCustomerAcctName() {
		return customerAcctName;
	}
	public void setCustomerAcctName(String customerAcctName) {
		this.customerAcctName = customerAcctName;
	}
	public LocalDate getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(LocalDate txnDate) {
		this.txnDate = txnDate;
	}
//	public long getTxnSeqNo() {
//		return txnSeqNo;
//	}
//	public void setTxnSeqNo(long txnSeqNo) {
//		this.txnSeqNo = txnSeqNo;
//	}
//	public LinkedList<String> getTxnSeqNoSet() {
//		return txnSeqNoSet;
//	}
//	public void setTxnSeqNoSet(String txnSeqNoSet) {
//		LinkedList<String> set = new LinkedList<String>();
//		set.add(txnSeqNoSet);
//		this.txnSeqNoSet.addAll(set);
//	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

}
