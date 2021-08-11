package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class AssignStdToClassDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty stdId_Data, name_Data, sex_Data, age_Data, border_Data, balance_Data;
	
	public AssignStdToClassDataTable(String sNo, String stdId, String name, String sex, String age, 
			String border, String balance) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.stdId_Data = new SimpleStringProperty(stdId);
		this.name_Data = new SimpleStringProperty(name);
		this.sex_Data = new SimpleStringProperty(sex);
		this.age_Data = new SimpleStringProperty(age);
		this.border_Data = new SimpleStringProperty(border);
		this.balance_Data = new SimpleStringProperty(balance);
	}

	public String getSNo_Data() {
		return sNo_Data.get();
	}
	public void setSNo_Data(String sNo) {
		sNo_Data.set(sNo);
	}
	
	public String getStdId_Data() {
		return stdId_Data.get();
	}
	public void setStdId_Data(String stdId) {
		stdId_Data.set(stdId);
	}
	
	public String getName_Data() {
		return name_Data.get();
	}
	public void setName_Data(String name) {
		name_Data.set(name);
	}
	
	public String getSex_Data() {
		return sex_Data.get();
	}
	public void setSex_Data(String sex) {
		sex_Data.set(sex);
	}
	
	public String getAge_Data() {
		return age_Data.get();
	}
	public void setAge_Data(String age) {
		age_Data.set(age);
	}
	
	public String getBorder_Data() {
		return border_Data.get();
	}
	public void setBorder_Data(String border) {
		border_Data.set(border);
	}
	
	public String getBalance_Data() {
		return balance_Data.get();
	}
	public void setBalance_Data(String balance) {
		balance_Data.set(balance);
	}
}
