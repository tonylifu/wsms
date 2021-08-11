package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class SpoolStdListDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty studentID_Data, name_Data, sex_Data, age_Data,
		stdClass_Data, parent_Data, phone_Data, email_Data;
	
	public SpoolStdListDataTable(String sNo, String studentID, String name, String sex, String age, 
			String stdClass, String parent, String phone, String email) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.studentID_Data = new SimpleStringProperty(studentID);
		this.name_Data = new SimpleStringProperty(name);
		this.sex_Data = new SimpleStringProperty(sex);
		this.age_Data = new SimpleStringProperty(age);
		this.stdClass_Data = new SimpleStringProperty(stdClass);
		this.parent_Data = new SimpleStringProperty(parent);
		this.phone_Data = new SimpleStringProperty(phone);
		this.email_Data = new SimpleStringProperty(email);
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
	
	public String getStdClass_Data() {
		return stdClass_Data.get();
	}
	
	public void setStdClass_Data(String stdClass) {
		stdClass_Data.set(stdClass);
	}
	
	public String getParent_Data() {
		return parent_Data.get();
	}
	public void setParent_Data(String parent) {
		parent_Data.set(parent);
	}
	
	public String getPhone_Data() {
		return phone_Data.get();
	}
	public void setPhone_Data(String phone) {
		phone_Data.set(phone);
	}
	
	public String getEmail_Data() {
		return email_Data.get();
	}
	public void setEmail_Data(String email) {
		email_Data.set(email);
	}
}
