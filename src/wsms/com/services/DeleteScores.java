package wsms.com.services;

import java.util.LinkedHashSet;
import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import wsms.com.controller.OmniLoginControl;
import wsms.com.entity.*;

public class DeleteScores {
	public void deleteScores(TextField sId) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		String id = sId.getText();
		
		ScoreSheets scores = entitymanager.find(ScoreSheets.class, id);
		
		entitymanager.remove(scores);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//Delete JssScores
	public void deleteJssScores(TextField sId) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		String id = sId.getText();
		
		JssScoreSheets scores = entitymanager.find(JssScoreSheets.class, id);
		
		entitymanager.remove(scores);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//ScoreSheetsSummary
	public void deleteScoreSheetsSummary(TextField sId) {
		EntityManagerFactory emfactory1 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager1 = emfactory1.createEntityManager();
		entitymanager1.getTransaction().begin();
		
		String id = sId.getText();
		if(id.charAt(id.length()-1) == '1') {
			JssScoreSheets scores = entitymanager1.find(JssScoreSheets.class, id);
			
			//entitymanager.remove(scores);
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Students std = em.find(Students.class, scores.getStdId());
			double totalScore = 0;
			LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
			
			OmniLoginControl control = new OmniLoginControl();
			
//			Vector<JssScoreSheets> SID_elements = new Vector<>();
//			
//			SID_elements = control.getScoreSheetsByStdNoClassYearTerm(em, stdId_TF, stdClass_TF, 
//					scoresYear, term_TF);
//			
//			for(ScoreSheets sheet : SID_elements) {
//				setSid2.add(sheet.getSId());
//			}
			
			setSid2.add(control.getJssScoreSheetsBySID(em, sId.getText()));
			
			LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
			//setSid.remove(id);
			for(String el : setSid) {
				EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
				EntityManager em2 = emf2.createEntityManager();
				em2.getTransaction().begin();
				
				if(el.charAt(el.length()-1) == '1') {
					JssScoreSheets score = em2.find(JssScoreSheets.class, el);
					
					if(el.contains(scores.getStdId()) &&
							score.getTerm().equals(scores.getTerm()) &&
							score.getStdClass().equals(scores.getStdClass()) &&
							////score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								totalScore = totalScore + score.getTotal();
							}
				}
				else {
					ScoreSheets score = em2.find(ScoreSheets.class, el);
					
					if(el.contains(scores.getStdId()) &&
							score.getTerm().equals(scores.getTerm()) &&
							score.getStdClass().equals(scores.getStdClass()) &&
							//score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								totalScore = totalScore + score.getTotal();
							}
				}
				
				em2.getTransaction().commit();
				
				em2.close();
				emf2.close();
			}
			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			ScoreSheetsSummary summary = entitymanager.find(ScoreSheetsSummary.class, 
					scores.getStdId()+scores.getScoresYear()+String.valueOf(scores.getTerm()));
			totalScore = totalScore - scores.getTotal();

			summary.setTotalScores(totalScore);

			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
			
			em.getTransaction().commit();
			
			em.close();
			emf.close();

		}
		else {
			ScoreSheets scores = entitymanager1.find(ScoreSheets.class, id);
			
			//entitymanager.remove(scores);
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Students std = em.find(Students.class, scores.getStdId());
			double totalScore = 0;
			LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
			
			OmniLoginControl control = new OmniLoginControl();
			
//			Vector<JssScoreSheets> SID_elements = new Vector<>();
//			
//			SID_elements = control.getScoreSheetsByStdNoClassYearTerm(em, stdId_TF, stdClass_TF, 
//					scoresYear, term_TF);
//			
//			for(ScoreSheets sheet : SID_elements) {
//				setSid2.add(sheet.getSId());
//			}
			
			setSid2.add(control.getScoreSheetsBySID(em, sId.getText()));
			
			LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
			//setSid.remove(id);
			for(String el : setSid) {
				EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
				EntityManager em2 = emf2.createEntityManager();
				em2.getTransaction().begin();
				
				if(el.charAt(el.length()-1) == '1') {
					JssScoreSheets score = em2.find(JssScoreSheets.class, el);
					
					if(el.contains(scores.getStdId()) &&
							score.getTerm().equals(scores.getTerm()) &&
							score.getStdClass().equals(scores.getStdClass()) &&
							//score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								totalScore = totalScore + score.getTotal();
							}
				}
				else {
					ScoreSheets score = em2.find(ScoreSheets.class, el);
					
					if(el.contains(scores.getStdId()) &&
							score.getTerm().equals(scores.getTerm()) &&
							score.getStdClass().equals(scores.getStdClass()) &&
							//score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								totalScore = totalScore + score.getTotal();
							}
				}
				
				em2.getTransaction().commit();
				
				em2.close();
				emf2.close();
			}
			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			ScoreSheetsSummary summary = entitymanager.find(ScoreSheetsSummary.class, 
					scores.getStdId()+scores.getScoresYear()+String.valueOf(scores.getTerm()));
			totalScore = totalScore - scores.getTotal();

			summary.setTotalScores(totalScore);

			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
			
			em.getTransaction().commit();
			
			em.close();
			emf.close();

		}
		
				
		entitymanager1.getTransaction().commit();
		
		entitymanager1.close();
		emfactory1.close();
	}
	
