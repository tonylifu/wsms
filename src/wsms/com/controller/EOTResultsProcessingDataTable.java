package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class EOTResultsProcessingDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty stdClass_Data, session_Data, term_Data, status_Data;
	
	public EOTResultsProcessingDataTable(String sNo, String stdClass, String session, String term, 
			String status) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.stdClass_Data = new SimpleStringProperty(stdClass);
		this.session_Data = new SimpleStringProperty(session);
		this.term_Data = new SimpleStringProperty(term);
		this.status_Data = new SimpleStringProperty(status);
	}

	public String getSNo_Data() {
		return sNo_Data.get();
	}
	public void setSNo_Data(String sNo) {
		sNo_Data.set(sNo);
	}
	
	public String getStdClass_Data() {
		return stdClass_Data.get();
	}
	public void setStdClass_Data(String stdClass) {
		stdClass_Data.set(stdClass);
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
	
	public String getStatus_Data() {
		return status_Data.get();
	}
	public void setStatus_Data(String status) {
		status_Data.set(status);
	}
}
