package wsms.com.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

@Entity

public class Students{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String id;

	private String entryClassAssigned;
	private LinkedHashSet<String> scores_sId = new LinkedHashSet<>();
	private LinkedHashSet<String> paymentIdSet = new LinkedHashSet<>();
	private LinkedHashSet<String> summaryIdSet = new LinkedHashSet<>();
	private LinkedHashSet<String> annualSummaryIdSet = new LinkedHashSet<>();
	private LinkedHashSet<String> annualScoresTotalIdSet = new LinkedHashSet<>();
	private String surName, otherNames, placeOfBirth, nationality, state, lga, village, address,
	fatherName, fatherPhone, fatherOccupation, fatherReligion, motherName, motherPhone, motherOccupation,
	motherReligion, guardianName, guardianPhone, guardianOccupation, guardianReligion, previousSchool,
	lastClass, classSeeking, classOffered, ifDisabled, ICE, status;
	private String sex, disability, email, user, entryBorderStatus;
	private LocalDate dateOfBirth;
	private LocalDate dateOfReg;
	
//	@ManyToOne(targetEntity=Students.class)
//	private StudentClasses studentClasses;
	
	//constructors
	public Students(String id, LinkedHashSet<String> scores_sId, String disability, String surName, String otherNames, LocalDate dateOfBirth, 
			String placeOfBirth,String sex,String nationality, String state, String lga, String village, 
			String address, String fatherName, String fatherPhone, String fatherOccupation, 
			String fatherReligion, String motherName, String motherPhone, String motherOccupation,
			String motherReligion, String guardianName, String guardianPhone, 
			String guardianOccupation, String guardianReligion, String previousSchool,
			String lastClass, String classSeeking, String classOffered, String ifDisabled, 
			String ICE, LocalDate dateOfReg, LinkedHashSet<String> paymentIdSet, String email, 
			String user, LinkedHashSet<String> summaryIdSet, LinkedHashSet<String> annualSummaryIdSet,
			LinkedHashSet<String> annualScoresTotalIdSet, String entryClassAssigned, String entryBorderStatus, String status) {
		super();
		this.id = id;
		this.scores_sId = scores_sId;
		this.surName = surName;
		this.disability = disability;
		this.otherNames = otherNames;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.sex = sex;
		this.nationality = nationality;
		this.state = state;
		this.lga = lga;
		this.village = village;
		this.address = address;
		this.fatherName = fatherName;
		this.fatherPhone = fatherPhone;
		this.fatherOccupation = fatherOccupation;
		this.fatherReligion = fatherReligion;
		this.motherName = motherName;
		this.motherPhone = motherPhone;
		this.motherOccupation = motherOccupation;
		this.motherReligion = motherReligion;
		this.guardianName = guardianName;
		this.guardianPhone = guardianPhone;
		this.guardianOccupation = guardianOccupation;
		this.guardianReligion = guardianReligion;
		this.previousSchool = previousSchool;
		this.lastClass = lastClass;
		this.classSeeking = classSeeking;
		this.classOffered = classOffered;
		this.ifDisabled = ifDisabled;
		this.ICE = ICE;
		this.dateOfReg = dateOfReg;
		this.paymentIdSet = paymentIdSet;
		this.summaryIdSet = summaryIdSet;
		this.annualSummaryIdSet = annualSummaryIdSet;
		this.annualScoresTotalIdSet = annualScoresTotalIdSet;
		this.email = email;
		this.user = user;
		this.entryClassAssigned = entryClassAssigned;
		this.entryBorderStatus = entryBorderStatus;
		this.status = status;
	}
	
	public Students() {
		super();
	}
	
