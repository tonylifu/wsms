package wsms.com.services;

import java.util.LinkedHashSet;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import wsms.com.controller.OmniLoginControl;
import wsms.com.entity.AnnualScoreSheetsSummary;
import wsms.com.entity.AnnualScoresTotal;
import wsms.com.entity.JssScoreSheets;
import wsms.com.entity.JssScoreSheetsNew;
import wsms.com.entity.ScoreSheets;
import wsms.com.entity.ScoreSheetsSummary;
import wsms.com.entity.Students;

public class UpdateScores {
	public void updateScoreSheets(String sId, String stdClass, String term, double CA1, 
			double CA2, double CA3, double examScore, double total_TF,
			//ComboBox<String> classLetter, 
			String grade, String scoresYear) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		String id = sId.toUpperCase();
		
		ScoreSheets scores = entitymanager.find(ScoreSheets.class, id);
		
		scores.setCA1(CA1);
		scores.setCA2(CA2);
		scores.setCA3(CA3);
		scores.setExamScore(examScore);
		scores.setTotal(total_TF);
		scores.setGrade(grade);
		//scores.setScoresYear(scoresYear.getValue());
		
		//entitymanager.persist(scores);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//Update JSS ScoreSheets
	public void updateJssScoreSheets(String sId, String stdClass, String term, 
			double ASS1, double ASS2, double ASS3, 
			double PRJ1, double PRJ2, double PRJ3, double examScore, double total_TF,
			//ComboBox<String> classLetter, 
			String grade, String scoresYear) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		String id = sId;
		
		JssScoreSheets scores = entitymanager.find(JssScoreSheets.class, id);
		
		scores.setCA1(ASS1);
		scores.setCA2(ASS2);
		scores.setCA3(ASS3);
		scores.setCA4(PRJ1);
		scores.setCA5(PRJ2);
		scores.setCA6(PRJ3);
		scores.setExamScore(examScore);
		scores.setTotal(total_TF);
		scores.setGrade(grade);
		//scores.setScoresYear(scoresYear.getValue());
		
		//entitymanager.persist(scores);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
	
