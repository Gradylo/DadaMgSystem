package cn.tedu.mgsystem.entity;

import java.util.Date;

public class UserNameEmp {
	private int id;
	private String name;
	private Date EntryTime;
	private int Jurisdiction;
	private String user;
	private String pwd;

	@Override
	public String toString() {
		return "UserNameEmp [id=" + id + ", name=" + name + ", EntryTime=" + EntryTime + ", Jurisdiction="
				+ Jurisdiction + ", user=" + user + ", pwd=" + pwd + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEntryTime() {
		return EntryTime;
	}

	public void setEntryTime(Date entryTime) {
		EntryTime = entryTime;
	}

	public int getJurisdiction() {
		return Jurisdiction;
	}

	public void setJurisdiction(int jurisdiction) {
		Jurisdiction = jurisdiction;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
