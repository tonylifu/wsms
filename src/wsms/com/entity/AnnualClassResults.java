package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnnualClassResults {
	
	@Id
	private String aRId; //stdNo+session
	private String stdNo, name, sex, stdClass, session, position, user;
	private int noInClass, noDaysInTerm, noDaysPresent, noDaysAbsent, age;
	private LocalDate date;
	
	public AnnualClassResults(String aRId, String stdNo, String name, String sex, String stdClass, 
			String session, String position, int noInClass, int noDaysInTerm, int noDaysPresent, int noDaysAbsent, 
			int age, LocalDate date, String user) {
		super();
		this.aRId = aRId;
		this.stdNo = stdNo;
		this.name = name; //surname, othernames
		this.sex = sex;
		this.stdClass = stdClass;
		this.session = session;
		this.position = position;
		this.noInClass = noInClass;
		this.noDaysInTerm = noDaysInTerm;
		this.noDaysPresent = noDaysPresent;
		this.noDaysAbsent = noDaysAbsent;
		this.age = age;
		this.date = date;
		this.user = user;
	}
	public AnnualClassResults() {
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getNoInClass() {
		return noInClass;
	}
	public void setNoInClass(int noInClass) {
		this.noInClass = noInClass;
	}
	public int getNoDaysInTerm() {
		return noDaysInTerm;
	}
	public void setNoDaysInTerm(int noDaysInTerm) {
		this.noDaysInTerm = noDaysInTerm;
	}
	public int getNoDaysPresent() {
		return noDaysPresent;
	}
	public void setNoDaysPresent(int noDaysPresent) {
		this.noDaysPresent = noDaysPresent;
	}
	public int getNoDaysAbsent() {
		return noDaysAbsent;
	}
	public void setNoDaysAbsent(int noDaysAbsent) {
		this.noDaysAbsent = noDaysAbsent;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
		

}
