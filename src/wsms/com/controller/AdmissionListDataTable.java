package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class AdmissionListDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty formNo_Data, stdName_Data, session_Data, term_Data, stdClass_Data, 
		status_Data, date_Data;
	
	public AdmissionListDataTable(String sNo, String formNo, String stdName, String session, String term, 
			String stdClass, String status, String date) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.formNo_Data = new SimpleStringProperty(formNo);
		this.stdName_Data = new SimpleStringProperty(stdName);
		this.session_Data = new SimpleStringProperty(session);
		this.term_Data = new SimpleStringProperty(term);
		this.stdClass_Data = new SimpleStringProperty(stdClass);
		this.status_Data = new SimpleStringProperty(status);
		this.date_Data = new SimpleStringProperty(date);
	}

	public String getSNo_Data() {
		return sNo_Data.get();
	}
	public void setSNo_Data(String sNo) {
		sNo_Data.set(sNo);
	}
	
	public String getFormNo_Data() {
		return formNo_Data.get();
	}
	public void setFormNo_Data(String formNo) {
		formNo_Data.set(formNo);
	}
	
	public String getStdName_Data() {
		return stdName_Data.get();
	}
	public void setStdName_Data(String stdName) {
		stdName_Data.set(stdName);
	}
	public String getSession_Data() {
		return session_Data.get();
	}
	public void setSession_Data(String session) {
		session_Data.set(session);
	}
	
	public String getTerm_Data() {
		return term_Data.get();
	}
	
	public void setTerm_Data(String term) {
		term_Data.set(term);
	}
	
	public String getStdClass_Data() {
		return stdClass_Data.get();
	}
	
	public void setStdClass_Data(String stdClass) {
		stdClass_Data.set(stdClass);
	}
	
	public String getStatus_Data() {
		return status_Data.get();
	}
	
	public void setStatus_Data(String status) {
		status_Data.set(status);
	}
	
	public String getDate_Data() {
		return date_Data.get();
	}
	
	public void setDate_Data(String date) {
		date_Data.set(date);
	}
}
