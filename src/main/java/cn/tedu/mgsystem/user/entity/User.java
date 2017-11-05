package cn.tedu.mgsystem.user.entity;

import java.util.Date;

public class User {
	private Integer id;
	private String account;//用户名
	private String password;//密码
	private String name;//名字
	private String ip;//ip地址
	private Integer state;//状态
	private Date loginTime;//登录时间
	private Date createdTime;//创建时间
	private Date modifiyTime;//修改时间
	private String createdUser;//创建用户
	private String modifiyUser;//修改用户
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
