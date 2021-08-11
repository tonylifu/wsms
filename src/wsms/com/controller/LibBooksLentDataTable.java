package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class LibBooksLentDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty ISBN_Data, bookTitle_Data, bookAuthors_Data, 
		lentTo_Data, lentDate_Data, expectedRetDate_Data, status_Data;
	
	public LibBooksLentDataTable(String sNo, String ISBN, String bookTitle, 
			String bookAuthors, String lentTo, String lentDate, String expectedRetDate, String status) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.ISBN_Data = new SimpleStringProperty(ISBN);
		this.bookTitle_Data = new SimpleStringProperty(bookTitle);
		this.bookAuthors_Data = new SimpleStringProperty(bookAuthors);
		this.lentTo_Data = new SimpleStringProperty(lentTo);
		this.lentDate_Data = new SimpleStringProperty(lentDate);
		this.expectedRetDate_Data = new SimpleStringProperty(expectedRetDate);
		this.status_Data = new SimpleStringProperty(status);
	}

	public String getSNo_Data() {
		return sNo_Data.get();
	}
	public void setSNo_Data(String sNo) {
		sNo_Data.set(sNo);
	}
	
	public String getISBN_Data() {
		return ISBN_Data.get();
	}
	public void setISBN_Data(String ISBN) {
		ISBN_Data.set(ISBN);
	}
	
	public String getBookTitle_Data() {
		return bookTitle_Data.get();
	}
	public void setBookTitle_Data(String bookTitle) {
		bookTitle_Data.set(bookTitle);
	}
	
	public String getBookAuthors_Data() {
		return bookAuthors_Data.get();
	}
	public void setBookAuthors_Data(String bookAuthors) {
		bookAuthors_Data.set(bookAuthors);
	}
	public String getLentTo_Data() {
		return lentTo_Data.get();
	}
	public void setLentTo_Data(String lentTo) {
		lentTo_Data.set(lentTo);
	}
	
	public String getLentDate_Data() {
		return lentDate_Data.get();
	}
	
	public void setLentDate_Data(String lentDate) {
		lentDate_Data.set(lentDate);
	}
	
	public String getExpectedRetDate_Data() {
		return expectedRetDate_Data.get();
	}
	
	public void setExpectedRetDate_Data(String expectedRetDate) {
		expectedRetDate_Data.set(expectedRetDate);
	}
	
	public String getStatus_Data() {
		return status_Data.get();
	}
	public void setStatus_Data(String status) {
		status_Data.set(status);
	}
}
