package wsms.com.services;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import wsms.com.entity.BillingsInformation;
import wsms.com.entity.DrugInformation;
import wsms.com.entity.Invoicing;

public class CreateInvoicing {
	public void createInvoicing(String invoiceId, String itemId, String stdNo, String name, 
			String itemNameDesc, LocalDate purchaseDate, double unitPrice, double totalPrice, 
			int quantity, String user, String category, String year, String term, String stdClass) {
		
		Vector<Invoicing> borderItemList = new Vector<>();
		LinkedHashSet<String> set = new LinkedHashSet<>();
		EntityManagerFactory emfactory2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager2 = emfactory2.createEntityManager();
		entitymanager2.getTransaction().begin();
		
		Query query =
				entitymanager2.createQuery("select e from Invoicing e ");
		borderItemList = (Vector<Invoicing>) query.getResultList();
		
		entitymanager2.getTransaction().commit();
		entitymanager2.close();
		emfactory2.close();
		
		for(Invoicing id : borderItemList) {
			if(id.getInvoiceId().equalsIgnoreCase(invoiceId)) {
				set.add(invoiceId);
			}
		}
		
		if(!set.contains(invoiceId)) {
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			Invoicing invoice = new Invoicing();
			
			invoice.setInvoiceId(invoiceId);
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
		
	}
	
	//Billing Information
	public void createBillingsInformation(String invoiceId, String itemId, String GLAcctNo,
			String GLAcctName, String itemNameDesc, LocalDate purchaseDate, double unitPrice, 
			double totalPrice, int quantity, String user, String category, 
			String year, String term, String stdClass, String stdNo) {
		
		Vector<BillingsInformation> borderItemList = new Vector<>();
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		EntityManagerFactory emfactory3 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager3 = emfactory3.createEntityManager();
		entitymanager3.getTransaction().begin();
		
		Query query =
				entitymanager3.createQuery("select e from BillingsInformation e ");
		borderItemList = (Vector<BillingsInformation>) query.getResultList();
		
		entitymanager3.getTransaction().commit();
		entitymanager3.close();
		emfactory3.close();
		
		for(BillingsInformation id : borderItemList) {
			if(id.getBillingId().equalsIgnoreCase(invoiceId)) {
				set.add(invoiceId);
			}
		}
		
		if(!set.contains(invoiceId)) {
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			BillingsInformation bill = new BillingsInformation();
			
			bill.setBillingId(invoiceId);
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
			
			Invoicing invoice = entitymanager.find(Invoicing.class, invoiceId);
			
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
			
		
			entitymanager2.getTransaction().commit();
			
			entitymanager2.close();
			emfactory2.close();
			
		
			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
			
			//Get total
			EntityManagerFactory emfactoryX = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanagerX = emfactoryX.createEntityManager();
			entitymanagerX.getTransaction().begin();
			
			BillingsInformation billy = entitymanagerX.find(BillingsInformation.class, invoiceId);
			
			double totalX = billy.getBoardingFee() + billy.getSchoolFee() + billy.getWAEC() + 
					billy.getNECO() + billy.getOthers() + billy.getJuniorWAEC() + billy.getICT();
			
			billy.setTotal(totalX);
			
			
			entitymanagerX.persist(billy);
			entitymanagerX.getTransaction().commit();
			entitymanagerX.close();
			emfactoryX.close();
		}
		
	}
	
}
