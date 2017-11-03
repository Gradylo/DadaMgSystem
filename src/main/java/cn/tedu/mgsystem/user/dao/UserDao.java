package cn.tedu.mgsystem.user.dao;


import org.springframework.stereotype.Repository;

import cn.tedu.mgsystem.user.entity.User;

@Repository
public interface UserDao {
	public User findByAccount(String account);
}
