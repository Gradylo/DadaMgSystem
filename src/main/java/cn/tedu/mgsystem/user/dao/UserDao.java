package cn.tedu.mgsystem.user.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.tedu.mgsystem.user.entity.User;

@Repository
public interface UserDao {
	public User findByAccount(String account);
	public List<String> findUserPermissions(Integer userId);
	/**新增用户*/
	public int insertUser(@Param("user") User user);
	
	/**删除用户*/
	public int deleteUser(Integer id);
	
	/**修改用户*/
	public int updateUser(@Param("user") User user);
	
	
	
}
