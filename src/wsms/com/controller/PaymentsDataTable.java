package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class PaymentsDataTable {
	@FXML private SimpleStringProperty descriptionPay_Data, paymentPay_Data,
		payByPay_Data, receivedByPay_Data, receiptNoPay_Data, datePay_Data, totalPayDue_Data;
	
	public PaymentsDataTable(String descriptionPay, String paymentPay,
			String payByPay, String receivedByPay, String receiptNoPay, String datePay, String totalPayDue) {
		//this.namePay_Data = new SimpleStringProperty(namePay);
		this.descriptionPay_Data = new SimpleStringProperty(descriptionPay);
		this.paymentPay_Data = new SimpleStringProperty(paymentPay);
		this.totalPayDue_Data = new SimpleStringProperty(totalPayDue);
		this.payByPay_Data = new SimpleStringProperty(payByPay);
		this.receivedByPay_Data = new SimpleStringProperty(receivedByPay);
		this.receiptNoPay_Data = new SimpleStringProperty(receiptNoPay);
		this.datePay_Data = new SimpleStringProperty(datePay);
	}
	
//	public String getNamePay_Data() {
//		return namePay_Data.get();
//	}
//	public void setNamePay_Data(String namePay) {
//		namePay_Data.set(namePay);
//	}
	
	public String getDescriptionPay_Data() {
		return descriptionPay_Data.get();
	}
	public void setDescriptionPay_Data(String descriptionPay) {
		descriptionPay_Data.set(descriptionPay);
	}
	
	public String getPaymentPay_Data() {
		return paymentPay_Data.get();
	}
	public void setPaymentPay_Data(String paymentPay) {
		paymentPay_Data.set(paymentPay);
	}
	
	public String getTotalPayDue_Data() {
		return totalPayDue_Data.get();
	}
	public void setTotalPayDue_Data(String totalPayDue) {
		totalPayDue_Data.set(totalPayDue);
	}
	
	public String getPayByPay_Data() {
		return payByPay_Data.get();
	}
	public void setPayByPay_Data(String payByPay) {
		payByPay_Data.set(payByPay);
	}
	
	public String getReceivedByPay_Data() {
		return receivedByPay_Data.get();
	}
	public void setReceivedByPay_Data(String receivedByPay) {
		receivedByPay_Data.set(receivedByPay);
	}
	
	public String getReceiptNoPay_Data() {
		return receiptNoPay_Data.get();
	}
	public void setReceiptNoPay_Data(String receiptNoPay) {
		receiptNoPay_Data.set(receiptNoPay);
	}
	
	public String getDatePay_Data() {
		return datePay_Data.get();
	}
	public void setDatePay_Data(String datePay) {
		datePay_Data.set(datePay);
	}
}
