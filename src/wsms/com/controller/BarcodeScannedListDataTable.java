package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class BarcodeScannedListDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty date_Data, stdId_Data, name_Data, stdClass_Data, time_Data, 
		barcodeStatus_Data, reason_Data;
	
	public BarcodeScannedListDataTable(String sNo, String date, String stdId, String name, String stdClass, String time, 
			String barcodeStatus, String reason) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.date_Data = new SimpleStringProperty(date);
		this.stdId_Data = new SimpleStringProperty(stdId);
		this.name_Data = new SimpleStringProperty(name);
		this.stdClass_Data = new SimpleStringProperty(stdClass);
		this.time_Data = new SimpleStringProperty(time);
		this.barcodeStatus_Data = new SimpleStringProperty(barcodeStatus);
		this.reason_Data = new SimpleStringProperty(reason);
	}

	public String getSNo_Data() {
		return sNo_Data.get();
	}
	public void setSNo_Data(String sNo) {
		sNo_Data.set(sNo);
	}
	
	public String getDate_Data() {
		return date_Data.get();
	}
	public void setDate_Data(String date) {
		date_Data.set(date);
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
	
	public String getStdClass_Data() {
		return stdClass_Data.get();
	}
	public void setStdClass_Data(String stdClass) {
		stdClass_Data.set(stdClass);
	}
	
	public String getTime_Data() {
		return time_Data.get();
	}
	public void setTime_Data(String time) {
		time_Data.set(time);
	}
	
	public String getBarcodeStatus_Data() {
		return barcodeStatus_Data.get();
	}
	public void setBarcodeStatus_Data(String barcode) {
		barcodeStatus_Data.set(barcode);
	}
	
	public String getReason_Data() {
		return reason_Data.get();
	}
	public void setReason_Data(String reason) {
		reason_Data.set(reason);
	}
}