	public String getId() {
		return id;
	}
	public void setId(TextField id) {
		String id2 = id.getText().trim().toUpperCase();
		this.id = id2;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(TextField surName) {
		String sName = surName.getText().trim().toUpperCase();
		this.surName = sName;
	}

	public String getOtherNames() {
		return otherNames;
	}

	public void setOtherNames(TextField otherNames) {
		String oNames = otherNames.getText().trim().toUpperCase();
		this.otherNames = oNames;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(TextField placeOfBirth) {
		String pob = placeOfBirth.getText();
		this.placeOfBirth = pob;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(ComboBox<String> sexTF) {
		String sex = (String) sexTF.getValue();
		this.sex = sex;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(ComboBox<String> nationalityTF) {
		String nat = nationalityTF.getValue();
		this.nationality = nat;
	}

	public String getState() {
		return state;
	}

	public void setState(ComboBox<String> stateTF) {
		String state = stateTF.getValue();
		this.state = state;
	}

	public String getLga() {
		return lga;
	}

	public void setLga(ComboBox<String> lgaTF) {
		String lga = lgaTF.getValue();
		this.lga = lga;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(TextField villageTF) {
		String village = villageTF.getText();
		this.village = village;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(TextArea addressTF) {
		String address = addressTF.getText();
		this.address = address;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(TextField fatherNameTF) {
		String fatherName = fatherNameTF.getText();
		this.fatherName = fatherName;
	}

	public String getFatherPhone() {
		return fatherPhone;
	}

	public void setFatherPhone(TextField fatherPhoneTF) {
		String fatherPhone = fatherPhoneTF.getText();
		this.fatherPhone = fatherPhone;
	}

	public String getFatherOccupation() {
		return fatherOccupation;
	}

	public void setFatherOccupation(TextField fatherOccupationTF) {
		String fatherOccupation = fatherOccupationTF.getText();
		this.fatherOccupation = fatherOccupation;
	}

	public String getFatherReligion() {
		return fatherReligion;
	}

	public void setFatherReligion(TextField fatherReligionTF) {
		String fatherReligion = fatherReligionTF.getText();
		this.fatherReligion = fatherReligion;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(TextField motherNameTF) {
		String motherName = motherNameTF.getText();
		this.motherName = motherName;
	}

	public String getMotherPhone() {
		return motherPhone;
	}

	public void setMotherPhone(TextField motherPhoneTF) {
		String motherPhone = motherPhoneTF.getText();
		this.motherPhone = motherPhone;
	}

	public String getMotherOccupation() {
		return motherOccupation;
	}

	public void setMotherOccupation(TextField motherOccupationTF) {
		String motherOccupation = motherOccupationTF.getText();
		this.motherOccupation = motherOccupation;
	}

	public String getMotherReligion() {
		return motherReligion;
	}

	public void setMotherReligion(TextField motherReligionTF) {
		String motherReligion = motherReligionTF.getText();
		this.motherReligion = motherReligion;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(TextField guardianNameTF) {
		String guardianName = guardianNameTF.getText();
		this.guardianName = guardianName;
	}

	public String getGuardianPhone() {
		return guardianPhone;
	}

	public void setGuardianPhone(TextField guardianPhoneTF) {
		String guardianPhone = guardianPhoneTF.getText();
		this.guardianPhone = guardianPhone;
	}

	public String getGuardianOccupation() {
		return guardianOccupation;
	}

	public void setGuardianOccupation(TextField guardianOccupationTF) {
		String guardianOccupation = guardianOccupationTF.getText();
		this.guardianOccupation = guardianOccupation;
	}

	public String getGuardianReligion() {
		return guardianReligion;
	}

	public void setGuardianReligion(TextField guardianReligionTF) {
		String guardianReligion = guardianReligionTF.getText();
		this.guardianReligion = guardianReligion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPreviousSchool() {
		return previousSchool;
	}

	public void setPreviousSchool(TextField previousSchoolTF) {
		String previousSchool = previousSchoolTF.getText();
		this.previousSchool = previousSchool;
	}

	public String getLastClass() {
		return lastClass;
	}

	public void setLastClass(ComboBox<String> lastClassTF) {
		String lastClass = lastClassTF.getValue();
		this.lastClass = lastClass;
	}

	public String getClassSeeking() {
		return classSeeking;
	}

	public void setClassSeeking(ComboBox<String> classSeekingTF) {
		String classSeeking = classSeekingTF.getValue();
		this.classSeeking = classSeeking;
	}

	public String getClassOffered() {
		return classOffered;
	}

	public void setClassOffered(ComboBox<String> classOfferedTF) {
		String classOffered = classOfferedTF.getValue();
		this.classOffered = classOffered;
	}

	public String getIfDisabled() {
		return ifDisabled;
	}

	public void setIfDisabled(TextArea ifDisabledTF) {
		String ifDisabled = ifDisabledTF.getText();
		this.ifDisabled = ifDisabled;
	}

	public String getICE() {
		return ICE;
	}

	public void setICE(TextField ICETF) {
		String ICE = ICETF.getText();
		this.ICE = ICE;
	}

	public LocalDate getDateOfReg() {
		return dateOfReg;
	}

	public void setDateOfReg(LocalDate dateOfReg) {
		this.dateOfReg = dateOfReg;
	}

	public String getDisability() {
		return disability;
	}

	public void setDisability(ComboBox<String> disabilityTF) {
		String disability = (String) disabilityTF.getValue();
		this.disability = disability;
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public LinkedHashSet<String> getPaymentIdSet() {
		return paymentIdSet;
	}

	public void setPaymentIdSet(String paymentIdSet) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add(paymentIdSet);
		this.paymentIdSet.addAll(set);
	}

	public String getEntryClassAssigned() {
		return entryClassAssigned;
	}

	public void setEntryClassAssigned(String entryClassAssigned) {
		this.entryClassAssigned = entryClassAssigned;
	}

	public String getEntryBorderStatus() {
		return entryBorderStatus;
	}

	public void setEntryBorderStatus(String entryBorderStatus) {
		this.entryBorderStatus = entryBorderStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	//Overriding toString
	@Override
	public String toString() {
		return "[ID: " +id+", ScoresSID: "+scores_sId+", Name: "+otherNames +" "+ surName +", DOB and POB : "+ dateOfBirth+", "+ placeOfBirth+ "\n"+
				"Nationality: "+nationality+", State, LGA and Village: "+ state+", "+ lga+", "+ village +"\n"
				+" Address: "+ address +"\n"+" Father's Detail: "+ fatherName +", "+ fatherPhone+", "+ fatherOccupation
				+", "+ fatherReligion+ "\n"+ "Mother's Details: "+motherName+", "+ motherPhone+", "+ motherOccupation+
				", "+motherReligion+"\n"+"Guardian's Details: "+ guardianName+", "+ guardianPhone +", "+
				guardianOccupation+ ","+guardianReligion+"\n"+"Previous School Attended: "+ previousSchool +", Last Class: "
				+lastClass+ ", Class Seeking: "+ classSeeking+ ", Class Offered: "+ classOffered +
				", If Disabled(details): "+ ifDisabled +"\n"+ "In Case of Emergency: "+ ICE+
				", Date of Registration: "+ dateOfReg +", Disability: "+ disability+"]";
	}

}
