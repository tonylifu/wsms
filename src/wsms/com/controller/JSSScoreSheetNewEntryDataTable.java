package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class JSSScoreSheetNewEntryDataTable {
	@FXML private SimpleStringProperty sNo_Data, stdNo_Data, stdName_Data;
	@FXML private SimpleStringProperty test1_Data, ASS1_Data, CWK1_Data, proj_Data, ASS2_Data, 
		CWK2_Data, test2_Data, ASS3_Data, CWK3_Data, totalCAs_Data,
		exam_Data, total_Data, grade_Data;
	
	public JSSScoreSheetNewEntryDataTable(String sNo, String stdNo, String stdName, String test1, 
			String ASS1, String CWK1, String proj, String ASS2, String CWK2, String test2,
			String ASS3, String CWK3, String totalCAs, String exam, String total, String grade) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.stdNo_Data = new SimpleStringProperty(stdNo);
		this.stdName_Data = new SimpleStringProperty(stdName);
		this.test1_Data = new SimpleStringProperty(test1);
		this.ASS1_Data = new SimpleStringProperty(ASS1);
		this.CWK1_Data = new SimpleStringProperty(CWK1);
		this.proj_Data = new SimpleStringProperty(proj);
		this.ASS2_Data = new SimpleStringProperty(ASS2);
		this.CWK2_Data = new SimpleStringProperty(CWK2);
		this.test2_Data = new SimpleStringProperty(test2);
		this.ASS3_Data = new SimpleStringProperty(ASS3);
		this.CWK3_Data = new SimpleStringProperty(CWK3);
		this.totalCAs_Data = new SimpleStringProperty(totalCAs);
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
	
	public String getTest1_Data() {
		return test1_Data.get();
	}
	public void setTest1_Data(String test1) {
		test1_Data.set(test1);
	}
	
	public String getASS1_Data() {
		return ASS1_Data.get();
	}
	public void setASS1_Data(String ASS1) {
		ASS1_Data.set(ASS1);
	}
	
	public String getCWK1_Data() {
		return CWK1_Data.get();
	}
	public void setCWK1_Data(String CWK1) {
		CWK1_Data.set(CWK1);
	}
	
	public String getProj_Data() {
		return proj_Data.get();
	}
	public void setProj_Data(String proj) {
		proj_Data.set(proj);
	}
	
	public String getASS2_Data() {
		return ASS2_Data.get();
	}
	public void setASS2_Data(String ASS2) {
		ASS2_Data.set(ASS2);
	}
	
	public String getCWK2_Data() {
		return CWK2_Data.get();
	}
	public void setCWK2_Data(String CWK2) {
		CWK2_Data.set(CWK2);
	}
	
	public String getTest2_Data() {
		return test2_Data.get();
	}
	public void setTest2_Data(String test2) {
		test2_Data.set(test2);
	}
	
	public String getASS3_Data() {
		return ASS3_Data.get();
	}
	public void setASS3_Data(String ASS3) {
		ASS3_Data.set(ASS3);
	}
	
	public String getCWK3_Data() {
		return CWK3_Data.get();
	}
	public void setCWK3_Data(String CWK3) {
		CWK3_Data.set(CWK3);
	}
	
	public String getTotalCAs_Data() {
		return totalCAs_Data.get();
	}
	public void setTotalCAs_Data(String totalCAs) {
		totalCAs_Data.set(totalCAs);
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
