package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class ConcessionDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty stdNo_Data, name_Data, stdClass_Data, 
		concessionDate_Data, concessionExpires_Data, graceDaysRemains_Data, status_Data;
	
	public ConcessionDataTable(String sNo, String stdNo, String name, String stdClass, 
			String concessionDate, String concessionExpires, String graceDaysRemains, 
			String status) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.stdNo_Data = new SimpleStringProperty(stdNo);
		this.name_Data = new SimpleStringProperty(name);
		this.stdClass_Data = new SimpleStringProperty(stdClass);
		this.concessionDate_Data = new SimpleStringProperty(concessionDate);
		this.concessionExpires_Data = new SimpleStringProperty(concessionExpires);
		this.graceDaysRemains_Data = new SimpleStringProperty(graceDaysRemains);
		this.status_Data = new SimpleStringProperty(status);
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
	
	public String getName_Data() {
		return name_Data.get();
	}
	public void setName_Data(String name) {
		name_Data.set(name);
	}
	
	public String getConcessionDate_Data() {
		return concessionDate_Data.get();
	}
	public void setConcessionDate_Data(String concessionDate) {
		concessionDate_Data.set(concessionDate);
	}
	
	public String getStdClass_Data() {
		return stdClass_Data.get();
	}
	public void setStdClass_Data(String stdClass) {
		stdClass_Data.set(stdClass);
	}
	
	public String getConcessionExpires_Data() {
		return concessionExpires_Data.get();
	}
	public void setConcessionExpires_Data(String concessionExpires) {
		concessionExpires_Data.set(concessionExpires);
	}
	
	public String getGraceDaysRemains_Data() {
		return graceDaysRemains_Data.get();
	}
	public void setGraceDaysRemains_Data(String graceDaysRemains) {
		graceDaysRemains_Data.set(graceDaysRemains);
	}
	
	public String getStatus_Data() {
		return status_Data.get();
	}
	public void setStatus_Data(String status) {
		status_Data.set(status);
	}
	
}
