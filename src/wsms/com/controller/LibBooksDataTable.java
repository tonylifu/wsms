package wsms.com.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class LibBooksDataTable {
	@FXML private SimpleStringProperty sNo_Data;
	@FXML private SimpleStringProperty ISBN_Data, bookTitle_Data, bookAuthors_Data, 
		editionYear_Data, status_Data;
	
	public LibBooksDataTable(String sNo, String ISBN, String bookTitle, 
			String bookAuthors, String editionYear, String status) {
		this.sNo_Data = new SimpleStringProperty(sNo);
		this.ISBN_Data = new SimpleStringProperty(ISBN);
		this.bookTitle_Data = new SimpleStringProperty(bookTitle);
		this.bookAuthors_Data = new SimpleStringProperty(bookAuthors);
		this.editionYear_Data = new SimpleStringProperty(editionYear);
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
	public String getEditionYear_Data() {
		return editionYear_Data.get();
	}
	public void setEditionYear_Data(String editionYear) {
		editionYear_Data.set(editionYear);
	}
	
	public String getStatus_Data() {
		return status_Data.get();
	}
	
	public void setStatus_Data(String status) {
		status_Data.set(status);
	}
}
