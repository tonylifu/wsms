package wsms.com.services;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.entity.Graduated;

public class CreateGraduated {
	
	public void createGraduate(String gid, String setId, String stdNo, String stdName, String setYear, String stdClass, 
			double outstandingBal, LocalDate txnDate, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Graduated graduate = new Graduated();
		
		graduate.setGid(gid);
		graduate.setSetId(setId);
		graduate.setStdNo(stdNo);
		graduate.setStdName(stdName);
		graduate.setSetYear(setYear);
		graduate.setStdClass(stdClass);
		graduate.setOutstandingBal(outstandingBal);
		graduate.setTxnDate(txnDate);
		graduate.setUser(user);
		
		entitymanager.persist(graduate);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
}
