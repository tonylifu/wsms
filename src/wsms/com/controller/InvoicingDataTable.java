package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class InvoicingDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty description_Data, quantity_Data, unitPrice_Data, 
		total_Data, date_Data;
	
	public InvoicingDataTable(String sNo, String description, String quantity, String unitPrice,
			String total, String date) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.description_Data = new SimpleStringProperty(description);
		this.quantity_Data = new SimpleStringProperty(quantity);
		this.unitPrice_Data = new SimpleStringProperty(unitPrice);
		this.total_Data = new SimpleStringProperty(total);
		this.date_Data = new SimpleStringProperty(date);
	}

	public String getSNo_Data() {
		return sNo_Data.get();
	}
	public void setSNo_Data(String sNo) {
		sNo_Data.set(sNo);
	}
	
	public String getDescription_Data() {
		return description_Data.get();
	}
	public void setDescription_Data(String description) {
		description_Data.set(description);
	}
	
	public String getQuantity_Data() {
		return quantity_Data.get();
	}
	public void setQuantity_Data(String quantity) {
		quantity_Data.set(quantity);
	}
	public String getUnitPrice_Data() {
		return unitPrice_Data.get();
	}
	public void setUnitPrice_Data(String unitPrice) {
		unitPrice_Data.set(unitPrice);
	}
	
	public String getTotal_Data() {
		return total_Data.get();
	}
	
	public void setTotal_Data(String total) {
		total_Data.set(total);
	}
	
	public String getDate_Data() {
		return date_Data.get();
	}
	public void setDate_Data(String date) {
		date_Data.set(date);
	}
}
