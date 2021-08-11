package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class AssignedSubjectsDataTable {
	@FXML private SimpleStringProperty subjectCode_Data, subjectName_Data;
	
	public AssignedSubjectsDataTable(String subjectCode, String subjectName) {
		this.subjectCode_Data = new SimpleStringProperty(subjectCode);
		this.subjectName_Data = new SimpleStringProperty(subjectName);
	}

	public String getSubjectCode_Data() {
		return subjectCode_Data.get();
	}
	public void setSubjectCode_Data(String subjectCode) {
		subjectCode_Data.set(subjectCode);
	}
	
	public String getSubjectName_Data() {
		return subjectName_Data.get();
	}
	
	public void setSubjectName_Data(String subjectName) {
		subjectName_Data.set(subjectName);
	}
}
