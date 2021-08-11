package wsms.com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnnualScoresTotalAvg {
	@Id
	private String sumId;
	private String studentId;
	private String studentName, studentClass, academicYear, user, lastUpdateUser;
	private double totalScores, avgScores;
	private int noSubjects;
	
	//constructors
	public AnnualScoresTotalAvg(String sumId, String studentId, String studentName, String studentClass,
			String academicYear, double totalScores, String user, String lastUpdateUser, 
			double avgScores, int noSubjects) {
		super();
		this.sumId = sumId;
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.academicYear = academicYear;
		this.totalScores = totalScores;
		this.user = user;
		this.lastUpdateUser = lastUpdateUser;
		this.avgScores = avgScores;
		this.noSubjects = noSubjects;
	}
	public AnnualScoresTotalAvg() {
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
	public String getLastUpdateUser() {
		return lastUpdateUser;
	}
	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}
	public double getAvgScores() {
		return avgScores;
	}
	public void setAvgScores(double avgScores) {
		this.avgScores = avgScores;
	}
	public int getNoSubjects() {
		return noSubjects;
	}
	public void setNoSubjects(int noSubjects) {
		this.noSubjects = noSubjects;
	}

}
