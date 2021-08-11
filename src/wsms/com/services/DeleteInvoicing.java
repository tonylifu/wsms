package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.BillingsInformation;
import wsms.com.entity.Invoicing;

public class DeleteInvoicing {
	public void deleteInvoicingBillings(String invoiceId) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Invoicing invoice = entitymanager.find(Invoicing.class, invoiceId);
		BillingsInformation bill = entitymanager.find(BillingsInformation.class, invoiceId);
	
		entitymanager.remove(bill);
		entitymanager.remove(invoice);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