	//Delete Annual Scores total record on deleting scores from scoresheets
	public void deleteAnnualScoresTotal(TextField sId) {
		EntityManagerFactory emfactory1 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager1 = emfactory1.createEntityManager();
		entitymanager1.getTransaction().begin();
		
		String id = sId.getText();
		if(id.charAt(id.length()-1) == '1') {
			JssScoreSheets scores = entitymanager1.find(JssScoreSheets.class, id);
			
			//entitymanager.remove(scores);
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Students std = em.find(Students.class, scores.getStdId());
			double totalScore = 0;
			
			LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
			
			OmniLoginControl control = new OmniLoginControl();
			
//			Vector<JssScoreSheets> SID_elements = new Vector<>();
//			
//			SID_elements = control.getScoreSheetsByStdNoClassYearTerm(em, stdId_TF, stdClass_TF, 
//					scoresYear, term_TF);
//			
//			for(ScoreSheets sheet : SID_elements) {
//				setSid2.add(sheet.getSId());
//			}
			
			setSid2.add(control.getScoreSheetsBySID(em, sId.getText()));
			
			LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
			//setSid.remove(id);
			for(String el : setSid) {
				EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
				EntityManager em2 = emf2.createEntityManager();
				em2.getTransaction().begin();
				
				if(el.charAt(el.length()-1) == '1') {
					JssScoreSheets score = em2.find(JssScoreSheets.class, el);
					
					if(el.contains(scores.getStdId()) &&
							score.getStdClass().equals(scores.getStdClass()) &&
							//score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								totalScore = totalScore + score.getTotal();
							}
				}
				else {
					ScoreSheets score = em2.find(ScoreSheets.class, el);
					
					if(el.contains(scores.getStdId()) &&
							score.getStdClass().equals(scores.getStdClass()) &&
							//score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								totalScore = totalScore + score.getTotal();
							}
				}
				
				em2.getTransaction().commit();
				
				em2.close();
				emf2.close();
			}
			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoresTotal summary = entitymanager.find(AnnualScoresTotal.class, 
					scores.getStdId()+scores.getScoresYear());
			totalScore = totalScore - scores.getTotal();

			summary.setTotalScores(totalScore);

			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
			
			em.getTransaction().commit();
			
			em.close();
			emf.close();

		}
		else {
			ScoreSheets scores = entitymanager1.find(ScoreSheets.class, id);
			
			//entitymanager.remove(scores);
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Students std = em.find(Students.class, scores.getStdId());
			double totalScore = 0;
			
			LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
			
			OmniLoginControl control = new OmniLoginControl();
			
//			Vector<JssScoreSheets> SID_elements = new Vector<>();
//			
//			SID_elements = control.getScoreSheetsByStdNoClassYearTerm(em, stdId_TF, stdClass_TF, 
//					scoresYear, term_TF);
//			
//			for(ScoreSheets sheet : SID_elements) {
//				setSid2.add(sheet.getSId());
//			}
			
			setSid2.add(control.getScoreSheetsBySID(em, sId.getText()));
			
			LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
			//setSid.remove(id);
			for(String el : setSid) {
				EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
				EntityManager em2 = emf2.createEntityManager();
				em2.getTransaction().begin();
				
				if(el.charAt(el.length()-1) == '1') {
					JssScoreSheets score = em2.find(JssScoreSheets.class, el);
					
					if(el.contains(scores.getStdId()) &&
							score.getStdClass().equals(scores.getStdClass()) &&
							//score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								totalScore = totalScore + score.getTotal();
							}
				}
				else {
					ScoreSheets score = em2.find(ScoreSheets.class, el);
					
					if(el.contains(scores.getStdId()) &&
							score.getStdClass().equals(scores.getStdClass()) &&
							//score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								totalScore = totalScore + score.getTotal();
							}
				}
				
				em2.getTransaction().commit();
				
				em2.close();
				emf2.close();
			}
			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoresTotal summary = entitymanager.find(AnnualScoresTotal.class, 
					scores.getStdId()+scores.getScoresYear());
			totalScore = totalScore - scores.getTotal();

			summary.setTotalScores(totalScore);

			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
			
			em.getTransaction().commit();
			
			em.close();
			emf.close();

		}
		
				
		entitymanager1.getTransaction().commit();
		
		entitymanager1.close();
		emfactory1.close();
	}
	
	
	//delete std scoresheetssummary 
	
