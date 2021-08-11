package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class IncomeDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty acctNo_Data, acctName_Data, acctBalance_Data, earnedIncome_Data;
	
	public IncomeDataTable(String sNo, String acctNo, String acctName, String acctBalance, String earnedIncome) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.acctNo_Data = new SimpleStringProperty(acctNo);
		this.acctName_Data = new SimpleStringProperty(acctName);
		this.acctBalance_Data = new SimpleStringProperty(acctBalance);
		this.earnedIncome_Data = new SimpleStringProperty(earnedIncome);
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
	public String getAcctBalance_Data() {
		return acctBalance_Data.get();
	}
	public void setAcctBalance_Data(String acctBalance) {
		acctBalance_Data.set(acctBalance);
	}
	
	public String getEarnedIncome_Data() {
		return earnedIncome_Data.get();
	}
	
	public void setEarnedIncome_Data(String earnedIncome) {
		earnedIncome_Data.set(earnedIncome);
	}
}