	//JssScoreSheetsNew
	public void updateJssScoresNew(String sId, String stdClass, String stdId, String term, double ASS1,
			double ASS2, double ASS3, double classWork1, double classWork2, double classWork3, double test1,
			double test2, double project, double examScore, double total, String grade,
			String scoresYear, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		JssScoreSheetsNew score = entitymanager.find(JssScoreSheetsNew.class, sId);
		
		score.setStdClass(stdClass);
		score.setStdId(stdId);
		score.setTerm(term);
		score.setASS1(ASS1);
		score.setASS2(ASS2);
		score.setASS3(ASS3);
		score.setClassWork1(classWork1);
		score.setClassWork2(classWork2);
		score.setClassWork3(classWork3);
		score.setTest1(test1);
		score.setTest2(test2);
		score.setProject(project);
		score.setExamScore(examScore);
		score.setTotal(total);
		score.setGrade(grade);
		score.setScoresYear(scoresYear);
		score.setUser(user);
		
		entitymanager.persist(score);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//ScoreSheetsSummary
	public void updateScoreSheetsSummary(String sId, double CA1, double CA2, 
			double CA3, double ASS1, double ASS2, double ASS3, 
			double PRJ1, double PRJ2, double PRJ3, double examScore, double total) {
		
		double myTotal = total;
		String stdNo, stdClass, year, term;
		
		EntityManagerFactory emfactory1 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager1 = emfactory1.createEntityManager();
		entitymanager1.getTransaction().begin();
		
		String id = sId;
		
		ScoreSheets scores = entitymanager1.find(ScoreSheets.class, id);
		
		stdNo = scores.getStdId();
		stdClass = scores.getStdClass();
		year = scores.getScoresYear();
		term = scores.getTerm();
		
		//entitymanager.remove(scores);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Students std = em.find(Students.class, scores.getStdId());
		double totalScore = 0;
		
		//EXPERIMENT1
		LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
		
		OmniLoginControl control = new OmniLoginControl();
		
		Vector<ScoreSheets> SID_elements = new Vector<>();
		
		SID_elements = control.getScoreSheetsByStdNoClassYearTerm(em, stdNo, stdClass, year, 
				term);
		
		for(ScoreSheets sheet : SID_elements) {
			setSid2.add(sheet.getSId());
		}
		
		//setSid2.add(control.getScoreSheetsBySID(em, sId));
		
		LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
		//setSid.remove(id);
		for(String el : setSid) {
			EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager em2 = emf2.createEntityManager();
			em2.getTransaction().begin();
			
			ScoreSheets score = em2.find(ScoreSheets.class, el);
			
			if(el.contains(scores.getStdId()) &&
					score.getTerm().equals(scores.getTerm()) &&
					score.getStdClass().equals(scores.getStdClass()) &&
					//score.getClassLetter().equals(scores.getClassLetter()) && 
					score.getScoresYear().equals(scores.getScoresYear())){
						totalScore = totalScore + score.getTotal();
					}
			
			em2.getTransaction().commit();
			
			em2.close();
			emf2.close();
		}
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		String sumId = scores.getStdId()+scores.getScoresYear()+
				String.valueOf(scores.getTerm());
		
		ScoreSheetsSummary summary = entitymanager.find(ScoreSheetsSummary.class, sumId);
		totalScore = totalScore - scores.getTotal() + myTotal;

		summary.setTotalScores(totalScore);

		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		entitymanager1.getTransaction().commit();
		
		entitymanager1.close();
		emfactory1.close();
	}
		
	//JSS ScoreSheetsSummary
	public void updateJssScoreSheetsSummary(String sId, double CA1, double CA2, 
			double CA3, double ASS1, double ASS2, double ASS3, 
			double PRJ1, double PRJ2, double PRJ3, double examScore, double total) {
		
		double myTotal = total;
		
		EntityManagerFactory emfactory1 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager1 = emfactory1.createEntityManager();
		entitymanager1.getTransaction().begin();
		
		String id = sId;
		
		JssScoreSheets scores = entitymanager1.find(JssScoreSheets.class, id);
		
		//entitymanager.remove(scores);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Students std = em.find(Students.class, scores.getStdId());
		double totalScore = 0;
		
		//EXPERIMENT2
		LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
		
		OmniLoginControl control = new OmniLoginControl();
		
		Vector<JssScoreSheets> SID_elements = new Vector<>();
		
		SID_elements = control.getJssScoreSheetsByStdNoClassYearTerm(em, scores.getStdId(), scores.getStdClass(), 
				scores.getScoresYear(), scores.getTerm());
		
		for(JssScoreSheets sheet : SID_elements) {
			setSid2.add(sheet.getSId());
		}
		
		LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
		//setSid.remove(id);
		for(String el : setSid) {
			EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager em2 = emf2.createEntityManager();
			em2.getTransaction().begin();
			
			JssScoreSheets score = em2.find(JssScoreSheets.class, el);
			
			if(el.contains(scores.getStdId()) &&
					score.getTerm().equals(scores.getTerm()) &&
					score.getStdClass().equals(scores.getStdClass()) &&
					//score.getClassLetter().equals(scores.getClassLetter()) && 
					score.getScoresYear().equals(scores.getScoresYear())){
						totalScore = totalScore + score.getTotal();
					}
			
			em2.getTransaction().commit();
			
			em2.close();
			emf2.close();
		}
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		String sumId = scores.getStdId()+scores.getScoresYear()+
				String.valueOf(scores.getTerm());
		
		ScoreSheetsSummary summary = entitymanager.find(ScoreSheetsSummary.class, sumId);
		totalScore = totalScore - scores.getTotal() + myTotal;

		summary.setTotalScores(totalScore);

		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		entitymanager1.getTransaction().commit();
		
		entitymanager1.close();
		emfactory1.close();
	}
	
	//Annual Scores Total
	public void updateAnnualScoresTotal(String sId, double CA1, double CA2, 
			double CA3, double ASS1, double ASS2, double ASS3, 
			double PRJ1, double PRJ2, double PRJ3, double examScore, double total) {
		
		double myTotal = total;
				
//				Double.parseDouble(CA1.getText())+Double.parseDouble(CA2.getText())
//		+Double.parseDouble(CA3.getText())+Double.parseDouble(examScore.getText());
		
		EntityManagerFactory emfactory1 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager1 = emfactory1.createEntityManager();
		entitymanager1.getTransaction().begin();
		
		String id = sId;
		
		ScoreSheets scores = entitymanager1.find(ScoreSheets.class, id);
		
		//entitymanager.remove(scores);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Students std = em.find(Students.class, scores.getStdId());
		double totalScore = 0;
		
		//EXPERIMENT3
		LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
		
		OmniLoginControl control = new OmniLoginControl();
		
		Vector<ScoreSheets> SID_elements = new Vector<>();
		
//		SID_elements = control.getScoreSheetsByStdNoClassYearTerm(em, scores.getStdId(), scores.getStdClass(), 
//				scores.getScoresYear(), scores.getTerm());
		
		SID_elements = control.getScoreSheetsByStdNoClassYear(em, scores.getStdId(), scores.getStdClass(), 
				scores.getScoresYear());
		
		for(ScoreSheets sheet : SID_elements) {
			setSid2.add(sheet.getSId());
		}
		
		LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
		//setSid.remove(id);
		for(String el : setSid) {
			EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager em2 = emf2.createEntityManager();
			em2.getTransaction().begin();
			
			ScoreSheets score = em2.find(ScoreSheets.class, el);
			
			if(el.contains(scores.getStdId()) &&
					score.getStdClass().equals(scores.getStdClass()) &&
					//score.getClassLetter().equals(scores.getClassLetter()) &&
					score.getScoresYear().equals(scores.getScoresYear())){
						totalScore = totalScore + score.getTotal();
					}
			
			em2.getTransaction().commit();
			
			em2.close();
			emf2.close();
		}
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		String sumId = scores.getStdId()+scores.getScoresYear();
		
		AnnualScoresTotal summary = entitymanager.find(AnnualScoresTotal.class, sumId);
		totalScore = totalScore - scores.getTotal() + myTotal;

		summary.setTotalScores(totalScore);

		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		entitymanager1.getTransaction().commit();
		
		entitymanager1.close();
		emfactory1.close();
	}
	
	//Jss Annual Scores Total
	public void updateJssAnnualScoresTotal(String sId, double CA1, double CA2, 
			double CA3, double ASS1, double ASS2, double ASS3, 
			double PRJ1, double PRJ2, double PRJ3, double examScore, double total) {
		
		double myTotal = total;
				//Double.parseDouble(CA1.getText())+Double.parseDouble(CA2.getText())
		//+Double.parseDouble(CA3.getText())+Double.parseDouble(examScore.getText());
		
		EntityManagerFactory emfactory1 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager1 = emfactory1.createEntityManager();
		entitymanager1.getTransaction().begin();
		
		String id = sId;
		
		JssScoreSheets scores = entitymanager1.find(JssScoreSheets.class, id);
		
		//entitymanager.remove(scores);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Students std = em.find(Students.class, scores.getStdId());
		double totalScore = 0;
		
		//EXPERIMENT4
		LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
		
		OmniLoginControl control = new OmniLoginControl();
		
		Vector<JssScoreSheets> SID_elements = new Vector<>();
		
//		SID_elements = control.getJssScoreSheetsByStdNoClassYearTerm(em, scores.getStdId(), scores.getStdClass(), 
//				scores.getScoresYear(), scores.getTerm());
		
		SID_elements = control.getJssScoreSheetsByStdNoClassYear(em, scores.getStdId(), scores.getStdClass(), 
				scores.getScoresYear());
		
		for(JssScoreSheets sheet : SID_elements) {
			setSid2.add(sheet.getSId());
		}
		
		LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
		//setSid.remove(id);
		for(String el : setSid) {
			EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager em2 = emf2.createEntityManager();
			em2.getTransaction().begin();
			
			JssScoreSheets score = em2.find(JssScoreSheets.class, el);
			
			if(el.contains(scores.getStdId()) &&
					score.getStdClass().equals(scores.getStdClass()) &&
					//score.getClassLetter().equals(scores.getClassLetter()) &&
					score.getScoresYear().equals(scores.getScoresYear())){
						totalScore = totalScore + score.getTotal();
					}
			
			em2.getTransaction().commit();
			
			em2.close();
			emf2.close();
		}
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		String sumId = scores.getStdId()+scores.getScoresYear();
		
		AnnualScoresTotal summary = entitymanager.find(AnnualScoresTotal.class, sumId);
		totalScore = totalScore - scores.getTotal() + myTotal;

		summary.setTotalScores(totalScore);

		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		entitymanager1.getTransaction().commit();
		
		entitymanager1.close();
		emfactory1.close();
	}
	
	//Annual ScoreSheetsSummary Update
	public void updateAnnualScoreSheetsSummary(String sId, double CA1, double CA2, 
			double CA3, double ASS1, double ASS2, double ASS3, 
			double PRJ1, double PRJ2, double PRJ3, double examScore, 
			String term, double total) {
		
		double myTotal = total;
						
		EntityManagerFactory emfactory1 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager1 = emfactory1.createEntityManager();
		entitymanager1.getTransaction().begin();
		
		String id = sId;
		
		ScoreSheets scores = entitymanager1.find(ScoreSheets.class, id);
		
		//entitymanager.remove(scores);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Students std = em.find(Students.class, scores.getStdId());
		double totalScore = 0;
		double termTotal = 0;
		
		//EXPERIMENT5
		LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
		
		OmniLoginControl control = new OmniLoginControl();
		
		Vector<ScoreSheets> SID_elements = new Vector<>();
		
//		SID_elements = control.getScoreSheetsByStdNoClassYearTerm(em, scores.getStdId(), scores.getStdClass(), 
//				scores.getScoresYear(), scores.getTerm());
		
		SID_elements = control.getScoreSheetsByStdNoClassYear(em, scores.getStdId(), scores.getStdClass(), 
				scores.getScoresYear());
		
		for(ScoreSheets sheet : SID_elements) {
			setSid2.add(sheet.getSId());
		}
		
		LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
		//setSid.remove(id);
		for(String el : setSid) {
			EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager em2 = emf2.createEntityManager();
			em2.getTransaction().begin();
			
			ScoreSheets score = em2.find(ScoreSheets.class, el);
			
			if(el.contains(scores.getStdId()) &&
					score.getSubjectCode() == scores.getSubjectCode() &&
					score.getStdClass().equals(scores.getStdClass()) &&
					score.getScoresYear().equals(scores.getScoresYear())){
						totalScore = totalScore + score.getTotal();
					}
			
			if(el.contains(scores.getStdId()) &&
					score.getSubjectCode() == scores.getSubjectCode() &&
					score.getStdClass().equals(scores.getStdClass()) &&
					score.getTerm().equals(term) && 
					score.getScoresYear().equals(scores.getScoresYear())){
						termTotal = termTotal + score.getTotal();
					}
			
			em2.getTransaction().commit();
			
			em2.close();
			emf2.close();
		}
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		String sumId = scores.getStdId()+scores.getScoresYear()+
				String.valueOf(scores.getSubjectCode());
		
		AnnualScoreSheetsSummary summary = entitymanager.find(AnnualScoreSheetsSummary.class, sumId);
		totalScore = totalScore - scores.getTotal() + myTotal;
		termTotal = termTotal - scores.getTotal() + myTotal;
		
		if(term.equals("1")) {
			summary.setFirstTermTotal(termTotal);
		}
		else if(term.equals("2")) {
			summary.setSecondTermTotal(termTotal);
		}
		else {
			summary.setThirdTermTotal(termTotal);
		}
		summary.setTotalScores(totalScore);

		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		entitymanager1.getTransaction().commit();
		
		entitymanager1.close();
		emfactory1.close();
	}
		
	// Annual JSS ScoreSheetsSummary
	public void updateJssAnnualScoreSheetsSummary(String sId, double CA1, double CA2, 
			double CA3, double ASS1, double ASS2, double ASS3, 
			double PRJ1, double PRJ2, double PRJ3, double examScore, 
			String term, double total) {
		
		double myTotal = total;
		
		EntityManagerFactory emfactory1 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager1 = emfactory1.createEntityManager();
		entitymanager1.getTransaction().begin();
		
		String id = sId;
		
		JssScoreSheets scores = entitymanager1.find(JssScoreSheets.class, id);
		
		//entitymanager.remove(scores);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Students std = em.find(Students.class, scores.getStdId());
		double totalScore = 0;
		double termTotal = 0;
		
		//Experiment6
		LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
		
		OmniLoginControl control = new OmniLoginControl();
		
		Vector<JssScoreSheets> SID_elements = new Vector<>();
		
//		SID_elements = control.getJssScoreSheetsByStdNoClassYearTerm(em, scores.getStdId(), scores.getStdClass(), 
//				scores.getScoresYear(), scores.getTerm());
		
		SID_elements = control.getJssScoreSheetsByStdNoClassYear(em, scores.getStdId(), scores.getStdClass(), 
				scores.getScoresYear());
		
		for(JssScoreSheets sheet : SID_elements) {
			setSid2.add(sheet.getSId());
		}
		
		LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
		//setSid.remove(id);
		for(String el : setSid) {
			EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager em2 = emf2.createEntityManager();
			em2.getTransaction().begin();
			
			JssScoreSheets score = em2.find(JssScoreSheets.class, el);
			
			if(el.contains(scores.getStdId()) &&
					score.getSubjectCode() == scores.getSubjectCode() &&
					score.getStdClass().equals(scores.getStdClass()) &&
					score.getScoresYear().equals(scores.getScoresYear())){
						totalScore = totalScore + score.getTotal();
					}
			
			if(el.contains(scores.getStdId()) &&
					score.getSubjectCode() == scores.getSubjectCode() &&
					score.getStdClass().equals(scores.getStdClass()) &&
					score.getTerm().equals(term) && 
					score.getScoresYear().equals(scores.getScoresYear())){
						termTotal = termTotal + score.getTotal();
					}
			
			em2.getTransaction().commit();
			
			em2.close();
			emf2.close();
		}
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		String sumId = scores.getStdId()+scores.getScoresYear()+
				String.valueOf(scores.getSubjectCode());
		
		AnnualScoreSheetsSummary summary = entitymanager.find(AnnualScoreSheetsSummary.class, sumId);
		totalScore = totalScore - scores.getTotal() + myTotal;
		termTotal = termTotal - scores.getTotal() + myTotal;
		
		if(term.equals("1")) {
			summary.setFirstTermTotal(termTotal);
		}
		else if(term.equals("2")) {
			summary.setSecondTermTotal(termTotal);
		}
		else {
			summary.setThirdTermTotal(termTotal);
		}

		summary.setTotalScores(totalScore);

		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		entitymanager1.getTransaction().commit();
		
		entitymanager1.close();
		emfactory1.close();
	}
}
