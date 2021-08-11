package wsms.com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.TillTransactions;
import wsms.com.entity.Tills;
import wsms.com.entity.Transactions;

public class DeleteTransactions {
	public void deleteTillGL(String tillGlAcct) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Tills till = entitymanager.find(Tills.class, tillGlAcct);
		till.getTTIDSet().remove(tillGlAcct+"1000");
		entitymanager.remove(till);
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}

	//tilltransactions
	public void deleteTillTransactions(String tillGlAcct) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		TillTransactions till = entitymanager.find(TillTransactions.class, tillGlAcct+"1000");
		entitymanager.remove(till);
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
	
	public void deleteTillTransactions2(String TTID, String tillAcctNo) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		TillTransactions till = entitymanager.find(TillTransactions.class, TTID);
		entitymanager.remove(till);
		
		Tills tillx = entitymanager.find(Tills.class, tillAcctNo);
		tillx.getTTIDSet().remove(TTID);
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
	
	//DeleteTransactions
	public void deleteTransactions(String TID) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Transactions transact = entitymanager.find(Transactions.class, TID);
	
		entitymanager.remove(transact);
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
}
