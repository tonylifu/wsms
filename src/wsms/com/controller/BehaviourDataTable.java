package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class BehaviourDataTable {
	@FXML private SimpleStringProperty behaviour_Data;
	
	public BehaviourDataTable(String behaviour) {
		this.behaviour_Data = new SimpleStringProperty(behaviour);
	}

	public String getBehaviour_Data() {
		return behaviour_Data.get();
	}
	public void setBehaviour_Data(String behaviour) {
		behaviour_Data.set(behaviour);
	}
}
