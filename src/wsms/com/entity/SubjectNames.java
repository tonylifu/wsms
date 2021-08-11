package wsms.com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SubjectNames {
	
	@Id
	private int subjectCode;
	private String subjectName, teacher;
	
	public SubjectNames(int subjectCode, String subjectName, String teacher) {
		super();
		this.subjectCode = subjectCode;
		this.setSubjectName(subjectName);
		this.setTeacher(teacher);
	}
	public SubjectNames() {
		super();
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
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	@Override
	public String toString() {
		return "[Subject ID: "+ subjectCode+ ", Subject: "+subjectName+ ", Teacher: "+ teacher+"]";
	}

}
