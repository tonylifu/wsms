package wsms.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@IdClass(ScoreSheetsPk.class)
@Entity
public class ScoreSheets {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE) 
	private String sId;
	private String stdClass;
	private String stdId;
	private String term;
	private int subjectCode;
	
	private double CA1, CA2, CA3, examScore, total;
	private String name, subjectName, grade, scoresYear, user; //classLetter
	
	//constructors
	public ScoreSheets(String sId, String stdId, String stdClass, String term, int subjectCode, String scoresYear, 
			String subjectName, double CA1, double CA2, double CA3, double examScore, double total, 
			String name, String grade, String user) {
		super();
		this.sId = sId;
		this.stdId = stdId;
		this.stdClass = stdClass;
		this.term = term;
		this.subjectCode = subjectCode;
		this.scoresYear = scoresYear;
		this.subjectName = subjectName;
		this.CA1 = CA1;
		this.CA2 = CA2;
		this.CA3 = CA3;
		this.examScore = examScore;
		this.total = total;
		this.name = name;
		this.grade = grade;
		this.user = user;
	}
	public ScoreSheets() {
		super();
	}
	
	public String getSId() {
		return sId;
	}
	
	public void setSId(String sId) {
		this.sId = sId;
	}
	
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	public String getStdClass() {
		return stdClass;
	}
	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public int getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public double getCA1() {
		return CA1;
	}
	public void setCA1(double CA1) {
		this.CA1 = CA1;
	}
	public double getCA2() {
		return CA2;
	}
	public void setCA2(double CA2) {
		this.CA2 = CA2;
	}
	public double getCA3() {
		return CA3;
	}
	public void setCA3(double CA3) {
		this.CA3 = CA3;
	}
	public double getExamScore() {
		return examScore;
	}
	public void setExamScore(double examScore) {
		this.examScore = examScore;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	public String getScoresYear() {
		return scoresYear;
	}
	public void setScoresYear(String scoresYear) {
		this.scoresYear = scoresYear;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
}
