package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class InventoryDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty tagNo_Data, serialNo_Data, nameModel_Data, 
		age_Data, deptUnit_Data, status_Data;
	
	public InventoryDataTable(String sNo, String tagNo, String serialNo, 
			String nameModel, String age, String deptUnit, String status) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.tagNo_Data = new SimpleStringProperty(tagNo);
		this.serialNo_Data = new SimpleStringProperty(serialNo);
		this.nameModel_Data = new SimpleStringProperty(nameModel);
		this.age_Data = new SimpleStringProperty(age);
		this.deptUnit_Data = new SimpleStringProperty(deptUnit);
		this.status_Data = new SimpleStringProperty(status);
	}

	public String getSNo_Data() {
		return sNo_Data.get();
	}
	public void setSNo_Data(String sNo) {
		sNo_Data.set(sNo);
	}
	
	public String getTagNo_Data() {
		return tagNo_Data.get();
	}
	public void setTagNo_Data(String tagNo) {
		tagNo_Data.set(tagNo);
	}
	
	public String getSerialNo_Data() {
		return serialNo_Data.get();
	}
	public void setSerialNo_Data(String serialNo) {
		serialNo_Data.set(serialNo);
	}
	
	public String getNameModel_Data() {
		return nameModel_Data.get();
	}
	public void setNameModel_Data(String nameModel) {
		nameModel_Data.set(nameModel);
	}
	public String getAge_Data() {
		return age_Data.get();
	}
	public void setAge_Data(String age) {
		age_Data.set(age);
	}
	
	public String getDeptUnit_Data() {
		return deptUnit_Data.get();
	}
	
	public void setDeptUnit_Data(String deptUnit) {
		deptUnit_Data.set(deptUnit);
	}
	
	public String getStatus_Data() {
		return status_Data.get();
	}
	
	public void setStatus_Data(String status) {
		status_Data.set(status);
	}
}
