package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class KusakiSSSDataTable {
	@FXML private SimpleStringProperty subjectName_Data;
	@FXML private SimpleStringProperty ASS1_Data, ASS2_Data, ASS3_Data, exam_Data, total_Data;
	@FXML private SimpleStringProperty grade_Data, position_Data, classAvg_Data, classHighest_Data,
	classLowest_Data, remark_Data;
	
	public KusakiSSSDataTable(String subjectName, String ASS1, String ASS2, String ASS3,
			String exam, String total, String grade, String position, String classAvg, 
			String classHighest, String classLowest, String remark) {
		this.subjectName_Data = new SimpleStringProperty(subjectName);
		this.ASS1_Data = new SimpleStringProperty(ASS1);
		this.ASS2_Data = new SimpleStringProperty(ASS2);
		this.ASS3_Data = new SimpleStringProperty(ASS3);
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
	
	public String getASS1_Data() {
		return ASS1_Data.get();
	}
	public void setASS1_Data(String ASS1) {
		ASS1_Data.set(ASS1);
	}
	
	public String getASS2_Data() {
		return ASS2_Data.get();
	}
	public void setASS2_Data(String ASS2) {
		ASS2_Data.set(ASS2);
	}
	
	public String getASS3_Data() {
		return ASS3_Data.get();
	}
	public void setASS3_Data(String ASS3) {
		ASS3_Data.set(ASS3);
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
