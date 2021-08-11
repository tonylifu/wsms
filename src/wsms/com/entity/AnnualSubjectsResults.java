package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnnualSubjectsResults {
	
	@Id
	private String aRId; //stdNo+session+subjectCode
	private String stdNo, name, subjectName, stdClass, session, position, grade, remark, user;
	private int subjectCode;
	private double firstTerm, secondTerm, thirdTerm, total, annualAvg, classHighest, classLowest;
	private LocalDate date;
	
	public AnnualSubjectsResults(String aRId, String stdNo, String name, String subjectName, String stdClass, 
			String session, String position, String grade, String remark, int subjectCode, double firstTerm,
			double secondTerm, double thirdTerm, double total, double annualAvg,
			double classHighest, double classLowest, LocalDate date, String user) {
		super();
		this.aRId = aRId;
		this.stdNo = stdNo;
		this.name = name;
		this.subjectName = subjectName;
		this.stdClass = stdClass;
		this.session = session;
		this.position = position;
		this.grade = grade;
		this.remark = remark;
		this.subjectCode = subjectCode;
		this.firstTerm = firstTerm;
		this.secondTerm = secondTerm;
		this.thirdTerm = thirdTerm;
		this.total = total;
		this.annualAvg = annualAvg;
		this.classHighest = classHighest;
		this.classLowest = classLowest;
		this.date = date;
		this.user = user;
	}
	public AnnualSubjectsResults() {
		super();
	}
	
	//Getters and Setters
	public String getARId() {
		return aRId;
	}
	public void setARId(String aRId) {
		this.aRId = aRId;
	}
	public String getStdNo() {
		return stdNo;
	}
	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
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
	public String getStdClass() {
		return stdClass;
	}
	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getAnnualAvg() {
		return annualAvg;
	}
	public void setAnnualAvg(double annualAvg) {
		this.annualAvg = annualAvg;
	}
	public double getClassHighest() {
		return classHighest;
	}
	public void setClassHighest(double classHighest) {
		this.classHighest = classHighest;
	}
	public double getClassLowest() {
		return classLowest;
	}
	public void setClassLowest(double classLowest) {
		this.classLowest = classLowest;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getFirstTerm() {
		return firstTerm;
	}
	public void setFirstTerm(double firstTerm) {
		this.firstTerm = firstTerm;
	}
	public double getSecondTerm() {
		return secondTerm;
	}
	public void setSecondTerm(double secondTerm) {
		this.secondTerm = secondTerm;
	}
	public double getThirdTerm() {
		return thirdTerm;
	}
	public void setThirdTerm(double thirdTerm) {
		this.thirdTerm = thirdTerm;
	}

}
