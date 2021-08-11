package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class AnnualScoresDataTable {
	@FXML private SimpleStringProperty subjectName_Data;
	@FXML private SimpleStringProperty firstTerm_Data, secondTerm_Data, thirdTerm_Data, 
		annualTotal_Data, annualClassAvg_Data, annualClassHighest_Data, annualClassLowest_Data, 
		annualGrade_Data, annualPosition_Data, annualRemark_Data;
	
	public AnnualScoresDataTable(String subjectName, String firstTerm, String secondTerm, String thirdTerm, 
			String annualTotal, String annualClassAvg, String annualClassHighest, String annualClassLowest,
			String annualGrade, String annualPosition, String annualRemark) {
		this.subjectName_Data = new SimpleStringProperty(subjectName);
		this.firstTerm_Data = new SimpleStringProperty(firstTerm);
		this.secondTerm_Data = new SimpleStringProperty(secondTerm);
		this.thirdTerm_Data = new SimpleStringProperty(thirdTerm);
		this.annualTotal_Data = new SimpleStringProperty(annualTotal);
		this.annualClassAvg_Data = new SimpleStringProperty(annualClassAvg);
		this.annualClassHighest_Data = new SimpleStringProperty(annualClassHighest);
		this.annualClassLowest_Data = new SimpleStringProperty(annualClassLowest);
		this.annualGrade_Data = new SimpleStringProperty(annualGrade);
		this.annualPosition_Data = new SimpleStringProperty(annualPosition);
		this.annualRemark_Data = new SimpleStringProperty(annualRemark);
	}

	public String getSubjectName_Data() {
		return subjectName_Data.get();
	}
	public void setSubjectName_Data(String subjectName) {
		subjectName_Data.set(subjectName);
	}
	
	public String getFirstTerm_Data() {
		return firstTerm_Data.get();
	}
	public void setFirstTerm_Data(String firstTerm) {
		firstTerm_Data.set(firstTerm);
	}
	
	public String getSecondTerm_Data() {
		return secondTerm_Data.get();
	}
	public void setSecondTerm_Data(String secondTerm) {
		secondTerm_Data.set(secondTerm);
	}
	
	public String getThirdTerm_Data() {
		return thirdTerm_Data.get();
	}
	public void setThirdTerm_Data(String thirdTerm) {
		thirdTerm_Data.set(thirdTerm);
	}
	
	public String getAnnualTotal_Data() {
		return annualTotal_Data.get();
	}
	public void setAnnualTotal_Data(String annualTotal) {
		annualTotal_Data.set(annualTotal);
	}
	
	public String getAnnualClassAvg_Data() {
		return annualClassAvg_Data.get();
	}
	public void setAnnualClassAvg_Data(String annualClassAvg) {
		annualClassAvg_Data.set(annualClassAvg);
	}
	
	public String getAnnualClassHighest_Data() {
		return annualClassHighest_Data.get();
	}
	public void setAnnualClassHighest_Data(String annualClassHighest) {
		annualClassHighest_Data.set(annualClassHighest);
	}
	
	public String getAnnualClassLowest_Data() {
		return annualClassLowest_Data.get();
	}
	public void setAnnualClassLowest_Data(String annualClassLowest) {
		annualClassLowest_Data.set(annualClassLowest);
	}
	
	public String getAnnualGrade_Data() {
		return annualGrade_Data.get();
	}
	public void setAnnualGrade_Data(String annualGrade) {
		annualGrade_Data.set(annualGrade);
	}
	
	public String getAnnualPosition_Data() {
		return annualPosition_Data.get();
	}
	public void setAnnualPosition_Data(String annualPosition) {
		annualPosition_Data.set(annualPosition);
	}
	
	public String getAnnualRemark_Data() {
		return annualRemark_Data.get();
	}
	public void setAnnualRemark_Data(String annualRemark) {
		annualRemark_Data.set(annualRemark);
	}
}
