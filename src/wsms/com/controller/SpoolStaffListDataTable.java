package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class SpoolStaffListDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty staffEmpNo_Data, name_Data, sex_Data, age_Data, maritalStatus_Data, 
		qualification_Data, specialization_Data, phone_Data, email_Data, nextOfKin_Data;
	
	public SpoolStaffListDataTable(String sNo, String staffEmpNo, String name, String sex, String age, 
			String maritalStatus, String qualification, String specialization, String phone, String email, 
			String nextOfKin) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.staffEmpNo_Data = new SimpleStringProperty(staffEmpNo);
		this.name_Data = new SimpleStringProperty(name);
		this.sex_Data = new SimpleStringProperty(sex);
		this.age_Data = new SimpleStringProperty(age);
		this.maritalStatus_Data = new SimpleStringProperty(maritalStatus);
		this.qualification_Data = new SimpleStringProperty(qualification);
		this.specialization_Data = new SimpleStringProperty(specialization);
		this.phone_Data = new SimpleStringProperty(phone);
		this.email_Data = new SimpleStringProperty(email);
		this.nextOfKin_Data = new SimpleStringProperty(nextOfKin);
	}

	public String getSNo_Data() {
		return sNo_Data.get();
	}
	public void setSNo_Data(String sNo) {
		sNo_Data.set(sNo);
	}
	
	public String getStaffEmpNo_Data() {
		return staffEmpNo_Data.get();
	}
	public void setStaffEmpNo_Data(String staffEmpNo) {
		staffEmpNo_Data.set(staffEmpNo);
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
	
	public String getMaritalStatus_Data() {
		return maritalStatus_Data.get();
	}
	
	public void setMaritalStatus_Data(String maritalStatus) {
		maritalStatus_Data.set(maritalStatus);
	}
	
	public String getQualification_Data() {
		return qualification_Data.get();
	}
	public void setQualification_Data(String qualification) {
		qualification_Data.set(qualification);
	}
	
	public String getSpecialization_Data() {
		return specialization_Data.get();
	}
	public void setSpecialization_Data(String specialization) {
		specialization_Data.set(specialization);
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
	
	public String getNextOfKin_Data() {
		return nextOfKin_Data.get();
	}
	public void setNextOfKin_Data(String nextOfKin) {
		nextOfKin_Data.set(nextOfKin);
	}
}
