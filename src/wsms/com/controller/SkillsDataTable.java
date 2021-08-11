package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class SkillsDataTable {
	@FXML private SimpleStringProperty skills_Data;
	
	public SkillsDataTable(String skills) {
		this.skills_Data = new SimpleStringProperty(skills);
	}

	public String getSkills_Data() {
		return skills_Data.get();
	}
	public void setSkills_Data(String skills) {
		skills_Data.set(skills);
	}
}
