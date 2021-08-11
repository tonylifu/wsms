package wsms.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JssScoreSheetsNew {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE) 
	private String sId;
	private String stdClass;
	private String stdId;
	private String term;
	private int subjectCode;
	
	private double ASS1, ASS2, ASS3, classWork1, classWork2, classWork3, test1, test2, 
		project, examScore, total;
	private String name, subjectName, grade, scoresYear, user;
	public JssScoreSheetsNew(String sId, String stdClass, String stdId, String term, int subjectCode, double ASS1,
			double ASS2, double ASS3, double classWork1, double classWork2, double classWork3, double test1,
			double test2, double project, double examScore, double total, String name, String subjectName, String grade,
			String scoresYear, String user) {
		super();
		this.sId = sId;
		this.stdClass = stdClass;
		this.stdId = stdId;
		this.term = term;
		this.subjectCode = subjectCode;
		this.ASS1 = ASS1;
		this.ASS2 = ASS2;
		this.ASS3 = ASS3;
		this.classWork1 = classWork1;
		this.classWork2 = classWork2;
		this.classWork3 = classWork3;
		this.test1 = test1;
		this.test2 = test2;
		this.project = project;
		this.examScore = examScore;
		this.total = total;
		this.name = name;
		this.subjectName = subjectName;
		this.grade = grade;
		this.scoresYear = scoresYear;
		this.user = user;
	}
	public JssScoreSheetsNew() {
		super();
	}
	public String getSId() {
		return sId;
	}
	public void setSId(String sId) {
		this.sId = sId;
	}
	public String getStdClass() {
		return stdClass;
	}
	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
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
	public double getASS1() {
		return ASS1;
	}
	public void setASS1(double aSS1) {
		ASS1 = aSS1;
	}
	public double getASS2() {
		return ASS2;
	}
	public void setASS2(double aSS2) {
		ASS2 = aSS2;
	}
	public double getASS3() {
		return ASS3;
	}
	public void setASS3(double aSS3) {
		ASS3 = aSS3;
	}
	public double getClassWork1() {
		return classWork1;
	}
	public void setClassWork1(double classWork1) {
		this.classWork1 = classWork1;
	}
	public double getClassWork2() {
		return classWork2;
	}
	public void setClassWork2(double classWork2) {
		this.classWork2 = classWork2;
	}
	public double getClassWork3() {
		return classWork3;
	}
	public void setClassWork3(double classWork3) {
		this.classWork3 = classWork3;
	}
	public double getTest1() {
		return test1;
	}
	public void setTest1(double test1) {
		this.test1 = test1;
	}
	public double getTest2() {
		return test2;
	}
	public void setTest2(double test2) {
		this.test2 = test2;
	}
	public double getProject() {
		return project;
	}
	public void setProject(double project) {
		this.project = project;
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
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
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
