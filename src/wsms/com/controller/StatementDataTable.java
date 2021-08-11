package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class StatementDataTable {
	@FXML private SimpleStringProperty date_Data;
	@FXML private SimpleStringProperty description_Data, credit_Data, debit_Data, balance_Data;
	
	public StatementDataTable(String date, String description, String credit, String debit, String balance) {
		this.date_Data = new SimpleStringProperty(date);
		this.description_Data = new SimpleStringProperty(description);
		this.credit_Data = new SimpleStringProperty(credit);
		this.debit_Data = new SimpleStringProperty(debit);
		this.balance_Data = new SimpleStringProperty(balance);
	}

	public String getDate_Data() {
		return date_Data.get();
	}
	public void setDate_Data(String date) {
		date_Data.set(date);
	}
	
	public String getDescription_Data() {
		return description_Data.get();
	}
	public void setDescription_Data(String description) {
		description_Data.set(description);
	}
	public String getCredit_Data() {
		return credit_Data.get();
	}
	public void setCredit_Data(String credit) {
		credit_Data.set(credit);
	}
	
	public String getDebit_Data() {
		return debit_Data.get();
	}
	public void setDebit_Data(String debit) {
		debit_Data.set(debit);
	}
	
	public String getBalance_Data() {
		return balance_Data.get();
	}
	
	public void setBalance_Data(String balance) {
		balance_Data.set(balance);
	}
	
}
