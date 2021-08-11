package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class TerminalClassDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty studentID_Data, name_Data, classAvg_Data, 
		classHighest_Data, classLowest_Data, totalScores_Data, position_Data;
	
	public TerminalClassDataTable(String sNo, String studentID, String name, String classAvg, 
			String classHighest, String classLowest, String totalScores, String position) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.studentID_Data = new SimpleStringProperty(studentID);
		this.name_Data = new SimpleStringProperty(name);
		this.classAvg_Data = new SimpleStringProperty(classAvg);
		this.classHighest_Data = new SimpleStringProperty(classHighest);
		this.classLowest_Data = new SimpleStringProperty(classLowest);
		this.totalScores_Data = new SimpleStringProperty(totalScores);
		this.position_Data = new SimpleStringProperty(position);
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
	
	public String getClassAvg_Data() {
		return classAvg_Data.get();
	}
	public void setClassAvg_Data(String classAvg) {
		classAvg_Data.set(classAvg);
	}
	
	public String getClassHighest_Data() {
		return classHighest_Data.get();
	}
	public void setClassHighest_Data(String classHighest) {
		classHighest_Data.set(classHighest);
	}
	
	public String getClassLowest_Data() {
		return classLowest_Data.get();
	}
	public void setClassLowest_Data(String classLowest) {
		classLowest_Data.set(classLowest);
	}
	
	public String getTotalScores_Data() {
		return totalScores_Data.get();
	}
	public void setTotalScores_Data(String totalScores) {
		totalScores_Data.set(totalScores);
	}
	
	public String getPosition_Data() {
		return position_Data.get();
	}
	public void setPosition_Data(String position) {
		position_Data.set(position);
	}
}