	public void deleteStdScoreSheetsSummary(String sumId) {
		EntityManagerFactory emfactory1 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager1 = emfactory1.createEntityManager();
		entitymanager1.getTransaction().begin();
		
		ScoreSheetsSummary sum = entitymanager1.find(ScoreSheetsSummary.class, sumId);
		
		entitymanager1.remove(sum);
		
		entitymanager1.getTransaction().commit();
		
		entitymanager1.close();
		emfactory1.close();
	}
	
	// Delete Annual Total Id element
	public void deleteAnnualScoreTotalIdSet(String sumId) {
		EntityManagerFactory emfactory1 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager1 = emfactory1.createEntityManager();
		entitymanager1.getTransaction().begin();
		
		AnnualScoresTotal sum = entitymanager1.find(AnnualScoresTotal.class, sumId);
		
		entitymanager1.remove(sum);
		
		entitymanager1.getTransaction().commit();
		
		entitymanager1.close();
		emfactory1.close();
	}
	
	//Deleting Annual ScoreSheetsSummary
	public void deleteAnnualScoreSheetsSummary(TextField sId, ComboBox<String> term) {
		EntityManagerFactory emfactory1 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager1 = emfactory1.createEntityManager();
		entitymanager1.getTransaction().begin();
		
		String id = sId.getText();
		if(id.charAt(id.length()-1) == '1') {
			JssScoreSheets scores = entitymanager1.find(JssScoreSheets.class, id);
			
			//entitymanager.remove(scores);
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Students std = em.find(Students.class, scores.getStdId());
			double totalScore = 0;
			double termTotal = 0;
			
			LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
			
			OmniLoginControl control = new OmniLoginControl();
			
//			Vector<JssScoreSheets> SID_elements = new Vector<>();
//			
//			SID_elements = control.getScoreSheetsByStdNoClassYearTerm(em, stdId_TF, stdClass_TF, 
//					scoresYear, term_TF);
//			
//			for(ScoreSheets sheet : SID_elements) {
//				setSid2.add(sheet.getSId());
//			}
			
			setSid2.add(control.getScoreSheetsBySID(em, sId.getText()));
			
			LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
			//setSid.remove(id);
			for(String el : setSid) {
				EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
				EntityManager em2 = emf2.createEntityManager();
				em2.getTransaction().begin();
				
				if(el.charAt(el.length()-1) == '1') {
					JssScoreSheets score = em2.find(JssScoreSheets.class, el);
					
					if(el.contains(scores.getStdId()) &&
							score.getSubjectCode() == scores.getSubjectCode() &&
							score.getStdClass().equals(scores.getStdClass()) &&
							//score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								totalScore = totalScore + score.getTotal();
							}
					
					if(el.contains(scores.getStdId()) &&
							score.getSubjectCode() == scores.getSubjectCode() &&
							score.getStdClass().equals(scores.getStdClass()) &&
							//score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getTerm().equals(term.getValue()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								termTotal = termTotal + score.getTotal();
							}
				}
				else {
					ScoreSheets score = em2.find(ScoreSheets.class, el);
					
					if(el.contains(scores.getStdId()) &&
							score.getSubjectCode() == scores.getSubjectCode() &&
							score.getStdClass().equals(scores.getStdClass()) &&
							//score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								totalScore = totalScore + score.getTotal();
							}
					
					if(el.contains(scores.getStdId()) &&
							score.getSubjectCode() == scores.getSubjectCode() &&
							score.getStdClass().equals(scores.getStdClass()) &&
							//score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getTerm().equals(term.getValue()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								termTotal = termTotal + score.getTotal();
							}
				}
				
				em2.getTransaction().commit();
				
				em2.close();
				emf2.close();
			}
			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoreSheetsSummary summary = entitymanager.find(AnnualScoreSheetsSummary.class, 
					scores.getStdId()+scores.getScoresYear()+String.valueOf(scores.getSubjectCode()));
			totalScore = totalScore - scores.getTotal();
			termTotal = termTotal - scores.getTotal();
			
			if(term.getValue().equals("1")) {
				summary.setFirstTermTotal(termTotal);
			}
			else if(term.getValue().equals("2")) {
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

		}
		else {
			ScoreSheets scores = entitymanager1.find(ScoreSheets.class, id);
			
			//entitymanager.remove(scores);
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Students std = em.find(Students.class, scores.getStdId());
			double totalScore = 0;
			double termTotal = 0;
			
			LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
			
			OmniLoginControl control = new OmniLoginControl();
			
//			Vector<JssScoreSheets> SID_elements = new Vector<>();
//			
//			SID_elements = control.getScoreSheetsByStdNoClassYearTerm(em, stdId_TF, stdClass_TF, 
//					scoresYear, term_TF);
//			
//			for(ScoreSheets sheet : SID_elements) {
//				setSid2.add(sheet.getSId());
//			}
			
			setSid2.add(control.getScoreSheetsBySID(em, sId.getText()));
			
			LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
			//setSid.remove(id);
			for(String el : setSid) {
				EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
				EntityManager em2 = emf2.createEntityManager();
				em2.getTransaction().begin();
				
				if(el.charAt(el.length()-1) == '1') {
					JssScoreSheets score = em2.find(JssScoreSheets.class, el);
					
					if(el.contains(scores.getStdId()) &&
							score.getSubjectCode() == scores.getSubjectCode() &&
							score.getStdClass().equals(scores.getStdClass()) &&
							//score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								totalScore = totalScore + score.getTotal();
							}
					
					if(el.contains(scores.getStdId()) &&
							score.getSubjectCode() == scores.getSubjectCode() &&
							score.getStdClass().equals(scores.getStdClass()) &&
							//score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getTerm().equals(term.getValue()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								termTotal = termTotal + score.getTotal();
							}
				}
				else {
					ScoreSheets score = em2.find(ScoreSheets.class, el);
					
					if(el.contains(scores.getStdId()) &&
							score.getSubjectCode() == scores.getSubjectCode() &&
							score.getStdClass().equals(scores.getStdClass()) &&
							//score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								totalScore = totalScore + score.getTotal();
					}
					
					if(el.contains(scores.getStdId()) &&
							score.getSubjectCode() == scores.getSubjectCode() &&
							score.getStdClass().equals(scores.getStdClass()) &&
							//score.getClassLetter().equals(scores.getClassLetter()) && 
							score.getTerm().equals(term.getValue()) && 
							score.getScoresYear().equals(scores.getScoresYear())){
								termTotal = termTotal + score.getTotal();
					}
				}
				
				em2.getTransaction().commit();
				
				em2.close();
				emf2.close();
			}
			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoreSheetsSummary summary = entitymanager.find(AnnualScoreSheetsSummary.class, 
					scores.getStdId()+scores.getScoresYear()+String.valueOf(scores.getSubjectCode()));
			totalScore = totalScore - scores.getTotal();
			termTotal = termTotal - scores.getTotal();
			
			if(term.getValue().equals("1")) {
				summary.setFirstTermTotal(termTotal);
			}
			else if(term.getValue().equals("2")) {
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

		}
		
				
		entitymanager1.getTransaction().commit();
		
		entitymanager1.close();
		emfactory1.close();
	}
	
	//delete std Annual scoresheetssummary
	public void deleteStdAnnualScoreSheetsSummary(String sumId) {
		EntityManagerFactory emfactory1 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager1 = emfactory1.createEntityManager();
		entitymanager1.getTransaction().begin();
		
		AnnualScoreSheetsSummary sum = entitymanager1.find(AnnualScoreSheetsSummary.class, sumId);
		
		entitymanager1.remove(sum);
		
		entitymanager1.getTransaction().commit();
		
		entitymanager1.close();
		emfactory1.close();
	}
	
	public void deleteScores(String sId) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		ScoreSheets scores = entitymanager.find(ScoreSheets.class, sId);
		
		entitymanager.remove(scores);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	public void deleteJssScores(String sId) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		JssScoreSheets scores = entitymanager.find(JssScoreSheets.class, sId);
		
		entitymanager.remove(scores);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//Delete Scores_SID from student record set
	public void deleteScores_SID(String stdID,String SID) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Students std_scores = entitymanager.find(Students.class, stdID);
		
		//***
		//std_scores.getScores_sId().remove(SID);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
