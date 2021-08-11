package wsms.com.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class DESKeys implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String userName;
	private LinkedHashMap<String, SecretKey> keyVal = new LinkedHashMap<>();
	private LinkedHashMap<String, Cipher> ecipherVal = new LinkedHashMap<>();
	private LinkedHashMap<String, Cipher> dcipherVal = new LinkedHashMap<>();
	private String user, updateUser;
	private LocalDateTime localDateTime, lastUpdateTime;
	
	public DESKeys(String userName, LinkedHashMap<String, SecretKey> keyVal, 
			LinkedHashMap<String, Cipher> ecipherVal, LinkedHashMap<String, Cipher> dcipherVal,
			String user, String updateUser, 
			LocalDateTime localDateTime, LocalDateTime lastUpdateTime) {
		super();
		this.userName = userName;
		this.keyVal = keyVal;
		this.ecipherVal = ecipherVal;
		this.dcipherVal = dcipherVal;
		this.user = user;
		this.updateUser = updateUser;
		this.localDateTime = localDateTime;
		this.lastUpdateTime = lastUpdateTime;
	}
	public DESKeys() {
		super();
	}
	
	//Getters and Setters
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public LinkedHashMap<String, SecretKey> getKeyVal() {
		return keyVal;
	}
	public void setKeyVal(LinkedHashMap<String, SecretKey> keyVal) {
		this.keyVal = keyVal;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	public LocalDateTime getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public LinkedHashMap<String, Cipher> getEcipherVal() {
		return ecipherVal;
	}
	public void setEcipherVal(LinkedHashMap<String, Cipher> ecipherVal) {
		this.ecipherVal = ecipherVal;
	}
	public LinkedHashMap<String, Cipher> getDcipherVal() {
		return dcipherVal;
	}
	public void setDcipherVal(LinkedHashMap<String, Cipher> dcipherVal) {
		this.dcipherVal = dcipherVal;
	}
}
