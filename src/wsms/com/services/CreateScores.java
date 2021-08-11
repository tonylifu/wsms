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

public class CreateScores {
	public void createScores(String stdId_TF, String stdClass_TF, String term_TF, 
			int subjectCode_TF, double CA1_TF, double CA2_TF, double CA3_TF, 
			double examScore_TF, double total_TF,
			String grade_TF, String name_TF, String subjectName_TF, String sId_TF,
			String scoresYear, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		ScoreSheets scores = new ScoreSheets();
		
		scores.setStdId(stdId_TF);
		scores.setStdClass(stdClass_TF);	
		scores.setTerm(term_TF);
		scores.setSubjectCode(subjectCode_TF);
		scores.setCA1(CA1_TF);
		scores.setCA2(CA2_TF);
		scores.setCA3(CA3_TF);
		scores.setExamScore(examScore_TF);
		scores.setTotal(total_TF);
		//scores.setClassLetter((String)classLetter_TF.getValue());
		scores.setScoresYear(scoresYear);
		scores.setGrade(grade_TF);
		scores.setName(name_TF);
		scores.setSubjectName(subjectName_TF);
		scores.setSId(sId_TF);
		scores.setUser(user);
		
		entitymanager.persist(scores);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//JssScoreSheets
	public void createJssScores(String stdId_TF, String stdClass_TF, String term_TF, 
			int subjectCode_TF, double CA1_TF, double CA2_TF, double CA3_TF, 
			double CA4_TF, double CA5_TF, double CA6_TF, double examScore_TF, double total_TF, 
			String grade_TF, String name_TF, 
			String subjectName_TF, String sId_TF,
			String scoresYear, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		JssScoreSheets score = new JssScoreSheets();
		
		score.setStdId(stdId_TF.toUpperCase());
		score.setStdClass(stdClass_TF);	
		score.setTerm(term_TF);
		score.setSubjectCode(subjectCode_TF);
		score.setCA1(CA1_TF);
		score.setCA2(CA2_TF);
		score.setCA3(CA3_TF);
		score.setCA4(CA4_TF);
		score.setCA5(CA5_TF);
		score.setCA6(CA6_TF);
		score.setExamScore(examScore_TF);
		score.setTotal(total_TF);
		score.setScoresYear(scoresYear);
		score.setGrade(grade_TF);
		score.setName(name_TF);
		score.setSubjectName(subjectName_TF);
		score.setSId(sId_TF);
		score.setUser(user);
		
		entitymanager.persist(score);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	//JssScoreSheetsNew
	public void createJssScoresNew(String sId, String stdClass, String stdId, String term, int subjectCode, double ASS1,
			double ASS2, double ASS3, double classWork1, double classWork2, double classWork3, double test1,
			double test2, double project, double examScore, double total, String name, String subjectName, String grade,
			String scoresYear, String user) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		JssScoreSheetsNew score = new JssScoreSheetsNew();
		
		score.setSId(sId);
		score.setStdClass(stdClass);
		score.setStdId(stdId);
		score.setTerm(term);
		score.setSubjectCode(subjectCode);
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
		score.setName(name);
		score.setSubjectName(subjectName);
		score.setGrade(grade);
		score.setScoresYear(scoresYear);
		score.setUser(user);
		
		entitymanager.persist(score);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
	
	// ScoreSheets Summary
	public void createScoreSheetsSummary(String stdId_TF, String name_TF, 
		String stdClass_TF, String term_TF, double total_TF, //ComboBox<String> classLetter_TF, 
		String scoresYear, String user) {
		
		String sumId = stdId_TF.toUpperCase()+scoresYear+term_TF;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Students std = em.find(Students.class, stdId_TF.toUpperCase());
		double totalScore = 0;
		
		//EXPERIMENT ********************************** EXPERIMENT
		LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
		LinkedHashSet<String> mySumIdSet2 = new LinkedHashSet<>();
		
		OmniLoginControl control = new OmniLoginControl();
		
		Vector<ScoreSheets> SID_elements = new Vector<>();
		Vector<ScoreSheetsSummary> SUMID_elements = new Vector<>();
		
		SID_elements = control.getScoreSheetsByStdNoClassYearTerm(em, stdId_TF, stdClass_TF, 
				scoresYear, term_TF);
		SUMID_elements = control.getScoreSheetSummaryByStdNoClassYearTerm(em, stdId_TF, 
				stdClass_TF, scoresYear, term_TF);
		
		for(ScoreSheets sheet : SID_elements) {
			setSid2.add(sheet.getSId());
		}
		
		for(ScoreSheetsSummary sheet : SUMID_elements) {
			mySumIdSet2.add(sheet.getSumId());
		}
		
		LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
		LinkedHashSet<String> mySumIdSet = mySumIdSet2; //std.getSummaryIdSet();
		
		if(mySumIdSet.contains(sumId)) {
			for(String el : setSid) {
				//if(String.valueOf(el).charAt(String.valueOf(el).length()-1) == '2') {
					EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
					EntityManager em2 = emf2.createEntityManager();
					em2.getTransaction().begin();
					
					ScoreSheets score = em2.find(ScoreSheets.class, el);
					
					if(String.valueOf(el).contains(stdId_TF.toUpperCase()) &&
						score.getTerm().equals(term_TF) &&
						score.getStdClass().equals(stdClass_TF) &&
						//score.getClassLetter().equals(classLetter_TF.getValue()) &&
						score.getScoresYear().equals(scoresYear)){
							totalScore = totalScore + score.getTotal();
					}
					
					em2.getTransaction().commit();
					
					em2.close();
					emf2.close();
				//}
			}
			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			ScoreSheetsSummary summary = entitymanager.find(ScoreSheetsSummary.class, sumId);
			
				double myTotal = total_TF;
				summary.setTotalScores(totalScore+myTotal);
				summary.setUser(user);
				//summary.setTotalScores(totalScore);
			
			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
		}
		else {
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			ScoreSheetsSummary summary = new ScoreSheetsSummary();
			
			summary.setSumId(sumId);
			summary.setStudentId(stdId_TF.toUpperCase());
			summary.setStudentName(name_TF);
			summary.setStudentClass(stdClass_TF); //+classLetter_TF.getValue());
			summary.setStudentTerm(term_TF);
			summary.setAcademicYear(scoresYear);
			summary.setTotalScores(total_TF);
			summary.setUser(user);
			
			entitymanager.persist(summary);
			entitymanager.getTransaction().commit();
			entitymanager.close();
			emfactory.close();
			
			//Create SummaryIdSet
			EntityManagerFactory emfact = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entityman = emfact.createEntityManager();
			entityman.getTransaction().begin();
			
			Students std2 = entityman.find(Students.class, stdId_TF.toUpperCase());
			
			//***
			//std2.setSummaryIdSet(sumId);
			
			entityman.persist(std2);
			entityman.getTransaction().commit();
			
			entityman.close();
			emfact.close();
		}
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	//create Jss ScoreSheetsSummary
	public void createJssScoreSheetsSummary(String stdId_TF, String name_TF, 
			String stdClass_TF,
			String term_TF, double total_TF, //ComboBox<String> classLetter_TF, 
			String scoresYear, String user) {
		
		String sumId = stdId_TF.toUpperCase()+scoresYear+term_TF;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Students std = em.find(Students.class, stdId_TF.toUpperCase());
		double totalScore = 0;
		
		//EXPERIMENT2
		LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
		LinkedHashSet<String> mySumIdSet2 = new LinkedHashSet<>();
		
		OmniLoginControl control = new OmniLoginControl();
		
		Vector<JssScoreSheets> SID_elements = new Vector<>();
		Vector<ScoreSheetsSummary> SUMID_elements = new Vector<>();
		
		SID_elements = control.getJssScoreSheetsByStdNoClassYearTerm(em, stdId_TF, stdClass_TF, 
				scoresYear, term_TF);
		SUMID_elements = control.getScoreSheetSummaryByStdNoClassYearTerm(em, stdId_TF, 
				stdClass_TF, scoresYear, term_TF);
		
		for(JssScoreSheets sheet : SID_elements) {
			setSid2.add(sheet.getSId());
		}
		
		for(ScoreSheetsSummary sheet : SUMID_elements) {
			mySumIdSet2.add(sheet.getSumId());
		}
		
		LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
		LinkedHashSet<String> mySumIdSet = mySumIdSet2; //std.getSummaryIdSet();
		
		if(mySumIdSet.contains(sumId)) {
			for(String el : setSid) {
				//if(String.valueOf(el).charAt(String.valueOf(el).length()-1) == '1') {
					EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
					EntityManager em2 = emf2.createEntityManager();
					em2.getTransaction().begin();
					
					JssScoreSheets score = em2.find(JssScoreSheets.class, el);
					
					if(String.valueOf(el).contains(stdId_TF.toUpperCase()) &&
						score.getTerm().equals(term_TF) &&
						score.getStdClass().equals(stdClass_TF) &&
						//score.getClassLetter().equals(classLetter_TF.getValue()) &&
						score.getScoresYear().equals(scoresYear)){
							totalScore = totalScore + score.getTotal();
					}
					
					em2.getTransaction().commit();
					
					em2.close();
					emf2.close();
				//}
			}

			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			ScoreSheetsSummary summary = entitymanager.find(ScoreSheetsSummary.class, sumId);
			
				double myTotal = total_TF;
				summary.setTotalScores(totalScore+myTotal);
				summary.setUser(user);
				//summary.setTotalScores(totalScore);
			
			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
		}
		else {
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			ScoreSheetsSummary summary = new ScoreSheetsSummary();
			
			summary.setSumId(sumId);
			summary.setStudentId(stdId_TF.toUpperCase());
			summary.setStudentName(name_TF);
			summary.setStudentClass(stdClass_TF); //+classLetter_TF.getValue());
			summary.setStudentTerm(term_TF);
			summary.setAcademicYear(scoresYear);
			summary.setTotalScores(total_TF);
			summary.setUser(user);
			
			entitymanager.persist(summary);
			entitymanager.getTransaction().commit();
			entitymanager.close();
			emfactory.close();
			
			//Create SummaryIdSet
			EntityManagerFactory emfact = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entityman = emfact.createEntityManager();
			entityman.getTransaction().begin();
			
			Students std2 = entityman.find(Students.class, stdId_TF.toUpperCase());
			
			//***
			//std2.setSummaryIdSet(sumId);
			
			entityman.persist(std2);
			entityman.getTransaction().commit();
			
			entityman.close();
			emfact.close();
		}
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	
	//JssScoreSheetSummary_NEW
	public void createJssScoreSheetsSummaryNew(String stdId_TF, String name_TF, 
			String stdClass_TF,
			String term_TF, double total_TF, //ComboBox<String> classLetter_TF, 
			String scoresYear, String user) {
		
		String sumId = stdId_TF.toUpperCase()+scoresYear+term_TF;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Students std = em.find(Students.class, stdId_TF.toUpperCase());
		double totalScore = 0;
		
		//EXPERIMENT2
		LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
		LinkedHashSet<String> mySumIdSet2 = new LinkedHashSet<>();
		
		OmniLoginControl control = new OmniLoginControl();
		
		Vector<JssScoreSheetsNew> SID_elements = new Vector<>();
		Vector<ScoreSheetsSummary> SUMID_elements = new Vector<>();
		
		SID_elements = control.getJssScoreSheetsNewByStdNoClassYearTerm(em, stdId_TF, stdClass_TF, 
				scoresYear, term_TF);
		SUMID_elements = control.getScoreSheetSummaryByStdNoClassYearTerm(em, stdId_TF, 
				stdClass_TF, scoresYear, term_TF);
		
		for(JssScoreSheetsNew sheet : SID_elements) {
			setSid2.add(sheet.getSId());
		}
		
		for(ScoreSheetsSummary sheet : SUMID_elements) {
			mySumIdSet2.add(sheet.getSumId());
		}
		
		LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
		LinkedHashSet<String> mySumIdSet = mySumIdSet2; //std.getSummaryIdSet();
		
		if(mySumIdSet.contains(sumId)) {
			for(String el : setSid) {
				//if(String.valueOf(el).charAt(String.valueOf(el).length()-1) == '1') {
					EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
					EntityManager em2 = emf2.createEntityManager();
					em2.getTransaction().begin();
					
					JssScoreSheetsNew score = em2.find(JssScoreSheetsNew.class, el);
					
					if(String.valueOf(el).contains(stdId_TF.toUpperCase()) &&
						score.getTerm().equals(term_TF) &&
						score.getStdClass().equals(stdClass_TF) &&
						//score.getClassLetter().equals(classLetter_TF.getValue()) &&
						score.getScoresYear().equals(scoresYear)){
							totalScore = totalScore + score.getTotal();
					}
					
					em2.getTransaction().commit();
					
					em2.close();
					emf2.close();
				//}
			}

			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			ScoreSheetsSummary summary = entitymanager.find(ScoreSheetsSummary.class, sumId);
			
				double myTotal = total_TF;
				summary.setTotalScores(totalScore+myTotal);
				summary.setUser(user);
				//summary.setTotalScores(totalScore);
			
			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
		}
		else {
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			ScoreSheetsSummary summary = new ScoreSheetsSummary();
			
			summary.setSumId(sumId);
			summary.setStudentId(stdId_TF.toUpperCase());
			summary.setStudentName(name_TF);
			summary.setStudentClass(stdClass_TF); //+classLetter_TF.getValue());
			summary.setStudentTerm(term_TF);
			summary.setAcademicYear(scoresYear);
			summary.setTotalScores(total_TF);
			summary.setUser(user);
			
			entitymanager.persist(summary);
			entitymanager.getTransaction().commit();
			entitymanager.close();
			emfactory.close();
			
			//Create SummaryIdSet
			EntityManagerFactory emfact = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entityman = emfact.createEntityManager();
			entityman.getTransaction().begin();
			
			Students std2 = entityman.find(Students.class, stdId_TF.toUpperCase());
			
			//***
			//std2.setSummaryIdSet(sumId);
			
			entityman.persist(std2);
			entityman.getTransaction().commit();
			
			entityman.close();
			emfact.close();
		}
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	//AnnualScoresTotal
	public void createAnnualScoresTotal(String stdId_TF, String name_TF, 
			String stdClass_TF, double total_TF, //ComboBox<String> classLetter_TF, 
			String scoresYear, String user, String term_TF) {
		
		String sumId = stdId_TF.toUpperCase()+scoresYear;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Students std = em.find(Students.class, stdId_TF.toUpperCase());
		double totalScore = 0;
		
		//EXPERIMENT3
		LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
		LinkedHashSet<String> mySumIdSet2 = new LinkedHashSet<>();
		
		OmniLoginControl control = new OmniLoginControl();
		
		Vector<ScoreSheets> SID_elements = new Vector<>();
		Vector<AnnualScoresTotal> SUMID_elements = new Vector<>();
		
		SID_elements = control.getScoreSheetsByStdNoClassYearTerm(em, stdId_TF, stdClass_TF, 
				scoresYear, term_TF);
	
		SUMID_elements = control.getAnnualScoresTotalByStdClassYear(em, stdId_TF, 
				stdClass_TF, scoresYear);
		
		for(ScoreSheets sheet : SID_elements) {
			setSid2.add(sheet.getSId());
		}
		
		for(AnnualScoresTotal sheet : SUMID_elements) {
			mySumIdSet2.add(sheet.getSumId());
		}
		
		LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
		LinkedHashSet<String> myAnnualScoresIdSet = mySumIdSet2; //std.getAnnualScoresTotalIdSet();
		
		if(myAnnualScoresIdSet.contains(sumId)) {
			for(String el : setSid) {
				//if(String.valueOf(el).charAt(String.valueOf(el).length()-1) == '2') {
					EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
					EntityManager em2 = emf2.createEntityManager();
					em2.getTransaction().begin();
					
					ScoreSheets score = em2.find(ScoreSheets.class, el);
					
					if(String.valueOf(el).contains(stdId_TF.toUpperCase()) &&
						score.getStdClass().equals(stdClass_TF) &&
						//score.getClassLetter().equals(classLetter_TF.getValue()) &&
						score.getScoresYear().equals(scoresYear)){
							totalScore = totalScore + score.getTotal();
					}
					
					em2.getTransaction().commit();
					
					em2.close();
					emf2.close();
				//}
			}
			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoresTotal summary = entitymanager.find(AnnualScoresTotal.class, sumId);
			
				double myTotal = total_TF;
				summary.setTotalScores(totalScore+myTotal);
				summary.setUser(user);
			
			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
		}
		else {
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoresTotal annualTotal = new AnnualScoresTotal();
			
			annualTotal.setSumId(sumId);
			annualTotal.setStudentId(stdId_TF.toUpperCase());
			annualTotal.setStudentName(name_TF);
			annualTotal.setStudentClass(stdClass_TF); //+classLetter_TF.getValue());
			annualTotal.setAcademicYear(scoresYear);
			annualTotal.setTotalScores(total_TF);
			annualTotal.setUser(user);
			
			entitymanager.persist(annualTotal);
			entitymanager.getTransaction().commit();
			entitymanager.close();
			emfactory.close();
			
			//Create AnnualTotalIdSet
			EntityManagerFactory emfact = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entityman = emfact.createEntityManager();
			entityman.getTransaction().begin();
			
			Students std2 = entityman.find(Students.class, stdId_TF.toUpperCase());
			
			//***
			//std2.setAnnualScoresTotalIdSet(sumId);
			
			entityman.persist(std2);
			entityman.getTransaction().commit();
			
			entityman.close();
			emfact.close();
		}
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	//AnnualJssScoresTotal
	public void createJssAnnualScoresTotal(String stdId_TF, String name_TF, 
			String stdClass_TF, double total_TF, //ComboBox<String> classLetter_TF, 
			String scoresYear, String user, String term_TF) {
		
		String sumId = stdId_TF.toUpperCase()+scoresYear;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Students std = em.find(Students.class, stdId_TF.toUpperCase());
		double totalScore = 0;
		
		//EXPERIMENT4
		LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
		LinkedHashSet<String> mySumIdSet2 = new LinkedHashSet<>();
		
		OmniLoginControl control = new OmniLoginControl();
		
		Vector<JssScoreSheets> SID_elements = new Vector<>();
		Vector<AnnualScoresTotal> SUMID_elements = new Vector<>();
		
		SID_elements = control.getJssScoreSheetsByStdNoClassYearTerm(em, stdId_TF, stdClass_TF, 
				scoresYear, term_TF);
		SUMID_elements = control.getAnnualScoresTotalByStdClassYear(em, stdId_TF, 
				stdClass_TF, scoresYear);
		
		for(JssScoreSheets sheet : SID_elements) {
			setSid2.add(sheet.getSId());
		}
		
		for(AnnualScoresTotal sheet : SUMID_elements) {
			mySumIdSet2.add(sheet.getSumId());
		}
		
		LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
		LinkedHashSet<String> myAnnualScoresIdSet = mySumIdSet2; //std.getAnnualScoresTotalIdSet();
		
		if(myAnnualScoresIdSet.contains(sumId)) {
			for(String el : setSid) {
				//if(String.valueOf(el).charAt(String.valueOf(el).length()-1) == '2') {
					EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
					EntityManager em2 = emf2.createEntityManager();
					em2.getTransaction().begin();
					
					JssScoreSheets score = em2.find(JssScoreSheets.class, el);
					
					if(String.valueOf(el).contains(stdId_TF.toUpperCase()) &&
						score.getStdClass().equals(stdClass_TF) &&
						//score.getClassLetter().equals(classLetter_TF.getValue()) &&
						score.getScoresYear().equals(scoresYear)){
							totalScore = totalScore + score.getTotal();
					}
					
					em2.getTransaction().commit();
					
					em2.close();
					emf2.close();
				//}
			}
			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoresTotal summary = entitymanager.find(AnnualScoresTotal.class, sumId);
			
				double myTotal = total_TF;
				summary.setTotalScores(totalScore+myTotal);
				summary.setUser(user);
			
			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
		}
		else {
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoresTotal annualTotal = new AnnualScoresTotal();
			
			annualTotal.setSumId(sumId);
			annualTotal.setStudentId(stdId_TF.toUpperCase());
			annualTotal.setStudentName(name_TF);
			annualTotal.setStudentClass(stdClass_TF); //+classLetter_TF.getValue());
			annualTotal.setAcademicYear(scoresYear);
			annualTotal.setTotalScores(total_TF);
			annualTotal.setUser(user);
			
			entitymanager.persist(annualTotal);
			entitymanager.getTransaction().commit();
			entitymanager.close();
			emfactory.close();
			
			//Create AnnualTotalIdSet
			EntityManagerFactory emfact = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entityman = emfact.createEntityManager();
			entityman.getTransaction().begin();
			
			Students std2 = entityman.find(Students.class, stdId_TF.toUpperCase());
			
			//***
			//std2.setAnnualScoresTotalIdSet(sumId);
			
			entityman.persist(std2);
			entityman.getTransaction().commit();
			
			entityman.close();
			emfact.close();
		}
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	//AnnualJssScoresNewTotal
	public void createJssNewAnnualScoresTotal(String stdId_TF, String name_TF, 
			String stdClass_TF, double total_TF,
			String scoresYear, String user, String term_TF) {
		
		String sumId = stdId_TF.toUpperCase()+scoresYear;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Students std = em.find(Students.class, stdId_TF.toUpperCase());
		double totalScore = 0;
		
		//EXPERIMENT4
		LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
		LinkedHashSet<String> mySumIdSet2 = new LinkedHashSet<>();
		
		OmniLoginControl control = new OmniLoginControl();
		
		Vector<JssScoreSheetsNew> SID_elements = new Vector<>();
		Vector<AnnualScoresTotal> SUMID_elements = new Vector<>();
		
		SID_elements = control.getJssScoreSheetsNewByStdNoClassYearTerm(em, stdId_TF, stdClass_TF, 
				scoresYear, term_TF);
		SUMID_elements = control.getAnnualScoresTotalByStdClassYear(em, stdId_TF, 
				stdClass_TF, scoresYear);
		
		for(JssScoreSheetsNew sheet : SID_elements) {
			setSid2.add(sheet.getSId());
		}
		
		for(AnnualScoresTotal sheet : SUMID_elements) {
			mySumIdSet2.add(sheet.getSumId());
		}
		
		LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
		LinkedHashSet<String> myAnnualScoresIdSet = mySumIdSet2; //std.getAnnualScoresTotalIdSet();
		
		if(myAnnualScoresIdSet.contains(sumId)) {
			for(String el : setSid) {
				//if(String.valueOf(el).charAt(String.valueOf(el).length()-1) == '2') {
					EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
					EntityManager em2 = emf2.createEntityManager();
					em2.getTransaction().begin();
					
					JssScoreSheetsNew score = em2.find(JssScoreSheetsNew.class, el);
					
					if(String.valueOf(el).contains(stdId_TF.toUpperCase()) &&
						score.getStdClass().equals(stdClass_TF) &&
						//score.getClassLetter().equals(classLetter_TF.getValue()) &&
						score.getScoresYear().equals(scoresYear)){
							totalScore = totalScore + score.getTotal();
					}
					
					em2.getTransaction().commit();
					
					em2.close();
					emf2.close();
				//}
			}
			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoresTotal summary = entitymanager.find(AnnualScoresTotal.class, sumId);
			
				double myTotal = total_TF;
				summary.setTotalScores(totalScore+myTotal);
				summary.setUser(user);
			
			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
		}
		else {
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoresTotal annualTotal = new AnnualScoresTotal();
			
			annualTotal.setSumId(sumId);
			annualTotal.setStudentId(stdId_TF.toUpperCase());
			annualTotal.setStudentName(name_TF);
			annualTotal.setStudentClass(stdClass_TF); //+classLetter_TF.getValue());
			annualTotal.setAcademicYear(scoresYear);
			annualTotal.setTotalScores(total_TF);
			annualTotal.setUser(user);
			
			entitymanager.persist(annualTotal);
			entitymanager.getTransaction().commit();
			entitymanager.close();
			emfactory.close();
			
			//Create AnnualTotalIdSet
			EntityManagerFactory emfact = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entityman = emfact.createEntityManager();
			entityman.getTransaction().begin();
			
			Students std2 = entityman.find(Students.class, stdId_TF.toUpperCase());
			
			//***
			//std2.setAnnualScoresTotalIdSet(sumId);
			
			entityman.persist(std2);
			entityman.getTransaction().commit();
			
			entityman.close();
			emfact.close();
		}
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	//annual SSS ScoreSheets Summary
	public void createAnnualScoreSheetsSummary(String stdId_TF, String name_TF, 
			String stdClass_TF, int subjCode, String subjName, double total_TF, 
			String scoresYear, String term, String user, String term_TF) {
		
		String sumId = stdId_TF.toUpperCase()+scoresYear+String.valueOf(subjCode);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Students std = em.find(Students.class, stdId_TF.toUpperCase());
		double totalScore = 0;
		double termTotal = 0;
		
		//EXPERIMENT5
		LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
		LinkedHashSet<String> mySumIdSet2 = new LinkedHashSet<>();
		
		OmniLoginControl control = new OmniLoginControl();
		
		Vector<ScoreSheets> SID_elements = new Vector<>();
		Vector<AnnualScoreSheetsSummary> SUMID_elements = new Vector<>();
		
//		SID_elements = control.getScoreSheetsByStdNoClassYearTerm(em, stdId_TF, stdClass_TF, 
//				scoresYear, term_TF);
		
		SID_elements = control.getScoreSheetsByStdNoClassYear(em, stdId_TF, stdClass_TF, 
				scoresYear);
		
		SUMID_elements = control.getAnnualScoreSheetSummaryByStdClassYear(em, stdId_TF, 
				stdClass_TF, scoresYear);
		
		for(ScoreSheets sheet : SID_elements) {
			setSid2.add(sheet.getSId());
		}
		
		for(AnnualScoreSheetsSummary sheet : SUMID_elements) {
			mySumIdSet2.add(sheet.getSumId());
		}
		
		LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
		LinkedHashSet<String> mySumIdSet = mySumIdSet2; //std.getAnnualSummaryIdSet();
		
		if(mySumIdSet.contains(sumId)) {
			for(String el : setSid) {
				EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
				EntityManager em2 = emf2.createEntityManager();
				em2.getTransaction().begin();
				
				ScoreSheets score = em2.find(ScoreSheets.class, el);
				
				if(String.valueOf(el).contains(stdId_TF.toUpperCase()) &&
					score.getSubjectCode() == subjCode &&
					score.getStdClass().equals(stdClass_TF) &&
					score.getScoresYear().equals(scoresYear)){
						totalScore = totalScore + score.getTotal();
				}
				
				if(String.valueOf(el).contains(stdId_TF.toUpperCase()) &&
						score.getSubjectCode() == subjCode &&
						score.getStdClass().equals(stdClass_TF) &&
						score.getScoresYear().equals(scoresYear) && 
						score.getTerm().equals(term)){
							termTotal = termTotal + score.getTotal();
					}
				
				em2.getTransaction().commit();
				
				em2.close();
				emf2.close();
			}
			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoreSheetsSummary summary = entitymanager.find(AnnualScoreSheetsSummary.class, sumId);
			
				double myTotal = total_TF;
				summary.setTotalScores(totalScore+myTotal);
				if(term.equals("1")) {
					summary.setFirstTermTotal(termTotal+myTotal);
				}
				else if(term.equals("2")) {
					summary.setSecondTermTotal(termTotal+myTotal);
				}
				else {
					summary.setThirdTermTotal(termTotal+myTotal);
				}
				summary.setUser(user);
			
			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
		}
		else {
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoreSheetsSummary summary = new AnnualScoreSheetsSummary();
			
			summary.setSumId(sumId);
			summary.setStudentId(stdId_TF.toUpperCase());
			summary.setStudentName(name_TF);
			summary.setStudentClass(stdClass_TF); //+classLetter_TF.getValue());
			summary.setSubjectCode(subjCode);
			summary.setSubjectName(subjName);
			summary.setAcademicYear(scoresYear);
			summary.setTotalScores(total_TF);
			if(term.equals("1")) {
				summary.setFirstTermTotal(total_TF);
				summary.setSecondTermTotal(0.0);
				summary.setThirdTermTotal(0.0);
			}
			else if(term.equals("2")) {
				summary.setSecondTermTotal(total_TF);
				summary.setFirstTermTotal(0.0);
				summary.setThirdTermTotal(0.0);
			}
			else {
				summary.setThirdTermTotal(total_TF);
				summary.setFirstTermTotal(0.0);
				summary.setSecondTermTotal(0.0);
			}
			summary.setUser(user);
			
			entitymanager.persist(summary);
			entitymanager.getTransaction().commit();
			entitymanager.close();
			emfactory.close();
			
			//Create Annual SummaryIdSet
			EntityManagerFactory emfact = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entityman = emfact.createEntityManager();
			entityman.getTransaction().begin();
			
			Students std2 = entityman.find(Students.class, stdId_TF.toUpperCase());
			
			//***
			//std2.setAnnualSummaryIdSet(sumId);
			
			entityman.persist(std2);
			entityman.getTransaction().commit();
			
			entityman.close();
			emfact.close();
		}
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	//Create JSS Annual ScoreSheets Summary
	public void createJssAnnualScoreSheetsSummary(String stdId_TF, String name_TF, 
			String stdClass_TF, int subjCode, String subjName, double total_TF, 
			//ComboBox<String> classLetter_TF, 
			String scoresYear, String term, String user, String term_TF) {
		
		String sumId = stdId_TF.toUpperCase()+scoresYear+String.valueOf(subjCode);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Students std = em.find(Students.class, stdId_TF.toUpperCase());
		double totalScore = 0;
		double termTotal = 0;
		
		//EXPERIMENT6
		LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
		LinkedHashSet<String> mySumIdSet2 = new LinkedHashSet<>();
		
		OmniLoginControl control = new OmniLoginControl();
		
		Vector<JssScoreSheets> SID_elements = new Vector<>();
		Vector<AnnualScoreSheetsSummary> SUMID_elements = new Vector<>();
		
//		SID_elements = control.getJssScoreSheetsByStdNoClassYearTerm(em, stdId_TF, stdClass_TF, 
//				scoresYear, term_TF);
		
		SID_elements = control.getJssScoreSheetsByStdNoClassYear(em, stdId_TF, stdClass_TF, 
				scoresYear);
		
		SUMID_elements = control.getAnnualScoreSheetSummaryByStdClassYear(em, stdId_TF, 
				stdClass_TF, scoresYear);
		
		for(JssScoreSheets sheet : SID_elements) {
			setSid2.add(sheet.getSId());
		}
		
		for(AnnualScoreSheetsSummary sheet : SUMID_elements) {
			mySumIdSet2.add(sheet.getSumId());
		}
		
		LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
		LinkedHashSet<String> mySumIdSet = mySumIdSet2; //std.getAnnualSummaryIdSet();
		
		if(mySumIdSet.contains(sumId)) {
			for(String el : setSid) {
				EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
				EntityManager em2 = emf2.createEntityManager();
				em2.getTransaction().begin();
				
				JssScoreSheets score = em2.find(JssScoreSheets.class, el);
				
				if(String.valueOf(el).contains(stdId_TF.toUpperCase()) &&
					score.getSubjectCode() == subjCode &&
					score.getStdClass().equals(stdClass_TF) &&
					score.getScoresYear().equals(scoresYear)){
						totalScore = totalScore + score.getTotal();
				}
				
				if(String.valueOf(el).contains(stdId_TF.toUpperCase()) &&
						score.getSubjectCode() == subjCode &&
						score.getStdClass().equals(stdClass_TF) &&
						score.getScoresYear().equals(scoresYear) && 
						score.getTerm().equals(term)){
							termTotal = termTotal + score.getTotal();
					}
				
				em2.getTransaction().commit();
				
				em2.close();
				emf2.close();
			}

			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoreSheetsSummary summary = entitymanager.find(AnnualScoreSheetsSummary.class, sumId);
			
				double myTotal = total_TF;
				summary.setTotalScores(totalScore+myTotal);
				
				if(term.equals("1")) {
					summary.setFirstTermTotal(termTotal+myTotal);
				}
				else if(term.equals("2")) {
					summary.setSecondTermTotal(termTotal+myTotal);
				}
				else {
					summary.setThirdTermTotal(termTotal+myTotal);
				}
				summary.setUser(user);
			
			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
		}
		else {
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoreSheetsSummary summary = new AnnualScoreSheetsSummary();
			
			summary.setSumId(sumId);
			summary.setStudentId(stdId_TF.toUpperCase());
			summary.setStudentName(name_TF);
			summary.setStudentClass(stdClass_TF); //+classLetter_TF.getValue());
			summary.setSubjectCode(subjCode);
			summary.setSubjectName(subjName);
			summary.setAcademicYear(scoresYear);
			summary.setTotalScores(total_TF);
			if(term.equals("1")) {
				summary.setFirstTermTotal(total_TF);
				summary.setSecondTermTotal(0.0);
				summary.setThirdTermTotal(0.0);
			}
			else if(term.equals("2")) {
				summary.setSecondTermTotal(total_TF);
				summary.setFirstTermTotal(0.0);
				summary.setThirdTermTotal(0.0);
			}
			else {
				summary.setThirdTermTotal(total_TF);
				summary.setFirstTermTotal(0.0);
				summary.setSecondTermTotal(0.0);
			}
			summary.setUser(user);
			
			entitymanager.persist(summary);
			entitymanager.getTransaction().commit();
			entitymanager.close();
			emfactory.close();
			
			//Create SummaryIdSet
			EntityManagerFactory emfact = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entityman = emfact.createEntityManager();
			entityman.getTransaction().begin();
			
			Students std2 = entityman.find(Students.class, stdId_TF.toUpperCase());
			
			//***
			//std2.setAnnualSummaryIdSet(sumId);
			
			entityman.persist(std2);
			entityman.getTransaction().commit();
			
			entityman.close();
			emfact.close();
		}
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	//Create JSS_NEW Annual ScoreSheets Summary
	public void createJssNewAnnualScoreSheetsSummary(String stdId_TF, String name_TF, 
			String stdClass_TF, int subjCode, String subjName, double total_TF, 
			String scoresYear, String term, String user, String term_TF) {
		
		String sumId = stdId_TF.toUpperCase()+scoresYear+String.valueOf(subjCode);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Students std = em.find(Students.class, stdId_TF.toUpperCase());
		double totalScore = 0;
		double termTotal = 0;
		
		//EXPERIMENT6
		LinkedHashSet<String> setSid2 = new LinkedHashSet<>();
		LinkedHashSet<String> mySumIdSet2 = new LinkedHashSet<>();
		
		OmniLoginControl control = new OmniLoginControl();
		
		Vector<JssScoreSheetsNew> SID_elements = new Vector<>();
		Vector<AnnualScoreSheetsSummary> SUMID_elements = new Vector<>();
		
//			SID_elements = control.getJssScoreSheetsByStdNoClassYearTerm(em, stdId_TF, stdClass_TF, 
//					scoresYear, term_TF);
		
		SID_elements = control.getJssScoreSheetsNewByStdNoClassYear(em, stdId_TF, stdClass_TF, 
				scoresYear);
		
		SUMID_elements = control.getAnnualScoreSheetSummaryByStdClassYear(em, stdId_TF, 
				stdClass_TF, scoresYear);
		
		for(JssScoreSheetsNew sheet : SID_elements) {
			setSid2.add(sheet.getSId());
		}
		
		for(AnnualScoreSheetsSummary sheet : SUMID_elements) {
			mySumIdSet2.add(sheet.getSumId());
		}
		
		LinkedHashSet<String> setSid = setSid2; //std.getScores_sId();
		LinkedHashSet<String> mySumIdSet = mySumIdSet2; //std.getAnnualSummaryIdSet();
		
		if(mySumIdSet.contains(sumId)) {
			for(String el : setSid) {
				EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolMgtSystem");
				EntityManager em2 = emf2.createEntityManager();
				em2.getTransaction().begin();
				
				JssScoreSheetsNew score = em2.find(JssScoreSheetsNew.class, el);
				
				if(String.valueOf(el).contains(stdId_TF.toUpperCase()) &&
					score.getSubjectCode() == subjCode &&
					score.getStdClass().equals(stdClass_TF) &&
					score.getScoresYear().equals(scoresYear)){
						totalScore = totalScore + score.getTotal();
				}
				
				if(String.valueOf(el).contains(stdId_TF.toUpperCase()) &&
						score.getSubjectCode() == subjCode &&
						score.getStdClass().equals(stdClass_TF) &&
						score.getScoresYear().equals(scoresYear) && 
						score.getTerm().equals(term)){
							termTotal = termTotal + score.getTotal();
					}
				
				em2.getTransaction().commit();
				
				em2.close();
				emf2.close();
			}

			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoreSheetsSummary summary = entitymanager.find(AnnualScoreSheetsSummary.class, sumId);
			
				double myTotal = total_TF;
				summary.setTotalScores(totalScore+myTotal);
				
				if(term.equals("1")) {
					summary.setFirstTermTotal(termTotal+myTotal);
				}
				else if(term.equals("2")) {
					summary.setSecondTermTotal(termTotal+myTotal);
				}
				else {
					summary.setThirdTermTotal(termTotal+myTotal);
				}
				summary.setUser(user);
			
			entitymanager.getTransaction().commit();
			
			entitymanager.close();
			emfactory.close();
		}
		else {
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entitymanager = emfactory.createEntityManager();
			entitymanager.getTransaction().begin();
			
			AnnualScoreSheetsSummary summary = new AnnualScoreSheetsSummary();
			
			summary.setSumId(sumId);
			summary.setStudentId(stdId_TF.toUpperCase());
			summary.setStudentName(name_TF);
			summary.setStudentClass(stdClass_TF); //+classLetter_TF.getValue());
			summary.setSubjectCode(subjCode);
			summary.setSubjectName(subjName);
			summary.setAcademicYear(scoresYear);
			summary.setTotalScores(total_TF);
			if(term.equals("1")) {
				summary.setFirstTermTotal(total_TF);
				summary.setSecondTermTotal(0.0);
				summary.setThirdTermTotal(0.0);
			}
			else if(term.equals("2")) {
				summary.setSecondTermTotal(total_TF);
				summary.setFirstTermTotal(0.0);
				summary.setThirdTermTotal(0.0);
			}
			else {
				summary.setThirdTermTotal(total_TF);
				summary.setFirstTermTotal(0.0);
				summary.setSecondTermTotal(0.0);
			}
			summary.setUser(user);
			
			entitymanager.persist(summary);
			entitymanager.getTransaction().commit();
			entitymanager.close();
			emfactory.close();
			
			//Create SummaryIdSet
			EntityManagerFactory emfact = Persistence.createEntityManagerFactory("SchoolMgtSystem");
			EntityManager entityman = emfact.createEntityManager();
			entityman.getTransaction().begin();
			
			Students std2 = entityman.find(Students.class, stdId_TF.toUpperCase());
			
			//***
			//std2.setAnnualSummaryIdSet(sumId);
			
			entityman.persist(std2);
			entityman.getTransaction().commit();
			
			entityman.close();
			emfact.close();
		}
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

	public void createScoresSID(String sstd, String sId) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SchoolMgtSystem");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Students std = entitymanager.find(Students.class, sstd);
		
		//***
		//std.setScores_sId(sId);
		
		entitymanager.persist(std);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}
}
