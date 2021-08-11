package wsms.com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DefaultPenalty {
	@Id
	private String defaultId;
	private String StdName, reason, duration, suspensionStatus, user;
	private LocalDate penaltyDate, penaltyEndDate;
	
	//constructors
	public DefaultPenalty(String defaultId, String stdName, String reason, 
			LocalDate penaltyDate, String duration, LocalDate penaltyEndDate,
			String suspensionStatus, String user) {
		super();
		this.defaultId = defaultId;
		this.StdName = stdName;
		this.reason = reason;
		this.penaltyDate = penaltyDate;
		this.duration = duration;
		this.penaltyEndDate = penaltyEndDate;
		this.suspensionStatus = suspensionStatus;
		this.user = user;
	}
	public DefaultPenalty() {
		super();
	}
	
	//Getters and Setters
	public String getDefaultId() {
		return defaultId;
	}
	public void setDefaultId(String defaultId) {
		this.defaultId = defaultId;
	}
	public String getStdName() {
		return StdName;
	}
	public void setStdName(String stdName) {
		StdName = stdName;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public LocalDate getPenaltyDate() {
		return penaltyDate;
	}
	public void setPenaltyDate(LocalDate penaltyDate) {
		this.penaltyDate = penaltyDate;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public LocalDate getPenaltyEndDate() {
		return penaltyEndDate;
	}
	public void setPenaltyEndDate(LocalDate penaltyEndDate) {
		this.penaltyEndDate = penaltyEndDate;
	}
	public String getSuspensionStatus() {
		return suspensionStatus;
	}
	public void setSuspensionStatus(String suspensionStatus) {
		this.suspensionStatus = suspensionStatus;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

}
