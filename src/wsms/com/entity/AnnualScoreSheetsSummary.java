package wsms.com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnnualScoreSheetsSummary {
	@Id
	private String sumId;
	private int subjectCode;
	private String studentName, studentClass, subjectName, academicYear, studentId, user;

	private Double firstTermTotal, secondTermTotal, thirdTermTotal, totalScores;
	
	//constructors
	public AnnualScoreSheetsSummary(String sumId, String studentId, String studentName, String studentClass,
			int subjectCode, String subjectName, String academicYear, double firstTermTotal, double secondTermTotal,
			double thirdTermTotal, double totalScores, String user) {
		super();
		this.sumId = sumId;
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.academicYear = academicYear;
		this.firstTermTotal = firstTermTotal;
		this.secondTermTotal = secondTermTotal;
		this.thirdTermTotal = thirdTermTotal;
		this.totalScores = totalScores;
		this.user = user;
	}
	public AnnualScoreSheetsSummary() {
		super();
	}
	
	//Getters and Setters
	
	public String getSumId() {
		return sumId;
	}
	public void setSumId(String sumId) {
		this.sumId = sumId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
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
	
	public String getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}
	public Double getFirstTermTotal() {
		return firstTermTotal;
	}
	public void setFirstTermTotal(Double firstTermTotal) {
		this.firstTermTotal = firstTermTotal;
	}
	public Double getSecondTermTotal() {
		return secondTermTotal;
	}
	public void setSecondTermTotal(Double secondTermTotal) {
		this.secondTermTotal = secondTermTotal;
	}
	public Double getThirdTermTotal() {
		return thirdTermTotal;
	}
	public void setThirdTermTotal(Double thirdTermTotal) {
		this.thirdTermTotal = thirdTermTotal;
	}
	public Double getTotalScores() {
		return totalScores;
	}
	public void setTotalScores(Double totalScores) {
		this.totalScores = totalScores;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

}
