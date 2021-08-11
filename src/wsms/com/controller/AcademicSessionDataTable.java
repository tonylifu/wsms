package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class AcademicSessionDataTable {
	@FXML private SimpleStringProperty event_Data;
	@FXML private SimpleStringProperty time_Data;
	
	public AcademicSessionDataTable(String event, String time) {
		this.event_Data = new SimpleStringProperty(event);
		this.time_Data = new SimpleStringProperty(time);
	}

	public String getEvent_Data() {
		return event_Data.get();
	}
	public void setEvent_Data(String event) {
		event_Data.set(event);
	}
	
	public String getTime_Data() {
		return time_Data.get();
	}
	public void setTime_Data(String time) {
		time_Data.set(time);
	}
}
