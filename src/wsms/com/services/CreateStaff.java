package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.*;

public class CreateStaff {
	public void createStaff(String empNo, String surName, String otherNames, LocalDate dob, String sex, String formMaster, 
			String placeOfBirth, String nationality, String maritalStatus, String designation, String address,
			String state, String lga, String village, String email, String phone1, String phone2, 
			String disabled, String ifDisabled, String nextOfKin, LocalDate dor, String specialization, 
			String qualification, LocalDate dateOfQualification, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Staff staff = new Staff();
		
		staff.setEmpNo(empNo);
		staff.setSurName(surName);
		staff.setOtherNames(otherNames);
		staff.setDob(dob);
		staff.setSex(sex);
		staff.setFormMaster(formMaster);
		staff.setPlaceOfBirth(placeOfBirth);
		staff.setNationality(nationality);
		staff.setMaritalStatus(maritalStatus);
		staff.setDesignation(designation);
		staff.setAddress(address);
		staff.setState(state);
		staff.setLga(lga);
		staff.setVillage(village);
		staff.setEmail(email);
		staff.setPhone1(phone1);
		staff.setPhone2(phone2);
		staff.setDisabled(disabled);
		staff.setIfDisabled(ifDisabled);
		staff.setNextOfKin(nextOfKin);
		staff.setDor(dor);
		staff.setSpecialization(specialization);
		staff.setQualification(qualification);
		staff.setDateOfQualification(dateOfQualification);
		staff.setUser(user);
		
		entitymanager.persist(staff);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
}
