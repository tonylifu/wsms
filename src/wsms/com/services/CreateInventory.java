package wsms.com.services;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.Inventory;

public class CreateInventory {
	public void createInventory(String tagNo, String serialNo, String name, String model, String description,
			String anyOI,LocalDate DOP, String assignedTo, String officeUnit, String deptHead, 
			String itemStatus, LocalDate DOE, String user, double pAmount, int itemAge) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Inventory inv = new Inventory();
		
		inv.setTagNo(tagNo);
		inv.setSerialNo(serialNo);
		inv.setName(name);
		inv.setModel(model);
		inv.setDescription(description);
		inv.setAnyOI(anyOI);
		inv.setDOP(DOP);
		inv.setAssignedTo(assignedTo);
		inv.setOfficeUnit(officeUnit);
		inv.setDeptHead(deptHead);
		inv.setItemStatus(itemStatus);
		inv.setDOE(DOE);
		inv.setUser(user);
		inv.setpAmount(pAmount);
		inv.setItemAge(itemAge);
		
		entitymanager.persist(inv);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
}
