package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class PeriodicIncomeDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty acctNo_Data, acctName_Data, category_Data, acctBalance_Data;
	
	public PeriodicIncomeDataTable(String sNo, String acctNo, String acctName, String category, String acctBalance) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.acctNo_Data = new SimpleStringProperty(acctNo);
		this.acctName_Data = new SimpleStringProperty(acctName);
		this.category_Data = new SimpleStringProperty(category);
		this.acctBalance_Data = new SimpleStringProperty(acctBalance);
	}

	public String getSNo_Data() {
		return sNo_Data.get();
	}
	public void setSNo_Data(String sNo) {
		sNo_Data.set(sNo);
	}
	
	public String getAcctNo_Data() {
		return acctNo_Data.get();
	}
	public void setAcctNo_Data(String acctNo) {
		acctNo_Data.set(acctNo);
	}
	
	public String getAcctName_Data() {
		return acctName_Data.get();
	}
	public void setAcctName_Data(String acctName) {
		acctName_Data.set(acctName);
	}
	
	public String getCategory_Data() {
		return category_Data.get();
	}
	
	public void setCategory_Data(String category) {
		category_Data.set(category);
	}
	
	public String getAcctBalance_Data() {
		return acctBalance_Data.get();
	}
	public void setAcctBalance_Data(String acctBalance) {
		acctBalance_Data.set(acctBalance);
	}
	
}
