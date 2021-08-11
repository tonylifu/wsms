package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class AttendanceDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty stdId_Data, name_Data, isPresent_Data, 
		presents_Data, absents_Data, possibleAttendanceTerm_Data, possibleAttendanceCurrent_Data;
	
	public AttendanceDataTable(String sNo, String stdId, String name, String isPresent, 
			String presents, String absents, String possibleAttendanceTerm, 
			String possibleAttendanceCurrent) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.stdId_Data = new SimpleStringProperty(stdId);
		this.name_Data = new SimpleStringProperty(name);
		this.isPresent_Data = new SimpleStringProperty(isPresent);
		this.presents_Data = new SimpleStringProperty(presents);
		this.absents_Data = new SimpleStringProperty(absents);
		this.possibleAttendanceTerm_Data = new SimpleStringProperty(possibleAttendanceTerm);
		this.possibleAttendanceCurrent_Data = new SimpleStringProperty(possibleAttendanceCurrent);
	}

	public String getSNo_Data() {
		return sNo_Data.get();
	}
	public void setSNo_Data(String sNo) {
		sNo_Data.set(sNo);
	}
	
	public String getStdId_Data() {
		return stdId_Data.get();
	}
	public void setStdId_Data(String stdId) {
		stdId_Data.set(stdId);
	}
	
	public String getName_Data() {
		return name_Data.get();
	}
	public void setName_Data(String name) {
		name_Data.set(name);
	}
	
	public String getIsPresent_Data() {
		return isPresent_Data.get();
	}
	public void setIsPresent_Data(String isPresent) {
		isPresent_Data.set(isPresent);
	}
	
	public String getPresents_Data() {
		return presents_Data.get();
	}
	public void setPresents_Data(String presents) {
		presents_Data.set(presents);
	}
	
	public String getAbsents_Data() {
		return absents_Data.get();
	}
	public void setAbsents_Data(String absents) {
		absents_Data.set(absents);
	}
	
	public String getPossibleAttendanceTerm_Data() {
		return possibleAttendanceTerm_Data.get();
	}
	public void setPossibleAttendanceTerm_Data(String possibleAttendanceTerm) {
		possibleAttendanceTerm_Data.set(possibleAttendanceTerm);
	}
	
	public String getPossibleAttendanceCurrent_Data() {
		return possibleAttendanceCurrent_Data.get();
	}
	public void setPossibleAttendanceCurrent_Data(String possibleAttendanceTerm) {
		possibleAttendanceCurrent_Data.set(possibleAttendanceTerm);
	}
	
}
