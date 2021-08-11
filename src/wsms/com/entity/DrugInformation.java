package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class DrugInformation{
	@Id
	private String itemIdNo;
	private String nameDesc, category, incomeAcctNo, incomeAcctName;
	private double unitPrice, totalPrice;
	private int qty;
	private String user;
	private LocalDate entryDate;
	
	//constructors
	public DrugInformation(String itemIdNo, String nameDesc, double unitPrice,
			LocalDate entryDate, String user, String category, String incomeAcctNo, String incomeAcctName,
			double totalPrice, int qty) {
		super();
		this.itemIdNo = itemIdNo;
		this.nameDesc = nameDesc;
		this.unitPrice = unitPrice;
		this.entryDate = entryDate;
		this.user = user;
		this.category = category;
		this.incomeAcctNo = incomeAcctNo;
		this.incomeAcctName = incomeAcctName;
		this.totalPrice = totalPrice;
		this.qty = qty;
	}
	
	public DrugInformation() {
		super();
	}

	//Getters and Setters
	public String getItemIdNo() {
		return itemIdNo;
	}

	public void setItemIdNo(String itemIdNo) {
		this.itemIdNo = itemIdNo;
	}

	public String getNameDesc() {
		return nameDesc;
	}

	public void setNameDesc(String nameDesc) {
		this.nameDesc = nameDesc;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public LocalDate getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getIncomeAcctNo() {
		return incomeAcctNo;
	}

	public void setIncomeAcctNo(String incomeAcctNo) {
		this.incomeAcctNo = incomeAcctNo;
	}

	public String getIncomeAcctName() {
		return incomeAcctName;
	}

	public void setIncomeAcctName(String incomeAcctName) {
		this.incomeAcctName = incomeAcctName;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
