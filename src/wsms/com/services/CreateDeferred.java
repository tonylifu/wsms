package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.Deferred;

public class CreateDeferred {
	
	public void createDefer(String did, String setId, String stdNo, String stdName, String setYear, String stdClass, 
			double outstandingBal, LocalDate txnDate, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Deferred df = new Deferred();
		
		df.setDid(did);
		df.setSetId(setId);
		df.setStdNo(stdNo);
		df.setStdName(stdName);
		df.setSetYear(setYear);
		df.setStdClass(stdClass);
		df.setOutstandingBal(outstandingBal);
		df.setTxnDate(txnDate);
		df.setUser(user);
		
		entitymanager.persist(df);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
}
