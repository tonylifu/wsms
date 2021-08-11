package wsms.com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnnualScoresTotal {
	@Id
	private String sumId;
	private String studentId;
	private String studentName, studentClass, academicYear, user;
	private Double totalScores;
	
	//constructors
	public AnnualScoresTotal(String sumId, String studentId, String studentName, String studentClass,
			String academicYear, double totalScores, String user) {
		super();
		this.sumId = sumId;
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.academicYear = academicYear;
		this.totalScores = totalScores;
		this.user = user;
	}
	public AnnualScoresTotal() {
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
	
	public String getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
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
