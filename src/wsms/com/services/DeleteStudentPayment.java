package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.StudentPayments;
import wsms.com.entity.Students;

public class DeleteStudentPayment {
	public void deleteStudentPayment(String PID) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		StudentPayments std = entitymanager.find(StudentPayments.class, PID);
		
		entitymanager.remove(std);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//Delete PaymentId from student record set
		public void deletePID(String stdID,String PID) {
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			Students stdPay = entitymanager.find(Students.class, stdID);
			
			stdPay.getPaymentIdSet().remove(PID);
			
			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
		}
}
