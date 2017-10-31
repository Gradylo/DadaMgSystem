package cn.tedu.mgsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.mgsystem.dao.UserNameDAO;
import cn.tedu.mgsystem.entity.UserNameEmp;
import cn.tedu.mgsystem.project.exception.ServiceException;
import cn.tedu.mgsystem.service.LoginService;

@Service
public class LoginServiceImp implements LoginService {
	@Autowired
	UserNameDAO username;

	public void findById(String user, String pwd) {
		if (user == null || user == "") {
			throw new ServiceException("账号不能为空");
		}
		UserNameEmp name = username.findById(user);
		if (pwd == null || pwd == "" || !name.getUser().equals(pwd)) {
			throw new ServiceException("密码不正确");
		}
	}

}
