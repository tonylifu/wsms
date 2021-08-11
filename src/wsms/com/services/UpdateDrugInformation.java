package wsms.com.services;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.DrugInformation;

public class UpdateDrugInformation {
	public void updateDrugInformation(String itemIdNo, String nameDesc, double unitPrice, 
			LocalDate entryDate, String user, String category, String incomeAcctNo, String incomeAcctName,
			double totalPrice, int qty) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		DrugInformation drug = entitymanager.find(DrugInformation.class, itemIdNo);
		
		drug.setNameDesc(nameDesc);
		drug.setUnitPrice(unitPrice);
		drug.setEntryDate(entryDate);
		drug.setUser(user);
		drug.setCategory(category);
		drug.setIncomeAcctNo(incomeAcctNo);
		drug.setIncomeAcctName(incomeAcctName);
		drug.setTotalPrice(totalPrice);
		drug.setQty(qty);
		
		entitymanager.persist(drug);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//update qty instock
//	public void updateDrugInformationQty(String itemIdNo, int qty, 
//			LocalDate entryDate, String user) {
//		
//		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
//		EntityManager entitymanager = emfactory.createEntityManager();
//		entitymanager.getTransaction().begin();
//		
//		DrugInformation drug = entitymanager.find(DrugInformation.class, itemIdNo);
//		
//		drug.setQtyInStock(drug.getQtyInStock() - qty);
//		drug.setEntryDate(entryDate);
//		drug.setUser(user);
//		
//		entitymanager.persist(drug);
//	
//		entitymanager.getTransaction().commit();
//		
//		entitymanager.close();
//		emfactory.close();
//	}
	
}
