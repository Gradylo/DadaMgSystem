package cn.tedu.mgsystem.user.entity;

import java.util.Date;
/***
 * 训练营
 * @author McGrady
 *
 */
public class TrainingCamp {
	private Integer id;
	private Integer classroomNumber;//教室编号
	private String teacherName;//老师名字
	private String teacherPhone;//老师电话----这个保留、待定
	private String productLine;//产品线
	private Integer cadetNumber;//学员编号
	private String createdUser;//创建者
	private String modifiyUser;//修改者
	private Date createdTime;//创建时间
	private Date modifiyTime;//修改时间
	public Integer getClassroomNumber() {
		return classroomNumber;
	}
	public void setClassroomNumber(Integer classroomNumber) {
		this.classroomNumber = classroomNumber;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherPhone() {
		return teacherPhone;
	}
	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}
	public String getProductLine() {
		return productLine;
	}
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}
	public Integer getCadetNumber() {
		return cadetNumber;
	}
	public void setCadetNumber(Integer cadetNumber) {
		this.cadetNumber = cadetNumber;
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
	@Override
	public String toString() {
		return "TrainingCamp [id=" + id + ", classroomNumber=" + classroomNumber + ", teacherName=" + teacherName
				+ ", teacherPhone=" + teacherPhone + ", productLine=" + productLine + ", cadetNumber=" + cadetNumber
				+ ", createdUser=" + createdUser + ", modifiyUser=" + modifiyUser + ", createdTime=" + createdTime
				+ ", modifiyTime=" + modifiyTime + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
