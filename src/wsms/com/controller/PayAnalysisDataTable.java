package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class PayAnalysisDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty stdNo_Data, stdName_Data, payType_Data, credit_Data, debit_Data, 
		desc_Data, date_Data;
	
	public PayAnalysisDataTable(String sNo, String stdNo, String stdName, String payType, String credit, 
			String debit, String desc, String date) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.stdNo_Data = new SimpleStringProperty(stdNo);
		this.stdName_Data = new SimpleStringProperty(stdName);
		this.payType_Data = new SimpleStringProperty(payType);
		this.credit_Data = new SimpleStringProperty(credit);
		this.debit_Data = new SimpleStringProperty(debit);
		this.desc_Data = new SimpleStringProperty(desc);
		this.date_Data = new SimpleStringProperty(date);
	}

	public String getSNo_Data() {
		return sNo_Data.get();
	}
	public void setSNo_Data(String sNo) {
		sNo_Data.set(sNo);
	}
	
	public String getStdNo_Data() {
		return stdNo_Data.get();
	}
	public void setStdNo_Data(String stdNo) {
		stdNo_Data.set(stdNo);
	}
	
	public String getStdName_Data() {
		return stdName_Data.get();
	}
	public void setStdName_Data(String stdName) {
		stdName_Data.set(stdName);
	}
	public String getPayType_Data() {
		return payType_Data.get();
	}
	public void setPayType_Data(String payType) {
		payType_Data.set(payType);
	}
	
	public String getCredit_Data() {
		return credit_Data.get();
	}
	
	public void setCredit_Data(String credit) {
		credit_Data.set(credit);
	}
	
	public String getDebit_Data() {
		return debit_Data.get();
	}
	
	public void setDebit_Data(String debit) {
		debit_Data.set(debit);
	}
	
	public String getDesc_Data() {
		return desc_Data.get();
	}
	
	public void setDesc_Data(String desc) {
		desc_Data.set(desc);
	}
	
	public String getDate_Data() {
		return date_Data.get();
	}
	
	public void setDate_Data(String date) {
		date_Data.set(date);
	}
}
