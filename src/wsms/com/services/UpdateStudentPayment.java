package wsms.com.services;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import wsms.com.entity.StudentPayments;

public class UpdateStudentPayment {
	public void updateStudentPayment(TextField PID, 
			ComboBox<String> academicYear, ComboBox<String> stdClass, ComboBox<String> term, 
			ComboBox<String> description, TextField actualPayment, TextField paymentBy,
			TextField receivedBy, LocalDate date_fin) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		StudentPayments stdPay = entitymanager.find(StudentPayments.class, PID.getText());
		
		stdPay.setAcademicYear_fin(academicYear.getValue());
		stdPay.setStdClass_fin(Integer.parseInt(stdClass.getValue()));
		stdPay.setStdTerm_fin(Integer.parseInt(term.getValue()));
		stdPay.setDescription_fin(description.getValue());
		stdPay.setActualPaymentMade(Double.parseDouble(actualPayment.getText()));
		stdPay.setPaymentBy(paymentBy.getText());
		stdPay.setReceivedBy(receivedBy.getText());
		stdPay.setDate_fin(date_fin);
		//stdPay.setReceiptNoSet(receiptNo.getText());
		stdPay.setBalanceDue(stdPay.getTotalPaymentDue() - Double.parseDouble(actualPayment.getText()));
		
		entitymanager.persist(stdPay);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}

}
