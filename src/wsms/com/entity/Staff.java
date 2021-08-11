package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
	@Id
	private String empNo;
	private String surName, otherNames, sex, formMaster, placeOfBirth, nationality, maritalStatus, designation, 
		address, state, lga, village, email, phone1, phone2, disabled, ifDisabled, nextOfKin, specialization, 
		qualification, user;
	private LocalDate dob, dor, dateOfQualification;
	//constructors
	public Staff(String empNo, String surName, String otherNames, LocalDate dob, String sex, String formMaster, 
			String placeOfBirth, String nationality, String maritalStatus, String designation, String address,
			String state, String lga, String village, String email, String phone1, String phone2, 
			String disabled, String ifDisabled, String nextOfKin, LocalDate dor, String specialization, 
			String qualification, LocalDate dateOfQualification, String user) {
		super();
		this.empNo = empNo;
		this.surName = surName;
		this.otherNames = otherNames;
		this.dob = dob;
		this.sex = sex;
		this.formMaster = formMaster;
		this.placeOfBirth = placeOfBirth;
		this.nationality = nationality;
		this.maritalStatus = maritalStatus;
		this.designation = designation;
		this.address = address;
		this.state = state;
		this.lga = lga;
		this.village = village;
		this.email = email;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.disabled = disabled;
		this.ifDisabled = ifDisabled;
		this.nextOfKin = nextOfKin;
		this.dor = dor;
		this.specialization = specialization;
		this.qualification = qualification;
		this.dateOfQualification = dateOfQualification;
		this.user = user;
	}
	public Staff() {
		super();
	}
	
	//getters and setters
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getOtherNames() {
		return otherNames;
	}
	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getFormMaster() {
		return formMaster;
	}
	public void setFormMaster(String formMaster) {
		this.formMaster = formMaster;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLga() {
		return lga;
	}
	public void setLga(String lga) {
		this.lga = lga;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getDisabled() {
		return disabled;
	}
	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}
	public String getIfDisabled() {
		return ifDisabled;
	}
	public void setIfDisabled(String ifDisabled) {
		this.ifDisabled = ifDisabled;
	}
	public String getNextOfKin() {
		return nextOfKin;
	}
	public void setNextOfKin(String nextOfKin) {
		this.nextOfKin = nextOfKin;
	}
	public LocalDate getDor() {
		return dor;
	}
	public void setDor(LocalDate dor) {
		this.dor = dor;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public LocalDate getDateOfQualification() {
		return dateOfQualification;
	}
	public void setDateOfQualification(LocalDate dateOfQualification) {
		this.dateOfQualification = dateOfQualification;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
}
