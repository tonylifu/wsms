package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JSSSubjectsResults {
	
	@Id
	private String rId; //stdNo+session+term+subjectCode
	private String stdNo, name, subjectName, stdClass, term, session, position, grade, remark, user;
	private int subjectCode;
	private double CA1, CA2, CA3, CA4, CA5, CA6, exam, total, classAvg, classHighest, classLowest;
	private LocalDate date;
	
	public JSSSubjectsResults(String rId, String stdNo, String name, String subjectName, String stdClass, String term, 
			String session, String position, String grade, String remark, int subjectCode, double CA1,
			double CA2, double CA3, double CA4, double CA5, double CA6, double exam, double total, double classAvg,
			double classHighest, double classLowest, LocalDate date, String user) {
		super();
		this.rId = rId;
		this.stdNo = stdNo;
		this.name = name;
		this.subjectName = subjectName;
		this.stdClass = stdClass;
		this.term = term;
		this.session = session;
		this.position = position;
		this.grade = grade;
		this.remark = remark;
		this.subjectCode = subjectCode;
		this.CA1 = CA1;
		this.CA2 = CA2;
		this.CA3 = CA3;
		this.CA4 = CA4;
		this.CA5 = CA5;
		this.CA6 = CA6;
		this.exam = exam;
		this.total = total;
		this.classAvg = classAvg;
		this.classHighest = classHighest;
		this.classLowest = classLowest;
		this.date = date;
		this.user = user;
	}
	public JSSSubjectsResults() {
		super();
	}
	
	//Getters and Setters
	public String getRId() {
		return rId;
	}
	public void setRId(String rId) {
		this.rId = rId;
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
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
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
	public double getCA1() {
		return CA1;
	}
	public void setCA1(double cA1) {
		CA1 = cA1;
	}
	public double getCA2() {
		return CA2;
	}
	public void setCA2(double cA2) {
		CA2 = cA2;
	}
	public double getCA3() {
		return CA3;
	}
	public void setCA3(double cA3) {
		CA3 = cA3;
	}
	public double getCA4() {
		return CA4;
	}
	public void setCA4(double cA4) {
		CA4 = cA4;
	}
	public double getCA5() {
		return CA5;
	}
	public void setCA5(double cA5) {
		CA5 = cA5;
	}
	public double getCA6() {
		return CA6;
	}
	public void setCA6(double cA6) {
		CA6 = cA6;
	}
	public double getExam() {
		return exam;
	}
	public void setExam(double exam) {
		this.exam = exam;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getClassAvg() {
		return classAvg;
	}
	public void setClassAvg(double classAvg) {
		this.classAvg = classAvg;
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

}
