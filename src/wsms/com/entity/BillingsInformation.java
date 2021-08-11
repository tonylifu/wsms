package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class BillingsInformation{
	@Id
	private String billingId;
	private String itemId, stdNo, category, GLAcctNo, GLAcctName;
	private LocalDate billingDate; 
	private double schoolFee, WAEC, juniorWAEC, NECO, ICT, boardingFee, others, total;
	private String user, year, term, stdClass;
	
	//constructors
	public BillingsInformation(String billingId, String itemId, String stdNo, LocalDate billingDate, 
			double schoolFee, double WAEC, double juniorWAEC, double NECO, double ICT, 
			double boardingFee, double others, double total, String GLAcctNo, String GLAcctName,
			String category, String user, String year, String term, String stdClass) {
		super();
		this.billingId = billingId;
		this.itemId = itemId;
		this.stdNo = stdNo;
		this.billingDate = billingDate;
		this.schoolFee = schoolFee;
		this.WAEC = WAEC;
		this.juniorWAEC = juniorWAEC;
		this.NECO = NECO;
		this.ICT = ICT;
		this.boardingFee = boardingFee;
		this.others = others;
		this.total = total;
		this.GLAcctNo = GLAcctNo;
		this.GLAcctName = GLAcctName;
		this.category = category;
		this.user = user;
		this.year = year;
		this.term = term;
		this.stdClass = stdClass;
	}
	
	public BillingsInformation() {
		super();
	}

	//Getters and Setters
	public String getBillingId() {
		return billingId;
	}

	public void setBillingId(String billingId) {
		this.billingId = billingId;
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

	public LocalDate getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}

	public double getSchoolFee() {
		return schoolFee;
	}

	public void setSchoolFee(double schoolFee) {
		this.schoolFee = schoolFee;
	}

	public double getWAEC() {
		return WAEC;
	}

	public void setWAEC(double WAEC) {
		this.WAEC = WAEC;
	}

	public double getJuniorWAEC() {
		return juniorWAEC;
	}

	public void setJuniorWAEC(double juniorWAEC) {
		this.juniorWAEC = juniorWAEC;
	}

	public double getNECO() {
		return NECO;
	}

	public void setNECO(double NECO) {
		this.NECO = NECO;
	}

	public double getICT() {
		return ICT;
	}

	public void setICT(double ICT) {
		this.ICT = ICT;
	}

	public double getBoardingFee() {
		return boardingFee;
	}

	public void setBoardingFee(double boardingFee) {
		this.boardingFee = boardingFee;
	}

	public double getOthers() {
		return others;
	}

	public void setOthers(double others) {
		this.others = others;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	public String getGLAcctNo() {
		return GLAcctNo;
	}

	public void setGLAcctNo(String gLAcctNo) {
		GLAcctNo = gLAcctNo;
	}

	public String getGLAcctName() {
		return GLAcctName;
	}

	public void setGLAcctName(String gLAcctName) {
		GLAcctName = gLAcctName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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
