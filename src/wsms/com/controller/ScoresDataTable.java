package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class ScoresDataTable {
	@FXML private SimpleStringProperty subjectName_Data;
	@FXML private SimpleStringProperty CA1_Data, CA2_Data, CA3_Data, exam_Data, total_Data;
	@FXML private SimpleStringProperty grade_Data, position_Data, classAvg_Data, classHighest_Data,
	classLowest_Data, remark_Data;
	
	public ScoresDataTable(String subjectName, String CA1, String CA2, String CA3,
			String exam, String total, String grade, String position,String classAvg,
			String classHighest, String classLowest, String remark) {
		this.subjectName_Data = new SimpleStringProperty(subjectName);
		this.CA1_Data = new SimpleStringProperty(CA1);
		this.CA2_Data = new SimpleStringProperty(CA2);
		this.CA3_Data = new SimpleStringProperty(CA3);
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
