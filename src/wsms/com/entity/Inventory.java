package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Inventory{
	@Id
	private String tagNo;
	private String serialNo, name, model, description, anyOI, assignedTo, officeUnit, deptHead,
		itemStatus, user;
	private LocalDate DOP, DOE;
	private double pAmount;
	private int itemAge;
	
	//constructors
	public Inventory(String tagNo, String serialNo, String name, String model, String description, String anyOI,
			LocalDate DOP, String assignedTo, String officeUnit, String deptHead, String itemStatus, 
			LocalDate DOE, String user, double pAmount, int itemAge) {
		super();
		this.tagNo = tagNo;
		this.serialNo = serialNo;
		this.name = name;
		this.model = model;
		this.description = description;
		this.anyOI = anyOI;
		this.DOP = DOP;
		this.assignedTo = assignedTo;
		this.officeUnit = officeUnit;
		this.deptHead = deptHead;
		this.itemStatus = itemStatus;
		this.DOE = DOE;
		this.user = user;
		this.pAmount = pAmount;
		this.itemAge = itemAge;
	}
	
	public Inventory() {
		super();
	}

	//Getters and Setters
	public String getTagNo() {
		return tagNo;
	}

	public void setTagNo(String tagNo) {
		this.tagNo = tagNo;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAnyOI() {
		return anyOI;
	}

	public void setAnyOI(String anyOI) {
		this.anyOI = anyOI;
	}

	public LocalDate getDOP() {
		return DOP;
	}

	public void setDOP(LocalDate DOP) {
		this.DOP = DOP;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getOfficeUnit() {
		return officeUnit;
	}

	public void setOfficeUnit(String officeUnit) {
		this.officeUnit = officeUnit;
	}

	public String getDeptHead() {
		return deptHead;
	}

	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public LocalDate getDOE() {
		return DOE;
	}

	public void setDOE(LocalDate DOE) {
		this.DOE = DOE;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public double getpAmount() {
		return pAmount;
	}

	public void setpAmount(double pAmount) {
		this.pAmount = pAmount;
	}

	public int getItemAge() {
		return itemAge;
	}

	public void setItemAge(int itemAge) {
		this.itemAge = itemAge;
	}
	
	

}
