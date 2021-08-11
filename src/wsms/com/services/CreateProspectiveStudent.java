package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import wsms.com.entity.*;

public class CreateProspectiveStudent {
	public void createProspectiveStudent(int regFormNo, int yearsAtPrevSchool, double regFee, double examScores, 
			double interviewScores, String session, String term, String surName, String otherNames, 
			String sex, String placeOfBirth, String nationality, String state, String LGA, 
			String village, String address, String fatherName, String fatherPhone, String fatherOccupation, 
			String fatherReligion, String motherName, String motherPhone, String motherOccupation, 
			String motherReligion, String guardianName, String guardianPhone, String guardianOccupation, 
			String guardianReligion, String email, String prevSchool, String lastClass, String classSeeking, 
			String classOffered, String onOffCampus, String acceptFeePolicy, String admissionStatus, 
			String user, String lastUpdateUser, LocalDate dateOfBirth, LocalDate date, 
			LocalDate lastUpdDate) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		ProspectiveStudent std = new ProspectiveStudent();
		
		std.setRegFormNo(regFormNo);
		std.setYearsAtPrevSchool(yearsAtPrevSchool);
		std.setRegFee(regFee);
		std.setExamScores(examScores);
		std.setInterviewScores(interviewScores);
		std.setSession(session);
		std.setTerm(term);
		std.setSurName(surName);
		std.setOtherNames(otherNames);
		std.setSex(sex);
		std.setPlaceOfBirth(placeOfBirth);
		std.setNationality(nationality);
		std.setState(state);
		std.setLGA(LGA);
		std.setVillage(village);
		std.setAddress(address);
		std.setFatherName(fatherName);
		std.setFatherPhone(fatherPhone);
		std.setFatherOccupation(fatherOccupation);
		std.setFatherReligion(fatherReligion);
		std.setMotherName(motherName);
		std.setMotherPhone(motherPhone);
		std.setMotherOccupation(motherOccupation);
		std.setMotherReligion(motherReligion);
		std.setGuardianName(guardianName);
		std.setGuardianPhone(guardianPhone);
		std.setGuardianOccupation(guardianOccupation);
		std.setGuardianReligion(guardianReligion);
		std.setEmail(email);
		std.setPrevSchool(prevSchool);
		std.setLastClass(lastClass);
		std.setClassSeeking(classSeeking);
		std.setClassOffered(classOffered);
		std.setOnOffCampus(onOffCampus);
		std.setAcceptFeePolicy(acceptFeePolicy);
		std.setAdmissionStatus(admissionStatus);
		std.setUser(user);
		std.setLastUpdateUser(lastUpdateUser);
		std.setDateOfBirth(dateOfBirth);
		std.setDate(date);
		std.setLastUpdDate(lastUpdDate);
		
		entitymanager.persist(std);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//update
	public void updateProspectiveStudent(int regFormNo, int yearsAtPrevSchool, double regFee, double examScores, 
			double interviewScores, String session, String term, String surName, String otherNames, 
			String sex, String placeOfBirth, String nationality, String state, String LGA, 
			String village, String address, String fatherName, String fatherPhone, String fatherOccupation, 
			String fatherReligion, String motherName, String motherPhone, String motherOccupation, 
			String motherReligion, String guardianName, String guardianPhone, String guardianOccupation, 
			String guardianReligion, String email, String prevSchool, String lastClass, String classSeeking, 
			String classOffered, String onOffCampus, String acceptFeePolicy, String admissionStatus, 
			String lastUpdateUser, LocalDate dateOfBirth, LocalDate lastUpdDate) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		ProspectiveStudent std = entitymanager.find(ProspectiveStudent.class, regFormNo);
		
		std.setYearsAtPrevSchool(yearsAtPrevSchool);
		std.setRegFee(regFee);
		std.setExamScores(examScores);
		std.setInterviewScores(interviewScores);
		std.setSession(session);
		std.setTerm(term);
		std.setSurName(surName);
		std.setOtherNames(otherNames);
		std.setSex(sex);
		std.setPlaceOfBirth(placeOfBirth);
		std.setNationality(nationality);
		std.setState(state);
		std.setLGA(LGA);
		std.setVillage(village);
		std.setAddress(address);
		std.setFatherName(fatherName);
		std.setFatherPhone(fatherPhone);
		std.setFatherOccupation(fatherOccupation);
		std.setFatherReligion(fatherReligion);
		std.setMotherName(motherName);
		std.setMotherPhone(motherPhone);
		std.setMotherOccupation(motherOccupation);
		std.setMotherReligion(motherReligion);
		std.setGuardianName(guardianName);
		std.setGuardianPhone(guardianPhone);
		std.setGuardianOccupation(guardianOccupation);
		std.setGuardianReligion(guardianReligion);
		std.setEmail(email);
		std.setPrevSchool(prevSchool);
		std.setLastClass(lastClass);
		std.setClassSeeking(classSeeking);
		std.setClassOffered(classOffered);
		std.setOnOffCampus(onOffCampus);
		std.setAcceptFeePolicy(acceptFeePolicy);
		std.setAdmissionStatus(admissionStatus);
		std.setLastUpdateUser(lastUpdateUser);
		std.setDateOfBirth(dateOfBirth);
		std.setLastUpdDate(lastUpdDate);
			
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//delete
	public void deleteProspectiveStudent(int regFormNo) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		ProspectiveStudent std = entitymanager.find(ProspectiveStudent.class, regFormNo);
		
		entitymanager.remove(std);
			
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
}
