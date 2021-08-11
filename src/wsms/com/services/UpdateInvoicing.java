package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.BillingsInformation;
import wsms.com.entity.Invoicing;

public class UpdateInvoicing {
	public void updateInvoicing(String invoiceId, String itemId, String stdNo, String name, 
			String itemNameDesc, LocalDate purchaseDate, double unitPrice, double totalPrice, 
			int quantity, String user, String category, String year, String term, String stdClass) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Invoicing invoice = entitymanager.find(Invoicing.class, invoiceId);
		
		invoice.setItemId(itemId);
		invoice.setStdNo(stdNo);
		invoice.setName(name);
		invoice.setItemNameDesc(itemNameDesc);
		invoice.setPurchaseDate(purchaseDate);
		invoice.setUnitPrice(unitPrice);
		invoice.setQuantity(quantity);
		invoice.setTotalPrice(totalPrice);
		invoice.setUser(user);
		invoice.setCategory(category);
		invoice.setYear(year);
		invoice.setTerm(term);
		invoice.setStdClass(stdClass);
		
		entitymanager.persist(invoice);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//Billing Information
	public void updateBillingsInformation(String invoiceId, String itemId, String GLAcctNo,
			String GLAcctName, String itemNameDesc, LocalDate purchaseDate, double unitPrice, 
			double totalPrice, int quantity, String user, String category, 
			String year, String term, String stdClass, String stdNo) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		BillingsInformation bill = entitymanager.find(BillingsInformation.class, invoiceId);
		
		bill.setItemId(itemId);
		bill.setGLAcctNo(GLAcctNo);
		bill.setGLAcctName(GLAcctName);
		bill.setBillingDate(purchaseDate);
		bill.setUser(user);
		bill.setYear(year);
		bill.setTerm(term);
		bill.setStdClass(stdClass);
		bill.setCategory(category);
		bill.setStdNo(stdNo);
		
		
		EntityManagerFactory emfactory2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager2 = emfactory2.createEntityManager();
		entitymanager2.getTransaction().begin();
		
		Invoicing invoice = entitymanager.find(Invoicing.class, stdNo);
		
		if(invoice.getCategory().equalsIgnoreCase("schoolFee")) {
			bill.setSchoolFee(totalPrice);
		}
		else if(invoice.getCategory().equalsIgnoreCase("WAEC")) {
			bill.setWAEC(totalPrice);
		}
		else if(invoice.getCategory().equalsIgnoreCase("juniorWAEC")) {
			bill.setJuniorWAEC(totalPrice);
		}
		else if(invoice.getCategory().equalsIgnoreCase("NECO")) {
			bill.setNECO(totalPrice);
		}
		else if(invoice.getCategory().equalsIgnoreCase("ICT")) {
			bill.setICT(totalPrice);
		}
		else if(invoice.getCategory().equalsIgnoreCase("boardingFee")) {
			bill.setBoardingFee(totalPrice);
		}
		else {
			bill.setOthers(totalPrice);
		}
		
		entitymanager.persist(bill);
		//entitymanager2.persist(invoice);
	
		entitymanager2.getTransaction().commit();
		
		entitymanager2.close();
		emfactory2.close();
		
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
}
