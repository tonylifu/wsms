package wsms.com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LendingBookCount {
	@Id
	private String lendBkStdID;
	private String lendBkStdName, lendBkStdClass, lendBkStdClassLetter, user;
	private int bookCount, defaultCount;
	
	//constructors
	public LendingBookCount(String lendBkStdID, String lendBkStdName, String lendBkStdClass, 
			String lendBkStdClassLetter, int bookCount, int defaultCount, String user) {
		super();
		this.lendBkStdID = lendBkStdID;
		this.lendBkStdName = lendBkStdName;
		this.lendBkStdClass = lendBkStdClass;
		this.lendBkStdClassLetter = lendBkStdClassLetter;
		this.bookCount = bookCount;
		this.defaultCount = defaultCount;
		this.user = user;
	}
	public LendingBookCount() {
		super();
	}
	
	//Getters and Setters
	public String getLendBkStdID() {
		return lendBkStdID;
	}
	public void setLendBkStdID(String lendBkStdID) {
		this.lendBkStdID = lendBkStdID;
	}
	public String getLendBkStdName() {
		return lendBkStdName;
	}
	public void setLendBkStdName(String lendBkStdName) {
		this.lendBkStdName = lendBkStdName;
	}
	public String getLendBkStdClass() {
		return lendBkStdClass;
	}
	public void setLendBkStdClass(String lendBkStdClass) {
		this.lendBkStdClass = lendBkStdClass;
	}
	public String getLendBkStdClassLetter() {
		return lendBkStdClassLetter;
	}
	public void setLendBkStdClassLetter(String lendBkStdClassLetter) {
		this.lendBkStdClassLetter = lendBkStdClassLetter;
	}
	public int getBookCount() {
		return bookCount;
	}
	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}
	public int getDefaultCount() {
		return defaultCount;
	}
	public void setDefaultCount(int defaultCount) {
		this.defaultCount = defaultCount;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
}
