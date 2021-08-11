package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class BillableDataTable {
	@FXML private SimpleStringProperty itemId_Data;
	@FXML private SimpleStringProperty description_Data, price_Data;
	
	public BillableDataTable(String itemId, String description, String price) {
		this.itemId_Data = new SimpleStringProperty(itemId);
		this.description_Data = new SimpleStringProperty(description);
		this.price_Data = new SimpleStringProperty(price);
	}

	public String getItemId_Data() {
		return itemId_Data.get();
	}
	public void setItemId_Data(String itemId) {
		itemId_Data.set(itemId);
	}
	
	public String getDescription_Data() {
		return description_Data.get();
	}
	public void setDescription_Data(String description) {
		description_Data.set(description);
	}
	
	public String getPrice_Data() {
		return price_Data.get();
	}
	public void setPrice_Data(String price) {
		price_Data.set(price);
	}
}
