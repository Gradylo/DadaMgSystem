package cn.tedu.mgsystem.entity;

import java.util.Date;

public class PeresonalInformationEmp {
	private OtherInformationEmp other;
	private UserNameEmp username;
	private int id;
	private String department;
	private String skillDirection;
	private String position;
	private String phoneNumber;
	private String Email;
	private String name;
	private Date EntryTime;
	private int Jurisdiction;
	private String user;
	private String pwd;

	public OtherInformationEmp getOther() {
		other = new OtherInformationEmp();
		other.setId(id);
		other.setDepartment(department);
		other.setSkillDirection(skillDirection);
		other.setPosition(position);
		other.setPhoneNumber(phoneNumber);
		other.setEmail(Email);
		return other;
	}

	public void setOther(OtherInformationEmp other) {
		this.other = other;
	}

	public UserNameEmp getUsername() {
		username = new UserNameEmp();
		username.setId(id);
		username.setName(name);
		username.setEntryTime(EntryTime);
		username.setJurisdiction(Jurisdiction);
		username.setUser(user);
		username.setPwd(pwd);
		return username;
	}

	public void setUsername(UserNameEmp username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSkillDirection() {
		return skillDirection;
	}

	public void setSkillDirection(String skillDirection) {
		this.skillDirection = skillDirection;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
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

	@Override
	public String toString() {
		return "PeresonalInformationEmp [other=" + other + ", username=" + username + ", id=" + id + ", department="
				+ department + ", skillDirection=" + skillDirection + ", position=" + position + ", phoneNumber="
				+ phoneNumber + ", Email=" + Email + ", name=" + name + ", EntryTime=" + EntryTime + ", Jurisdiction="
				+ Jurisdiction + ", user=" + user + ", pwd=" + pwd + "]";
	}

}
