package cn.tedu.mgsystem.entity;

public class OtherInformationEmp {
	private int id;
	private String department;
	private String skillDirection;
	private String position;
	private String phoneNumber;
	private String Email;

	@Override
	public String toString() {
		return "PersonalInformation [id=" + id + ", department=" + department + ", skillDirection=" + skillDirection
				+ ", position=" + position + ", phoneNumber=" + phoneNumber + ", Email=" + Email + "]";
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
}
