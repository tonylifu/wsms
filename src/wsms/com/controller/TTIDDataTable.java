package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class TTIDDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty TID_Data;
	
	public TTIDDataTable(String sNo, String TID) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.TID_Data = new SimpleStringProperty(TID);
	}

	public String getSNo_Data() {
		return sNo_Data.get();
	}
	public void setSNo_Data(String sNo) {
		sNo_Data.set(sNo);
	}
	
	public String getTID_Data() {
		return TID_Data.get();
	}
	public void setTID_Data(String TID) {
		TID_Data.set(TID);
	}
}
