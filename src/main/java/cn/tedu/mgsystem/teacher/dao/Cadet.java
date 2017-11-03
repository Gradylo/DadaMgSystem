package cn.tedu.mgsystem.teacher.dao;

import java.util.Date;

public class Cadet {
	private int id;
	private String name;//姓名
	private String educational;//教育水平
	private String profession;//专业
	private int isbasics;//是否有基础
	private String source;//信息来源
	private String info;//信息
	private Date learntime;//学习时长
	private String stage;//状态
	private String createdUser;//创建者
	private String modifiyUser;//修改者
	private Date createdTime;//创建时间
	private Date modifiyTime;//修改时间
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
	public String getEducational() {
		return educational;
	}
	public void setEducational(String educational) {
		this.educational = educational;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getIsbasics() {
		return isbasics;
	}
	public void setIsbasics(int isbasics) {
		this.isbasics = isbasics;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Date getLearntime() {
		return learntime;
	}
	public void setLearntime(Date learntime) {
		this.learntime = learntime;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
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
		return "Cadet [id=" + id + ", name=" + name + ", educational=" + educational + ", profession=" + profession
				+ ", isbasics=" + isbasics + ", source=" + source + ", info=" + info + ", learntime=" + learntime
				+ ", stage=" + stage + ", createdUser=" + createdUser + ", modifiyUser=" + modifiyUser
				+ ", createdTime=" + createdTime + ", modifiyTime=" + modifiyTime + "]";
	}
	
	
}
