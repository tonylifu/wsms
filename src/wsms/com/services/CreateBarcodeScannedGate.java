package wsms.com.services;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.BarcodeScannedGate;

public class CreateBarcodeScannedGate {
	
	public void createBarcodeScannedGate(String bsId, String stdNo, String surName, String otherNames, double balance, 
			LocalDate date, LocalDateTime dateTime, String stdClass, String user, String status, String reason) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		BarcodeScannedGate barcode = new BarcodeScannedGate();
		
		barcode.setBsId(bsId);
		barcode.setStdNo(stdNo);
		barcode.setSurName(surName);
		barcode.setOtherNames(otherNames);
		barcode.setBalance(balance);
		barcode.setDate(date);
		barcode.setDateTime(dateTime);
		barcode.setStdClass(stdClass);
		barcode.setStatus(status);
		barcode.setReason(reason);
		barcode.setUser(user);
		
		entitymanager.persist(barcode);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
}
