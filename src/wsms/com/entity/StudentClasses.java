package wsms.com.entity;

import java.time.LocalDate;
import java.util.LinkedHashSet;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.eclipse.persistence.internal.oxm.schema.model.List;

@Entity

public class StudentClasses{
	@Id
	private String classId;
	private String classNo, classLetter, year, term, status;
	private LinkedHashSet<String> classCostList = new LinkedHashSet<>();
	
	private String user;
	private LocalDate entryDate;
	//@OneToMany(targetEntity=Students.class)
	private LinkedHashSet<String> stdList = new LinkedHashSet<>();
	
	//constructors
	public StudentClasses(String classId, String classNo, String classLetter, String year, String term,
			LinkedHashSet<String> classCostList, LinkedHashSet<String> stdList, String user, LocalDate entryDate, String status) {
		super();
		this.classId = classId;
		this.classNo = classNo;
		this.classLetter = classLetter;
		this.year = year;
		this.term = term;
		this.classCostList = classCostList;
		this.stdList = stdList;
		this.entryDate = entryDate;
		this.user = user;
		this.status = status;
	}
	
	public StudentClasses() {
		super();
	}

	//Getters and Setters
	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getClassLetter() {
		return classLetter;
	}

	public void setClassLetter(String classLetter) {
		this.classLetter = classLetter;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public LocalDate getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public LinkedHashSet<String> getClassCostList() {
		return classCostList;
	}

	public void setClassCostList(String classCostList) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add(classCostList);
		this.classCostList.addAll(set);
	}

	public LinkedHashSet<String> getStdList() {
		return stdList;
	}

	public void setStdList(String stdList) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add(stdList);
		this.stdList.addAll(set);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
