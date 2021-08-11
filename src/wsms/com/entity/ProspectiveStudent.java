package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProspectiveStudent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int regFormNo; 
	private double regFee, examScores, interviewScores;
	private int yearsAtPrevSchool;
	private String session, term, surName, otherNames, sex, placeOfBirth, nationality,
		state, LGA, village, address, fatherName, fatherPhone, fatherOccupation, fatherReligion,
		motherName, motherPhone, motherOccupation, motherReligion, guardianName, guardianPhone,
		guardianOccupation, guardianReligion, email, prevSchool, lastClass, classSeeking, classOffered,
		onOffCampus, acceptFeePolicy, admissionStatus, user, lastUpdateUser;
	private LocalDate dateOfBirth, date, lastUpdDate;
	
	public ProspectiveStudent(int regFormNo, int yearsAtPrevSchool, double regFee, double examScores, 
			double interviewScores, String session, String term, String surName, String otherNames, 
			String sex, String placeOfBirth, String nationality, String state, String LGA, 
			String village, String address, String fatherName, String fatherPhone, String fatherOccupation, 
			String fatherReligion, String motherName, String motherPhone, String motherOccupation, 
			String motherReligion, String guardianName, String guardianPhone, String guardianOccupation, 
			String guardianReligion, String email, String prevSchool, String lastClass, String classSeeking, 
			String classOffered, String onOffCampus, String acceptFeePolicy, String admissionStatus, 
			String user, String lastUpdateUser, LocalDate dateOfBirth, LocalDate date, 
			LocalDate lastUpdDate) {
		super();
		this.regFormNo = regFormNo;
		this.yearsAtPrevSchool = yearsAtPrevSchool;
		this.regFee = regFee;
		this.examScores = examScores;
		this.interviewScores = interviewScores;
		this.session = session;
		this.term = term;
		this.surName = surName;
		this.otherNames = otherNames;
		this.sex = sex;
		this.placeOfBirth = placeOfBirth;
		this.nationality = nationality;
		this.state = state;
		this.LGA = LGA;
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
		this.email = email;
		this.prevSchool = prevSchool;
		this.lastClass = lastClass;
		this.classSeeking = classSeeking;
		this.classOffered = classOffered;
		this.onOffCampus = onOffCampus;
		this.acceptFeePolicy = acceptFeePolicy;
		this.admissionStatus = admissionStatus;
		this.user = user;
		this.lastUpdateUser = lastUpdateUser;
		this.dateOfBirth = dateOfBirth;
		this.date = date;
		this.lastUpdDate = lastUpdDate;
	}
	
	public ProspectiveStudent() {
		super();
	}

	//Getters and Setters
	public int getRegFormNo() {
		return regFormNo;
	}

	public void setRegFormNo(int regFormNo) {
		this.regFormNo = regFormNo;
	}

	public double getRegFee() {
		return regFee;
	}

	public void setRegFee(double regFee) {
		this.regFee = regFee;
	}

	public double getExamScores() {
		return examScores;
	}

	public void setExamScores(double examScores) {
		this.examScores = examScores;
	}

	public double getInterviewScores() {
		return interviewScores;
	}

	public void setInterviewScores(double interviewScores) {
		this.interviewScores = interviewScores;
	}

	public int getYearsAtPrevSchool() {
		return yearsAtPrevSchool;
	}

	public void setYearsAtPrevSchool(int yearsAtPrevSchool) {
		this.yearsAtPrevSchool = yearsAtPrevSchool;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLGA() {
		return LGA;
	}

	public void setLGA(String lGA) {
		LGA = lGA;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherPhone() {
		return fatherPhone;
	}

	public void setFatherPhone(String fatherPhone) {
		this.fatherPhone = fatherPhone;
	}

	public String getFatherOccupation() {
		return fatherOccupation;
	}

	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}

	public String getFatherReligion() {
		return fatherReligion;
	}

	public void setFatherReligion(String fatherReligion) {
		this.fatherReligion = fatherReligion;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherPhone() {
		return motherPhone;
	}

	public void setMotherPhone(String motherPhone) {
		this.motherPhone = motherPhone;
	}

	public String getMotherOccupation() {
		return motherOccupation;
	}

	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}

	public String getMotherReligion() {
		return motherReligion;
	}

	public void setMotherReligion(String motherReligion) {
		this.motherReligion = motherReligion;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getGuardianPhone() {
		return guardianPhone;
	}

	public void setGuardianPhone(String guardianPhone) {
		this.guardianPhone = guardianPhone;
	}

	public String getGuardianOccupation() {
		return guardianOccupation;
	}

	public void setGuardianOccupation(String guardianOccupation) {
		this.guardianOccupation = guardianOccupation;
	}

	public String getGuardianReligion() {
		return guardianReligion;
	}

	public void setGuardianReligion(String guardianReligion) {
		this.guardianReligion = guardianReligion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrevSchool() {
		return prevSchool;
	}

	public void setPrevSchool(String prevSchool) {
		this.prevSchool = prevSchool;
	}

	public String getLastClass() {
		return lastClass;
	}

	public void setLastClass(String lastClass) {
		this.lastClass = lastClass;
	}

	public String getClassSeeking() {
		return classSeeking;
	}

	public void setClassSeeking(String classSeeking) {
		this.classSeeking = classSeeking;
	}

	public String getClassOffered() {
		return classOffered;
	}

	public void setClassOffered(String classOffered) {
		this.classOffered = classOffered;
	}

	public String getOnOffCampus() {
		return onOffCampus;
	}

	public void setOnOffCampus(String onOffCampus) {
		this.onOffCampus = onOffCampus;
	}

	public String getAcceptFeePolicy() {
		return acceptFeePolicy;
	}

	public void setAcceptFeePolicy(String acceptFeePolicy) {
		this.acceptFeePolicy = acceptFeePolicy;
	}

	public String getAdmissionStatus() {
		return admissionStatus;
	}

	public void setAdmissionStatus(String admissionStatus) {
		this.admissionStatus = admissionStatus;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getLastUpdateUser() {
		return lastUpdateUser;
	}

	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalDate getLastUpdDate() {
		return lastUpdDate;
	}

	public void setLastUpdDate(LocalDate lastUpdDate) {
		this.lastUpdDate = lastUpdDate;
	}
		
}
