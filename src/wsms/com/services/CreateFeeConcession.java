package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.*;

public class CreateFeeConcession {
	public void createFeeConcession(String cid, String stdNo, String name, String sex, String stdClassId, 
			String session, String term, String user, String lastUpdateUser, 
			String concessionStatus, String aoi, double balAtConcession, double amtPay, 
			double updBalance, int graceDaysGiven, int graceDaysRemains, 
			LocalDate date, LocalDate expectedPayDate, LocalDate lastUpdPayDate) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		FeeConcession conc = new FeeConcession();
		
		conc.setCid(cid);
		conc.setStdNo(stdNo);
		conc.setName(name);
		conc.setSex(sex);
		conc.setStdClassId(stdClassId);
		conc.setSession(session);
		conc.setTerm(term);
		conc.setUser(user);
		conc.setLastUpdateUser(lastUpdateUser);
		conc.setConcessionStatus(concessionStatus);
		conc.setAoi(aoi);
		conc.setBalAtConcession(balAtConcession);
		conc.setAmtPay(amtPay);
		conc.setUpdBalance(updBalance);
		conc.setGraceDaysGiven(graceDaysGiven);
		conc.setGraceDaysRemains(graceDaysRemains);
		conc.setDate(date);
		conc.setExpectedPayDate(expectedPayDate);
		conc.setLastUpdPayDate(lastUpdPayDate);
		
		entitymanager.persist(conc);
	
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//update
	public void updateFeeConcession(String cid, String lastUpdateUser, 
			String concessionStatus, String aoi, double amtPay, 
			double updBalance, int graceDaysGiven, int graceDaysRemains, 
			LocalDate expectedPayDate, LocalDate lastUpdPayDate) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		FeeConcession conc = entitymanager.find(FeeConcession.class, cid);
		
		//conc.setStdNo(stdNo);
		//conc.setName(name);
		//conc.setSex(sex);
		//conc.setStdClassId(stdClassId);
		//conc.setSession(session);
		//conc.setTerm(term);
		conc.setLastUpdateUser(lastUpdateUser);
		conc.setConcessionStatus(concessionStatus);
		conc.setAoi(aoi);
		conc.setAmtPay(amtPay);
		conc.setUpdBalance(updBalance);
		conc.setGraceDaysGiven(graceDaysGiven);
		conc.setGraceDaysRemains(graceDaysRemains);
		conc.setExpectedPayDate(expectedPayDate);
		conc.setLastUpdPayDate(lastUpdPayDate);
			
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//delete
	public void deleteFeeConcession(String cid) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		FeeConcession conc = entitymanager.find(FeeConcession.class, cid);
		
		entitymanager.remove(conc);
			
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
