package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class BillingsInfoDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty date_Data, consultation_Data, drugs_Data, 
		surgery_Data, lab_Data, xray_Data, bed_Data, others_Data, total_Data;
	
	public BillingsInfoDataTable(String sNo, String date, String consultation, 
			String drugs, String surgery, String lab, String xray, String bed, String others,
			String total) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.date_Data = new SimpleStringProperty(date);
		this.consultation_Data = new SimpleStringProperty(consultation);
		this.drugs_Data = new SimpleStringProperty(drugs);
		this.surgery_Data = new SimpleStringProperty(surgery);
		this.lab_Data = new SimpleStringProperty(lab);
		this.xray_Data = new SimpleStringProperty(xray);
		this.bed_Data = new SimpleStringProperty(bed);
		this.others_Data = new SimpleStringProperty(others);
		this.total_Data = new SimpleStringProperty(total);
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
	
	public String getConsultation_Data() {
		return consultation_Data.get();
	}
	public void setConsultation_Data(String consultation) {
		consultation_Data.set(consultation);
	}
	
	public String getDrugs_Data() {
		return drugs_Data.get();
	}
	public void setDrugs_Data(String drugs) {
		drugs_Data.set(drugs);
	}
	public String getSurgery_Data() {
		return surgery_Data.get();
	}
	public void setSurgery_Data(String surgery) {
		surgery_Data.set(surgery);
	}
	
	public String getLab_Data() {
		return lab_Data.get();
	}
	
	public void setLab_Data(String lab) {
		lab_Data.set(lab);
	}
	
	public String getXray_Data() {
		return xray_Data.get();
	}
	
	public void setXray_Data(String xray) {
		xray_Data.set(xray);
	}
	
	public String getBed_Data() {
		return bed_Data.get();
	}
	
	public void setBed_Data(String bed) {
		bed_Data.set(bed);
	}
	
	public String getOthers_Data() {
		return others_Data.get();
	}
	
	public void setOthers_Data(String others) {
		others_Data.set(others);
	}
	
	public String getTotal_Data() {
		return total_Data.get();
	}
	
	public void setTotal_Data(String total) {
		total_Data.set(total);
	}
}
