package cn.tedu.mgsystem.user.dao;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.tedu.mgsystem.user.entity.User;

@Repository
public interface UserDao {
	public User findByAccount(String account);
	
	/**新增用户*/
	public int insertUser(@Param("user") User user);
	
	/**删除用户*/
	public int deleteUser(Integer id);
	
	/**修改用户*/
	public int updateUser(@Param("user") User user);
	
	
	
}
