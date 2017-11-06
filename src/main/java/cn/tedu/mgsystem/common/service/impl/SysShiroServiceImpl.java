package cn.tedu.mgsystem.common.service.impl;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import cn.tedu.mgsystem.common.exception.ServiceException;
import cn.tedu.mgsystem.common.service.SysShiroService;
import cn.tedu.mgsystem.user.dao.UserDao;
import cn.tedu.mgsystem.user.entity.User;
@Service
public class SysShiroServiceImpl implements SysShiroService{
	@Resource
	private UserDao userDao;
	public User login(String username, String password) {
		Subject subject =SecurityUtils.getSubject();
//		if(subject.isAuthenticated()) return;
		//把用户名和密码封装为UsernamePasswordToken对象
		UsernamePasswordToken token=new UsernamePasswordToken(username,password);
		User user=null;
		try {//登陆验证，调用userRealm
			subject.login(token);
			user=userDao.findByAccount(username);
			System.out.println("打个补丁："+user);
		} catch (IncorrectCredentialsException ice) {
			throw new ServiceException("密码错误！");
		} catch(AuthenticationException ae){
			System.out.println("这里就是认证了什么吧！");
			throw new ServiceException("认证失败");
		}
			return user;
	}

}
