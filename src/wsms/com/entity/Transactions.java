package wsms.com.entity;

import java.text.DecimalFormat;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transactions {
	@Id
	private String TID;
	private String stdNo;
	private String accountName, depWithdrawal, txnCode;
	//private long txnSeqNo;
	private String amount, availableBalance, credits, debits, user;
	private LocalDate txnDate;
	//private LinkedList<String> txnSeqNoSet = new LinkedList<>();
	
	//constructors
	public Transactions(String TID, String stdNo, String accountName, String depWithdrawal,
			String txnCode, LocalDate txnDate, String amount,
			String availableBalance, String credits, String debits, String user) {
		super();
		this.TID = TID;
		this.stdNo = stdNo;
		this.accountName = accountName;
		this.depWithdrawal = depWithdrawal;
		this.txnCode = txnCode;
		this.txnDate = txnDate;
		this.amount = amount;
		this.availableBalance = availableBalance;
		this.credits = credits;
		this.debits = debits;
		this.user = user;
	}
	public Transactions() {
		super();
	}
	
	//getters and setters
	public String getTID() {
		return TID;
	}
	public void setTID(String TID) {
		this.TID = TID;
	}
//	public long getTxnSeqNo() {
//		return txnSeqNo;
//	}
//	public void setTxnSeqNo(long txnSeqNo) {
//		this.txnSeqNo = txnSeqNo;
//	}
	public String getAccountNumber() {
		return stdNo;
	}
	public void setAccountNumber(String stdNo) {
		this.stdNo = stdNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getDepWithdrawal() {
		return depWithdrawal;
	}
	public void setDepWithdrawal(String depWithdrawal) {
		this.depWithdrawal = depWithdrawal;
	}
	public String getTxnCode() {
		return txnCode;
	}
	public void setTxnCode(String txnCode) {
		this.txnCode = txnCode;
	}
	public LocalDate getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(LocalDate txnDate) {
		this.txnDate = txnDate;
	}
	DecimalFormat fmt = new DecimalFormat("#.00");
	public String getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = fmt.format(amount);
	}
	public String getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = fmt.format(availableBalance);
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
