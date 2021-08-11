package wsms.com.services;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import wsms.com.entity.Students;

public class UpdateStudent {
	public void updateStudent(TextField id, ComboBox<String> disability, TextField surName, 
			TextField otherNames, LocalDate dateOfBirth, TextField placeOfBirth,
			ComboBox<String> sexTF,ComboBox<String> nationality, ComboBox<String> state, 
			ComboBox<String> lga, TextField village, TextArea address, TextField fatherName, 
			TextField fatherPhone, TextField fatherOccupation, TextField fatherReligion, 
			TextField motherName, TextField motherPhone, TextField motherOccupation,
			TextField motherReligion, TextField guardianName, TextField guardianPhone, 
			TextField guardianOccupation, TextField guardianReligion, TextField previousSchool,
			ComboBox<String> lastClass, ComboBox<String> classSeeking, 
			ComboBox<String> classOffered, TextArea ifDisabled, TextField ICE, 
			LocalDate dateOfReg, TextField stdEmail, String user, 
			String entryClassAssigned, String entryBorderStatus, String status) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		String id2 = id.getText();
		
		Students std = entitymanager.find(Students.class, id2);
		
		std.setDisability(disability);
		std.setSurName(surName);
		std.setOtherNames(otherNames);
		std.setDateOfBirth(dateOfBirth);
		std.setPlaceOfBirth(placeOfBirth);
		std.setSex(sexTF);
		std.setNationality(nationality);
		std.setState(state);
		std.setLga(lga);
		std.setVillage(village);
		std.setAddress(address);
		std.setFatherName(fatherName);
		std.setFatherOccupation(fatherOccupation);
		std.setFatherPhone(fatherPhone);
		std.setFatherReligion(fatherReligion);
		std.setMotherName(motherName);
		std.setMotherOccupation(motherOccupation);
		std.setMotherPhone(motherPhone);
		std.setMotherReligion(motherReligion);
		std.setGuardianName(guardianName);
		std.setGuardianOccupation(guardianOccupation);
		std.setGuardianPhone(guardianPhone);
		std.setGuardianReligion(guardianReligion);
		std.setPreviousSchool(previousSchool);
		std.setLastClass(lastClass);
		std.setClassSeeking(classSeeking);
		std.setClassOffered(classOffered);
		std.setIfDisabled(ifDisabled);
		std.setICE(ICE);
		std.setDateOfReg(dateOfReg);
		std.setEmail(stdEmail.getText());
		std.setEntryClassAssigned(entryClassAssigned);
		std.setUser(user);
		
		
		if(std.getStatus().equalsIgnoreCase("Rusticated") && 
				status.equalsIgnoreCase("Regular")) {
			std.setStatus(status);
		}
		
		entitymanager.persist(std);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}

}
