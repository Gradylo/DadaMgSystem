package cn.tedu.mgsystem.user.service;

import cn.tedu.mgsystem.user.entity.User;

public interface IUserService {
	public User checkLogin(String username,String pwd);
}
