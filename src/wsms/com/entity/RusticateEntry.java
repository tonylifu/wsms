package wsms.com.entity;

import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RusticateEntry {
	
	@Id
	private String stdNo;
	private String surName, otherNames, age, sex, borderStatus, stdClass, user;
	private LinkedList<String> rusticateTextFlow = new LinkedList<>();
	
	public RusticateEntry(String stdNo, String surName, String otherNames, String age, String sex, 
			String borderStatus, String stdClass, LinkedList<String> rusticateTextFlow, String user) {
		super();
		this.stdNo = stdNo;
		this.surName = surName;
		this.otherNames = otherNames;
		this.age = age;
		this.sex = sex;
		this.borderStatus = borderStatus;
		this.stdClass = stdClass;
		this.rusticateTextFlow = rusticateTextFlow;
		this.user = user;
	}
	public RusticateEntry() {
		super();
	}
	
	//getters and setters
	public String getStdNo() {
		return stdNo;
	}
	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getOtherNames() {
		return otherNames;
	}
	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public LinkedList<String> getRusticateTextFlow() {
		return rusticateTextFlow;
	}
	public void setRusticateTextFlow(String text) {
		LinkedList<String> list = new LinkedList<>();
		list.add(text);
		this.rusticateTextFlow.addAll(list);
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBorderStatus() {
		return borderStatus;
	}
	public void setBorderStatus(String borderStatus) {
		this.borderStatus = borderStatus;
	}
	public String getStdClass() {
		return stdClass;
	}
	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
	
}

