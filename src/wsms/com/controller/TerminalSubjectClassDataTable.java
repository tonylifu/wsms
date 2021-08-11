package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class TerminalSubjectClassDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty studentID_Data, name_Data, subject_Data, totalScores_Data,
		grade_Data, position_Data, remark_Data;
	
	public TerminalSubjectClassDataTable(String sNo, String studentID, String name, String subject, String totalScores, 
			String grade, String position, String remark) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.studentID_Data = new SimpleStringProperty(studentID);
		this.name_Data = new SimpleStringProperty(name);
		this.subject_Data = new SimpleStringProperty(subject);
		this.totalScores_Data = new SimpleStringProperty(totalScores);
		this.grade_Data = new SimpleStringProperty(grade);
		this.position_Data = new SimpleStringProperty(position);
		this.remark_Data = new SimpleStringProperty(remark);
	}

	public String getSNo_Data() {
		return sNo_Data.get();
	}
	public void setSNo_Data(String sNo) {
		sNo_Data.set(sNo);
	}
	
	public String getStudentID_Data() {
		return studentID_Data.get();
	}
	public void setStudentID_Data(String studentID) {
		studentID_Data.set(studentID);
	}
	
	public String getName_Data() {
		return name_Data.get();
	}
	public void setName_Data(String name) {
		name_Data.set(name);
	}
	
	public String getSubject_Data() {
		return subject_Data.get();
	}
	public void setSubject_Data(String subject) {
		subject_Data.set(subject);
	}
	public String getTotalScores_Data() {
		return totalScores_Data.get();
	}
	public void setTotalScores_Data(String totalScores) {
		totalScores_Data.set(totalScores);
	}
	
	public String getGrade_Data() {
		return grade_Data.get();
	}
	
	public void setGrade_Data(String grade) {
		grade_Data.set(grade);
	}
	
	public String getPosition_Data() {
		return position_Data.get();
	}
	public void setPosition_Data(String position) {
		position_Data.set(position);
	}
	
	public String getRemark_Data() {
		return remark_Data.get();
	}
	public void setRemark_Data(String remark) {
		remark_Data.set(remark);
	}
}
