package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReturningBook {
	@Id
	private String returnLID;
	private int returnDefaultDays, returnNoOfDefaults;
	private String returnStdName, returnStdClass, returnStdClassLetter, returnStdID,
		returnISBN, returnBookTitle, returnBookAuthors, returnBookEdition, returnYearOfPublication, 
		returnPenalty, user;
	private LocalDate lentDate, expectedReturnDate, actualReturnDate, suspendedUntil;
	
	//constructors
	public ReturningBook(String returnLID, String returnStdID, int returnDefaultDays, 
			int returnNoOfDefaults, String returnStdName, String returnStdClass, 
			String returnStdClassLetter, String returnISBN, String returnBookTitle, 
			String returnBookAuthors, String returnBookEdition, 
			String returnYearOfPublication, LocalDate lentDate, LocalDate expectedReturnDate, 
			LocalDate actualReturnDate, String returnPenalty, LocalDate suspendedUntil, 
			String user) {
		super();
		this.returnLID = returnLID;
		this.returnStdID = returnStdID;
		this.returnDefaultDays = returnDefaultDays;
		this.returnNoOfDefaults = returnNoOfDefaults;
		this.returnStdName = returnStdName;
		this.returnStdClass = returnStdClass;
		this.returnStdClassLetter = returnStdClassLetter;
		this.returnISBN = returnISBN;
		this.returnBookTitle = returnBookTitle;
		this.returnBookAuthors = returnBookAuthors;
		this.returnBookEdition = returnBookEdition;
		this.returnYearOfPublication = returnYearOfPublication;
		this.lentDate = lentDate;
		this.expectedReturnDate = expectedReturnDate;
		this.actualReturnDate = actualReturnDate;
		this.returnPenalty = returnPenalty;
		this.suspendedUntil = suspendedUntil;
		this.user = user;
	}
	public ReturningBook() {
		super();
	}
	
	//Getters and Setters
	public String getReturnLID() {
		return returnLID;
	}
	public void setReturnLID(String returnLID) {
		this.returnLID = returnLID;
	}
	public String getReturnStdID() {
		return returnStdID;
	}
	public void setReturnStdID(String returnStdID) {
		this.returnStdID = returnStdID;
	}
	public int getReturnDefaultDays() {
		return returnDefaultDays;
	}
	public void setReturnDefaultDays(int returnDefaultDays) {
		this.returnDefaultDays = returnDefaultDays;
	}
	public int getReturnNoOfDefaults() {
		return returnNoOfDefaults;
	}
	public void setReturnNoOfDefaults(int returnNoOfDefaults) {
		this.returnNoOfDefaults = returnNoOfDefaults;
	}
	public String getReturnStdName() {
		return returnStdName;
	}
	public void setReturnStdName(String returnStdName) {
		this.returnStdName = returnStdName;
	}
	public String getReturnStdClass() {
		return returnStdClass;
	}
	public void setReturnStdClass(String returnStdClass) {
		this.returnStdClass = returnStdClass;
	}
	public String getReturnStdClassLetter() {
		return returnStdClassLetter;
	}
	public void setReturnStdClassLetter(String returnStdClassLetter) {
		this.returnStdClassLetter = returnStdClassLetter;
	}
	public String getReturnISBN() {
		return returnISBN;
	}
	public void setReturnISBN(String returnISBN) {
		this.returnISBN = returnISBN;
	}
	public String getReturnBookTitle() {
		return returnBookTitle;
	}
	public void setReturnBookTitle(String returnBookTitle) {
		this.returnBookTitle = returnBookTitle;
	}
	public String getReturnBookAuthors() {
		return returnBookAuthors;
	}
	public void setReturnBookAuthors(String returnBookAuthors) {
		this.returnBookAuthors = returnBookAuthors;
	}
	public String getReturnBookEdition() {
		return returnBookEdition;
	}
	public void setReturnBookEdition(String returnBookEdition) {
		this.returnBookEdition = returnBookEdition;
	}
	public String getReturnYearOfPublication() {
		return returnYearOfPublication;
	}
	public void setReturnYearOfPublication(String returnYearOfPublication) {
		this.returnYearOfPublication = returnYearOfPublication;
	}
	public LocalDate getLentDate() {
		return lentDate;
	}
	public void setLentDate(LocalDate lentDate) {
		this.lentDate = lentDate;
	}
	public LocalDate getExpectedReturnDate() {
		return expectedReturnDate;
	}
	public void setExpectedReturnDate(LocalDate expectedReturnDate) {
		this.expectedReturnDate = expectedReturnDate;
	}
	public LocalDate getActualReturnDate() {
		return actualReturnDate;
	}
	public void setActualReturnDate(LocalDate actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}
	public String getReturnPenalty() {
		return returnPenalty;
	}
	public void setReturnPenalty(String returnPenalty) {
		this.returnPenalty = returnPenalty;
	}
	public LocalDate getSuspendedUntil() {
		return suspendedUntil;
	}
	public void setSuspendedUntil(LocalDate suspendedUntil) {
		this.suspendedUntil = suspendedUntil;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
}
