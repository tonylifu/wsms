package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.TransferredWithdrawn;

public class CreateTransferredWithdrawn {
	
	public void createTransferredWithdrawn(String twid, String setId, String stdNo, String stdName, String setYear, String stdClass, 
			double outstandingBal, LocalDate txnDate, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		TransferredWithdrawn tw = new TransferredWithdrawn();
		
		tw.setTwid(twid);
		tw.setSetId(setId);
		tw.setStdNo(stdNo);
		tw.setStdName(stdName);
		tw.setSetYear(setYear);
		tw.setStdClass(stdClass);
		tw.setOutstandingBal(outstandingBal);
		tw.setTxnDate(txnDate);
		tw.setUser(user);
		
		entitymanager.persist(tw);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
}
