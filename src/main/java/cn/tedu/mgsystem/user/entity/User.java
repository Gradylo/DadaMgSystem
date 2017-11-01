package cn.tedu.mgsystem.user.entity;

import java.util.Date;

public class User {
	private Integer id;
	private String account;
	private String password;
	private String name;
	private String ip;
	private Integer state;
	private Date loginTime;
	private Date createdTime;
	private Date modifiyTime;
	private String createdUser;
	private String modifiyUser;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Date getModifiyTime() {
		return modifiyTime;
	}
	public void setModifiyTime(Date modifiyTime) {
		this.modifiyTime = modifiyTime;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public String getModifiyUser() {
		return modifiyUser;
	}
	public void setModifiyUser(String modifiyUser) {
		this.modifiyUser = modifiyUser;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", password=" + password + ", name=" + name + ", ip=" + ip
				+ ", state=" + state + ", loginTime=" + loginTime + ", createdTime=" + createdTime + ", modifiyTime="
				+ modifiyTime + ", createdUser=" + createdUser + ", modifiyUser=" + modifiyUser + "]";
	}
	
	
	
}
