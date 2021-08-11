package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class PayHistRptDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty studentID_Data, name_Data, description_Data, amount_Data,
		balance_Data, pid_Data, date_Data;
	
	public PayHistRptDataTable(String sNo, String studentID, String name, String description, String amount, 
			String balance, String pid, String date) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.studentID_Data = new SimpleStringProperty(studentID);
		this.name_Data = new SimpleStringProperty(name);
		this.description_Data = new SimpleStringProperty(description);
		this.amount_Data = new SimpleStringProperty(amount);
		this.balance_Data = new SimpleStringProperty(balance);
		this.pid_Data = new SimpleStringProperty(pid);
		this.date_Data = new SimpleStringProperty(date);
	}

	public String getSNo_Data() {
		return sNo_Data.get();
	}
	public void setSNo_Data(String sNo) {
		sNo_Data.set(sNo);
	}
	
	public String getStudentID_Data() {
		return studentID_Data.get();
	}
	public void setStudentID_Data(String studentID) {
		studentID_Data.set(studentID);
	}
	
	public String getName_Data() {
		return name_Data.get();
	}
	public void setName_Data(String name) {
		name_Data.set(name);
	}
	
	public String getDescription_Data() {
		return description_Data.get();
	}
	public void setDescription_Data(String description) {
		description_Data.set(description);
	}
	public String getAmount_Data() {
		return amount_Data.get();
	}
	public void setTotalScores_Data(String amount) {
		amount_Data.set(amount);
	}
	
	public String getBalance_Data() {
		return balance_Data.get();
	}
	
	public void setBalance_Data(String balance) {
		balance_Data.set(balance);
	}
	
	public String getPid_Data() {
		return pid_Data.get();
	}
	public void setPid_Data(String pid) {
		pid_Data.set(pid);
	}
	
	public String getDate_Data() {
		return date_Data.get();
	}
	public void setDate_Data(String date) {
		date_Data.set(date);
	}
}
