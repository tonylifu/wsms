package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JSSClassResults {
	
	@Id
	private String rId; //stdNo+session+term
	private String stdNo, name, sex, stdClass, term, session, position, user;
	private int noInClass, noDaysInTerm, noDaysPresent, noDaysAbsent, age;
	private LocalDate date;
	
	public JSSClassResults(String rId, String stdNo, String name, String sex, String stdClass, String term, 
			String session, String position, int noInClass, int noDaysInTerm, int noDaysPresent, int noDaysAbsent, 
			int age, LocalDate date, String user) {
		super();
		this.rId = rId;
		this.stdNo = stdNo;
		this.name = name; //surname, othernames
		this.sex = sex;
		this.stdClass = stdClass;
		this.term = term;
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
	public JSSClassResults() {
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
