package cn.tedu.mgsystem.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.tedu.mgsystem.common.exception.ServiceException;
import cn.tedu.mgsystem.user.dao.UserDao;
import cn.tedu.mgsystem.user.entity.User;
import cn.tedu.mgsystem.user.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
		@Resource(name="userDao")
		private UserDao dao;
		public User checkLogin(String username, String pwd) {
			User user=null;
			user=dao.findByAccount(username);
			if(user==null){
				throw new ServiceException("用户不存在！");
			}
			if(!user.getPassword().equals(pwd)){
				throw new ServiceException("密码错误！");
			}
			return user;
		}
}
