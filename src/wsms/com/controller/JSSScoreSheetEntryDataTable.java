package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class JSSScoreSheetEntryDataTable {
	@FXML private SimpleStringProperty sNo_Data, stdNo_Data, stdName_Data;
	@FXML private SimpleStringProperty CA1_Data, CA2_Data, CA3_Data, CA4_Data, CA5_Data, CA6_Data,
		exam_Data, total_Data, grade_Data;
	
	public JSSScoreSheetEntryDataTable(String sNo, String stdNo, String stdName, String CA1, String CA2, 
			String CA3, String CA4, String CA5, String CA6, String exam, String total, String grade) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.stdNo_Data = new SimpleStringProperty(stdNo);
		this.stdName_Data = new SimpleStringProperty(stdName);
		this.CA1_Data = new SimpleStringProperty(CA1);
		this.CA2_Data = new SimpleStringProperty(CA2);
		this.CA3_Data = new SimpleStringProperty(CA3);
		this.CA4_Data = new SimpleStringProperty(CA4);
		this.CA5_Data = new SimpleStringProperty(CA5);
		this.CA6_Data = new SimpleStringProperty(CA6);
		this.exam_Data = new SimpleStringProperty(exam);
		this.total_Data = new SimpleStringProperty(total);
		this.grade_Data = new SimpleStringProperty(grade);
	}

	public String getSNo_Data() {
		return sNo_Data.get();
	}
	public void setSNo_Data(String sNo) {
		sNo_Data.set(sNo);
	}
	
	public String getStdNo_Data() {
		return stdNo_Data.get();
	}
	public void setStdNo_Data(String stdNo) {
		stdNo_Data.set(stdNo);
	}
	
	public String getStdName_Data() {
		return stdName_Data.get();
	}
	public void setStdName_Data(String stdName) {
		stdName_Data.set(stdName);
	}
	
	public String getCA1_Data() {
		return CA1_Data.get();
	}
	public void setCA1_Data(String CA1) {
		CA1_Data.set(CA1);
	}
	
	public String getCA2_Data() {
		return CA2_Data.get();
	}
	public void setCA2_Data(String CA2) {
		CA2_Data.set(CA2);
	}
	
	public String getCA3_Data() {
		return CA3_Data.get();
	}
	public void setCA3_Data(String CA3) {
		CA3_Data.set(CA3);
	}
	
	//
	public String getCA4_Data() {
		return CA4_Data.get();
	}
	public void setCA4_Data(String CA4) {
		CA4_Data.set(CA4);
	}
	
	public String getCA5_Data() {
		return CA5_Data.get();
	}
	public void setCA5_Data(String CA5) {
		CA5_Data.set(CA5);
	}
	
	public String getCA6_Data() {
		return CA6_Data.get();
	}
	public void setCA6_Data(String CA6) {
		CA6_Data.set(CA6);
	}
	
	public String getExam_Data() {
		return exam_Data.get();
	}
	public void setExam_Data(String exam) {
		exam_Data.set(exam);
	}
	
	public String getTotal_Data() {
		return total_Data.get();
	}
	public void setTotal_Data(String total) {
		total_Data.set(total);
	}
	
	public String getGrade_Data() {
		return grade_Data.get();
	}
	public void setGrade_Data(String grade) {
		grade_Data.set(grade);
	}
}
