package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LendingBook {
	@Id
	private String lendLID;
	private String lendStdID;
	private String lendStdName, lendStdClass, lendStdClassLetter, 
		lendISBN, lendBookTitle, lendBookAuthors, lendBookEdition, lendYearOfPublication, 
		lendBookStatus, user;
	private LocalDate lendingDate, expectedReturnDate;
	
	//constructors
	public LendingBook(String lendLID, String lendStdID, String lendStdName, String lendStdClass, 
			String lendStdClassLetter, String lendISBN, String lendBookTitle, 
			String lendBookAuthors, String lendBookEdition, String lendYearOfPublication, 
			String lendBookStatus, LocalDate lendingDate, LocalDate expectedReturnDate, String user) {
		super();
		this.lendLID = lendLID;
		this.lendStdID = lendStdID;
		this.lendStdName = lendStdName;
		this.lendStdClass = lendStdClass;
		this.lendStdClassLetter = lendStdClassLetter;
		this.lendISBN = lendISBN;
		this.lendBookTitle = lendBookTitle;
		this.lendBookAuthors = lendBookAuthors;
		this.lendBookEdition = lendBookEdition;
		this.lendYearOfPublication = lendYearOfPublication;
		this.lendBookStatus = lendBookStatus;
		this.lendingDate = lendingDate;
		this.expectedReturnDate = expectedReturnDate;
		this.user = user;
	}
	public LendingBook() {
		super();
	}
	
	//getters and setters
	
	/**
	 * @return the lendLID
	 */
	public String getLendLID() {
		return lendLID;
	}
	/**
	 * @param lendLID the lendLID to set
	 */
	public void setLendLID(String lendLID) {
		this.lendLID = lendLID;
	}
	/**
	 * @return the lendStdID
	 */
	public String getLendStdID() {
		return lendStdID;
	}
	/**
	 * @param lendStdID the lendStdID to set
	 */
	public void setLendStdID(String lendStdID) {
		this.lendStdID = lendStdID;
	}
	/**
	 * @return the lendStdName
	 */
	public String getLendStdName() {
		return lendStdName;
	}
	/**
	 * @param lendStdName the lendStdName to set
	 */
	public void setLendStdName(String lendStdName) {
		this.lendStdName = lendStdName;
	}
	/**
	 * @return the lendStdClass
	 */
	public String getLendStdClass() {
		return lendStdClass;
	}
	/**
	 * @param lendStdClass the lendStdClass to set
	 */
	public void setLendStdClass(String lendStdClass) {
		this.lendStdClass = lendStdClass;
	}
	/**
	 * @return the lendStdClassLetter
	 */
	public String getLendStdClassLetter() {
		return lendStdClassLetter;
	}
	/**
	 * @param lendStdClassLetter the lendStdClassLetter to set
	 */
	public void setLendStdClassLetter(String lendStdClassLetter) {
		this.lendStdClassLetter = lendStdClassLetter;
	}
	/**
	 * @return the lendISBN
	 */
	public String getLendISBN() {
		return lendISBN;
	}
	/**
	 * @param lendISBN the lendISBN to set
	 */
	public void setLendISBN(String lendISBN) {
		this.lendISBN = lendISBN;
	}
	/**
	 * @return the lendBookTitle
	 */
	public String getLendBookTitle() {
		return lendBookTitle;
	}
	/**
	 * @param lendBookTitle the lendBookTitle to set
	 */
	public void setLendBookTitle(String lendBookTitle) {
		this.lendBookTitle = lendBookTitle;
	}
	/**
	 * @return the lendBookAuthors
	 */
	public String getLendBookAuthors() {
		return lendBookAuthors;
	}
	/**
	 * @param lendBookAuthors the lendBookAuthors to set
	 */
	public void setLendBookAuthors(String lendBookAuthors) {
		this.lendBookAuthors = lendBookAuthors;
	}
	/**
	 * @return the lendBookEdition
	 */
	public String getLendBookEdition() {
		return lendBookEdition;
	}
	/**
	 * @param lendBookEdition the lendBookEdition to set
	 */
	public void setLendBookEdition(String lendBookEdition) {
		this.lendBookEdition = lendBookEdition;
	}
	/**
	 * @return the lendYearOfPublication
	 */
	public String getLendYearOfPublication() {
		return lendYearOfPublication;
	}
	/**
	 * @param lendYearOfPublication the lendYearOfPublication to set
	 */
	public void setLendYearOfPublication(String lendYearOfPublication) {
		this.lendYearOfPublication = lendYearOfPublication;
	}
	/**
	 * @return the lendBookStatus
	 */
	public String getLendBookStatus() {
		return lendBookStatus;
	}
	/**
	 * @param lendBookStatus the lendBookStatus to set
	 */
	public void setLendBookStatus(String lendBookStatus) {
		this.lendBookStatus = lendBookStatus;
	}
	/**
	 * @return the lendingDate
	 */
	public LocalDate getLendingDate() {
		return lendingDate;
	}
	/**
	 * @param lendingDate the lendingDate to set
	 */
	public void setLendingDate(LocalDate lendingDate) {
		this.lendingDate = lendingDate;
	}
	/**
	 * @return the expectedReturnDate
	 */
	public LocalDate getExpectedReturnDate() {
		return expectedReturnDate;
	}
	/**
	 * @param expectedReturnDate the expectedReturnDate to set
	 */
	public void setExpectedReturnDate(LocalDate expectedReturnDate) {
		this.expectedReturnDate = expectedReturnDate;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
}
