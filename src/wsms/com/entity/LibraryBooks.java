package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LibraryBooks {
	@Id
	private String ISBN;
	private String bookTitle, bookAuthors, publishedBy, bookEdition, yearOfPublication, 
		bookCopyright, bookStatus, user;
	private LocalDate bookEntryDate;
	private int bookPageCount;
	
	//constructors
	public LibraryBooks(String ISBN, String bookTitle, String bookAuthors, String publishedBy, 
			String bookEdition, String yearOfPublication, String bookCopyright, int bookPageCount, 
			String bookStatus, LocalDate bookEntryDate, String user) {
		super();
		
	}
	public LibraryBooks() {
		super();
	}
	
	//getters and setters
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthors() {
		return bookAuthors;
	}
	public void setBookAuthors(String bookAuthors) {
		this.bookAuthors = bookAuthors;
	}
	public String getPublishedBy() {
		return publishedBy;
	}
	public void setPublishedBy(String publishedBy) {
		this.publishedBy = publishedBy;
	}
	public String getBookEdition() {
		return bookEdition;
	}
	public void setBookEdition(String bookEdition) {
		this.bookEdition = bookEdition;
	}
	public String getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(String yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public String getBookCopyright() {
		return bookCopyright;
	}
	public void setBookCopyright(String bookCopyright) {
		this.bookCopyright = bookCopyright;
	}
	public String getBookStatus() {
		return bookStatus;
	}
	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}
	public LocalDate getBookEntryDate() {
		return bookEntryDate;
	}
	public void setBookEntryDate(LocalDate bookEntryDate) {
		this.bookEntryDate = bookEntryDate;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getBookPageCount() {
		return bookPageCount;
	}
	public void setBookPageCount(int bookPageCount) {
		this.bookPageCount = bookPageCount;
	}
	
}
