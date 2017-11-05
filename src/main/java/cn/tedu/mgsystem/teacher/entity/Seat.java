package cn.tedu.mgsystem.teacher.entity;

import java.util.Date;

/**
 * 座位
 * @author Temple
 *
 */
public class Seat {
	private Integer id;
	private Integer trainingCampId;//训练营id
	private Integer seatNumber;//座位编号
	private String createdTeacher;//创建者
	private String modifiyTeacher;//修改者
	private Integer cadetId;//学员ID
	private Date createdTime;//创建时间
	private Date modifiyTime;//修改时间
	private Integer seatState;//座位状态
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTrainingCampId() {
		return trainingCampId;
	}
	public void setTrainingCampId(Integer trainingCampId) {
		this.trainingCampId = trainingCampId;
	}
	public Integer getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(Integer seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getCreatedTeacher() {
		return createdTeacher;
	}
	public void setCreatedTeacher(String createdTeacher) {
		this.createdTeacher = createdTeacher;
	}
	public String getModifiyTeacher() {
		return modifiyTeacher;
	}
	public void setModifiyTeacher(String modifiyTeacher) {
		this.modifiyTeacher = modifiyTeacher;
	}
	public Integer getCadetId() {
		return cadetId;
	}
	public void setCadetId(Integer cadetId) {
		this.cadetId = cadetId;
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
	public Integer getSeatState() {
		return seatState;
	}
	public void setSeatState(Integer seatState) {
		this.seatState = seatState;
	}
	@Override
	public String toString() {
		return "Seat [id=" + id + ", trainingCampId=" + trainingCampId + ", seatNumber=" + seatNumber
				+ ", createdTeacher=" + createdTeacher + ", modifiyTeacher=" + modifiyTeacher + ", cadetId=" + cadetId
				+ ", createdTime=" + createdTime + ", modifiyTime=" + modifiyTime + ", seatState=" + seatState + "]";
	}
	
	
}
