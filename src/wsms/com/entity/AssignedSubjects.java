package wsms.com.entity;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AssignedSubjects {
	
	@Id
	private String staffId;
	private String surName, otherNames, user;
	private LocalDate lastUpdateDate;
	LinkedHashSet<String> subjectList = new LinkedHashSet<>();
	LinkedHashSet<String> subjectCodeList = new LinkedHashSet<>();
	
	public AssignedSubjects(String staffId, String surName, String otherNames, LinkedHashSet<String> subjectList, 
			LinkedHashSet<String> subjectCodeList, LocalDate lastUpdateDate, String user) {
		super();
		this.setStaffId(staffId);
		this.surName = surName;
		this.otherNames = otherNames;
		this.subjectList = subjectList;
		this.subjectCodeList = subjectCodeList;
		this.lastUpdateDate = lastUpdateDate;
		this.user = user;
	}
	public AssignedSubjects() {
		super();
	}
	
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
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
	
	public LinkedHashSet<String> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(String subjectList) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add(subjectList);
		this.subjectList.addAll(set);
	}
	
	public LinkedHashSet<String> getSubjectCodeList() {
		return subjectCodeList;
	}

	public void setSubjectCodeList(String subjectCodeList) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add(subjectCodeList);
		this.subjectCodeList.addAll(set);
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	public LocalDate getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(LocalDate lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
}
