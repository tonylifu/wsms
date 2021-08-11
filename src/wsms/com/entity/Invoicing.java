package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Invoicing{
	@Id
	private String invoiceId;
	private String stdNo, name, itemId, itemNameDesc;
	private LocalDate purchaseDate; 
	private double unitPrice, totalPrice; 
	private int quantity;
	private String user, category, year, term, stdClass;
	
	//constructors
	public Invoicing(String invoiceId, String itemId, String stdNo, String name, 
			String itemNameDesc, LocalDate purchaseDate, double unitPrice, double totalPrice, 
			int quantity, String user, String category, String year, String term, String stdClass) {
		super();
		this.invoiceId = invoiceId;
		this.itemId = itemId;
		this.stdNo = stdNo;
		this.name = name;
		this.itemNameDesc = itemNameDesc;
		this.purchaseDate = purchaseDate;
		this.unitPrice = unitPrice;
		this.totalPrice = totalPrice;
		this.quantity = quantity;
		this.category = category;
		this.user = user;
		this.year = year;
		this.term = term;
		this.stdClass = stdClass;
	}
	
	public Invoicing() {
		super();
	}

	//Getters and Setters
	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItemNameDesc() {
		return itemNameDesc;
	}

	public void setItemNameDesc(String itemNameDesc) {
		this.itemNameDesc = itemNameDesc;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getStdClass() {
		return stdClass;
	}

	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
}
