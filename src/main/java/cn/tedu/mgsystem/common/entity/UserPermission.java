package cn.tedu.mgsystem.common.entity;
/**
 * 用户权限
 * @author Temple
 *
 */
public class UserPermission {
	private int id;
	private int userId;//用户id
	private int permissionId;//管理员id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}
	@Override
	public String toString() {
		return "UserPermission [id=" + id + ", userId=" + userId + ", permissionId=" + permissionId + "]";
	}
}
