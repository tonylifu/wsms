package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class JssNewScoresDataTable {
	@FXML private SimpleStringProperty subjectName_Data;
	@FXML private SimpleStringProperty test1_Data, ASS1_Data, CWK1_Data, proj_Data, ASS2_Data, 
		CWK2_Data, test2_Data, ASS3_Data, CWK3_Data,
		exam_Data, total_Data, grade_Data;
	@FXML private SimpleStringProperty position_Data, classAvg_Data, classHighest_Data,
	classLowest_Data, remark_Data;
	
	public JssNewScoresDataTable(String subjectName, String ASS1, String ASS2, String ASS3, 
			String CWK1, String CWK2, String CWK3, String test1, String test2, String proj, 
			String exam, String total, String grade, 
			String position,String classAvg,
			String classHighest, String classLowest, String remark) {
		this.subjectName_Data = new SimpleStringProperty(subjectName);
		this.ASS1_Data = new SimpleStringProperty(ASS1);
		this.ASS2_Data = new SimpleStringProperty(ASS2);
		this.ASS3_Data = new SimpleStringProperty(ASS3);
		this.CWK1_Data = new SimpleStringProperty(CWK1);
		this.CWK2_Data = new SimpleStringProperty(CWK2);
		this.CWK3_Data = new SimpleStringProperty(CWK3);
		this.test1_Data = new SimpleStringProperty(test1);
		this.test2_Data = new SimpleStringProperty(test2);
		this.proj_Data = new SimpleStringProperty(proj);
		this.exam_Data = new SimpleStringProperty(exam);
		this.total_Data = new SimpleStringProperty(total);
		this.grade_Data = new SimpleStringProperty(grade);
		this.position_Data = new SimpleStringProperty(position);
		this.classAvg_Data = new SimpleStringProperty(classAvg);
		this.classHighest_Data = new SimpleStringProperty(classHighest);
		this.classLowest_Data = new SimpleStringProperty(classLowest);
		this.remark_Data = new SimpleStringProperty(remark);
	}

	public String getSubjectName_Data() {
		return subjectName_Data.get();
	}
	public void setSubjectName_Data(String subjectName) {
		subjectName_Data.set(subjectName);
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
	public String getPosition_Data() {
		return position_Data.get();
	}
	public void setPosition_Data(String position) {
		position_Data.set(position);
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
	
	public String getRemark_Data() {
		return remark_Data.get();
	}
	
	public void setRemark_Data(String remark) {
		remark_Data.set(remark);
	}
}
