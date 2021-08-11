package wsms.com.services;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import wsms.com.entity.StudentPayments;
import wsms.com.entity.Students;

public class CreateStudentPayment {
	public void createStudentPayment(TextField paymentId, TextField stdId_fin, 
			TextField stdName_fin, ComboBox<String> description_fin, 
			ComboBox<String> academicYear_fin, ComboBox<String> stdClass_fin, 
			ComboBox<String> stdTerm_fin, TextField paymentBy, TextField receivedBy,
			LocalDate date_fin, TextField totalPaymentDue, TextField actualPaymentMade, 
			TextField balanceDue, TextField receiptNo, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		StudentPayments std = new StudentPayments();
		
		//double net = Double.parseDouble(totalPaymentDue.getText()) - Double.parseDouble(actualPaymentMade.getText());
		
		std.setAcademicYear_fin(academicYear_fin.getValue());
		std.setActualPaymentMade(0.0);
		std.setBalanceDue( Double.parseDouble(totalPaymentDue.getText()));
		std.setDate_fin(date_fin);
		std.setDescription_fin("Due Payments for the term...");
		std.setPaymentBy("Admin");
		std.SetPaymentId(paymentId.getText());
		std.setReceiptNoSet(receiptNo.getText());
		std.setReceivedBy("System");
		std.setStdClass_fin(Integer.parseInt(stdClass_fin.getValue()));
		std.setStdId_fin(stdId_fin.getText());
		std.setStdName_fin(stdName_fin.getText());
		std.setStdTerm_fin(Integer.parseInt(stdTerm_fin.getValue()));
		std.setTotalPaymentDue(Double.parseDouble(totalPaymentDue.getText()) - 0.0);
		std.setVirtualTotalDue(Double.parseDouble(totalPaymentDue.getText()));
		std.setUser(user);
		
		entitymanager.persist(std);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	public void addStudentPayment(TextField paymentId, TextField stdId_fin, 
			TextField stdName_fin, ComboBox<String> description_fin, 
			ComboBox<String> academicYear_fin, ComboBox<String> stdClass_fin, 
			ComboBox<String> stdTerm_fin, TextField paymentBy, TextField receivedBy,
			LocalDate date_fin, TextField totalPaymentDue, TextField actualPaymentMade, 
			TextField balanceDue, TextField receiptNo, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
	
		Students student = entitymanager.find(Students.class, stdId_fin.getText());
		
		LinkedHashSet<String> PID = student.getPaymentIdSet();
		LinkedHashSet<String> PID2 = new LinkedHashSet<>();
		for (String e: PID) {
			if(e.contains(stdId_fin.getText())) {
				PID2.add(e);
			}
		}
		
		Object last = PID2.toArray()[PID2.size()-1];
		
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymgr = emf.createEntityManager();
			entitymgr.getTransaction().begin();
			
			StudentPayments stdPay = entitymgr.find(StudentPayments.class, last);
			
			StudentPayments stdPay2 = new StudentPayments();
			
			stdPay2.setAcademicYear_fin(stdPay.getAcademicYear_fin());
			stdPay2.setActualPaymentMade(Double.parseDouble(actualPaymentMade.getText()));
			stdPay2.setBalanceDue(stdPay.getBalanceDue()
					- Double.parseDouble(actualPaymentMade.getText()));
			stdPay2.setDate_fin(date_fin);
			stdPay2.setDescription_fin(description_fin.getValue());
			stdPay2.setPaymentBy(paymentBy.getText());
			stdPay2.SetPaymentId(String.valueOf(student.getId())+academicYear_fin.getValue()+receiptNo.getText());
			stdPay2.setReceiptNoSet(receiptNo.getText());
			stdPay2.setReceivedBy(receivedBy.getText());
			stdPay2.setStdClass_fin(stdPay.getStdClass_fin());
			stdPay2.setStdId_fin(student.getId());
			stdPay2.setStdName_fin(student.getOtherNames()+" "+student.getSurName());
			stdPay2.setStdTerm_fin(stdPay.getStdTerm_fin());
			stdPay2.setTotalPaymentDue(stdPay.getBalanceDue()
					- Double.parseDouble(actualPaymentMade.getText())); // check
			stdPay2.setVirtualTotalDue(stdPay.getVirtualTotalDue());
			stdPay2.setUser(user);
			
			entitymgr.persist(stdPay2);
			entitymgr.getTransaction().commit();
			
			entitymgr.close();
			emf.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		entitymanager.persist(student);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	public void createPID(String stdId, String pId) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Students std = entitymanager.find(Students.class, stdId);
		
		std.setPaymentIdSet(pId);
		
		entitymanager.persist(std);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
