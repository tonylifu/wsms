package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class AnnualClassDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty studentID_Data, name_Data, first_Data, 
		second_Data, third_Data, totalScores_Data, avg_Data, percentage_Data, position_Data;
	
	public AnnualClassDataTable(String sNo, String studentID, String name, String first, 
			String second, String third, String totalScores, String avg, String percentage, String position) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.studentID_Data = new SimpleStringProperty(studentID);
		this.name_Data = new SimpleStringProperty(name);
		this.first_Data = new SimpleStringProperty(first);
		this.second_Data = new SimpleStringProperty(second);
		this.third_Data = new SimpleStringProperty(third);
		this.totalScores_Data = new SimpleStringProperty(totalScores);
		this.avg_Data = new SimpleStringProperty(avg);
		this.percentage_Data = new SimpleStringProperty(percentage);
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
	
	public String getFirst_Data() {
		return first_Data.get();
	}
	public void setFirst_Data(String first) {
		first_Data.set(first);
	}
	
	public String getSecond_Data() {
		return second_Data.get();
	}
	public void setSecond_Data(String second) {
		second_Data.set(second);
	}
	
	public String getThird_Data() {
		return third_Data.get();
	}
	public void setThird_Data(String third) {
		third_Data.set(third);
	}
	
	public String getTotalScores_Data() {
		return totalScores_Data.get();
	}
	public void setTotalScores_Data(String totalScores) {
		totalScores_Data.set(totalScores);
	}
	
	public String getAvg_Data() {
		return avg_Data.get();
	}
	public void setAvg_Data(String avg) {
		avg_Data.set(avg);
	}
	
	public String getPercentage_Data() {
		return percentage_Data.get();
	}
	
	public void setPercentage_Data(String percentage) {
		percentage_Data.set(percentage);
	}
	
	public String getPosition_Data() {
		return position_Data.get();
	}
	public void setPosition_Data(String position) {
		position_Data.set(position);
	}
}
