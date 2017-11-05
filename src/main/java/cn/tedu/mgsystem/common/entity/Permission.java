package cn.tedu.mgsystem.common.entity;

import java.util.Date;

/**
 * 允许
 * @author Temple
 *
 */
public class Permission {
	private int id;
	private String name;//名字
	private String info;//信息
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
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
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
		return "Permission [id=" + id + ", name=" + name + ", info=" + info + ", createdUser=" + createdUser
				+ ", modifiyUser=" + modifiyUser + ", createdTime=" + createdTime + ", modifiyTime=" + modifiyTime
				+ "]";
	}
	
}
