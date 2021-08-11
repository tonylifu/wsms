package wsms.com.entity;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentPayments {
	@Id
	private String paymentId; //stdId + receiptNo
	private String stdId_fin;
	private String stdName_fin, description_fin, paymentBy, receivedBy;
	private LocalDate date_fin;
	private double totalPaymentDue, actualPaymentMade, balanceDue, virtualTotalDue;
	private int stdClass_fin, stdTerm_fin;
	private String academicYear_fin, user;
	private LinkedHashSet<String> receiptNoSet = new LinkedHashSet<>();
	
	//constructors
	public StudentPayments(String paymentId, String stdId_fin, String stdName_fin, String description_fin,
			String paymentBy, String receivedBy, LocalDate date_fin, double totalPaymentDue, String academicYear_fin,
			double actualPaymentMade, double balanceDue, int stdClass_fin, int stdTerm_fin,
			LinkedHashSet<String> receiptNoSet, double virtualTotalDue, String user) {
		super();
		this.paymentId = paymentId;
		this.stdId_fin = stdId_fin;
		this.stdName_fin = stdName_fin;
		this.description_fin = description_fin;
		this.paymentBy = paymentBy;
		this.receivedBy = receivedBy;
		this.date_fin = date_fin;
		this.totalPaymentDue = totalPaymentDue;
		this.actualPaymentMade = actualPaymentMade;
		this.balanceDue = balanceDue;
		this.academicYear_fin = academicYear_fin;
		this.stdClass_fin = stdClass_fin;
		this.stdTerm_fin = stdTerm_fin;
		this.receiptNoSet = receiptNoSet;
		this.virtualTotalDue = virtualTotalDue;
		this.user = user;
	}
	public StudentPayments() {
		super();
	}
	
	//Getters and Setters
	public String getPaymentId() {
		return paymentId;
	}
	public void SetPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getStdId_fin() {
		return stdId_fin;
	}
	public void setStdId_fin(String stdId_fin) {
		this.stdId_fin = stdId_fin;
	}
	public String getStdName_fin() {
		return stdName_fin;
	}
	public void setStdName_fin(String stdName_fin) {
		this.stdName_fin = stdName_fin;
	}
	public String getDescription_fin() {
		return description_fin;
	}
	public void setDescription_fin(String description_fin) {
		this.description_fin = description_fin;
	}
	public String getPaymentBy() {
		return paymentBy;
	}
	public void setPaymentBy(String paymentBy) {
		this.paymentBy = paymentBy;
	}
	public String getReceivedBy() {
		return receivedBy;
	}
	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}
	public LocalDate getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(LocalDate date_fin) {
		this.date_fin = date_fin;
	}
	public double getTotalPaymentDue() {
		return totalPaymentDue;
	}
	public void setTotalPaymentDue(double totalPaymentDue) {
		this.totalPaymentDue = totalPaymentDue;
	}
	public double getActualPaymentMade() {
		return actualPaymentMade;
	}
	public void setActualPaymentMade(double actualPaymentMade) {
		this.actualPaymentMade = actualPaymentMade;
	}
	public double getBalanceDue() {
		return balanceDue;
	}
	public void setBalanceDue(double balanceDue) {
		this.balanceDue = balanceDue;
	}
	
	public int getStdClass_fin() {
		return stdClass_fin;
	}
	public void setStdClass_fin(int stdClass_fin) {
		this.stdClass_fin = stdClass_fin;
	}
	public int getStdTerm_fin() {
		return stdTerm_fin;
	}
	public void setStdTerm_fin(int stdTerm_fin) {
		this.stdTerm_fin = stdTerm_fin;
	}
	public String getAcademicYear_fin() {
		return academicYear_fin;
	}
	public void setAcademicYear_fin(String academicYear_fin) {
		this.academicYear_fin = academicYear_fin;
	}
	public LinkedHashSet<String> getReceiptNoSet() {
		return receiptNoSet;
	}
	public void setReceiptNoSet(String receiptNo) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add(receiptNo);
		this.receiptNoSet.addAll(set);
	}
	public double getVirtualTotalDue() {
		return virtualTotalDue;
	}
	public void setVirtualTotalDue(double virtualTotalDue) {
		this.virtualTotalDue = virtualTotalDue;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "[PaymentID: "+paymentId+", StdID: "+stdId_fin+", stdName: "+stdName_fin+"\n"+
				"Description: "+description_fin+", PaymentBy: "+paymentBy+", ReceivedBy: "+receivedBy+"\n"+
				"Date: "+date_fin+", TotalPaymentDue: "+totalPaymentDue+", Actual Payments: "+actualPaymentMade+"\n"+
				"Balance Due: "+balanceDue+"]";
	}

}
