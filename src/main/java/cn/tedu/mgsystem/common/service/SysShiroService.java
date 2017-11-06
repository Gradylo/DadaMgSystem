package cn.tedu.mgsystem.common.service;

import cn.tedu.mgsystem.user.entity.User;

public interface SysShiroService {
	User login(String username,String password);
}
