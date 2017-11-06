package cn.tedu.mgsystem.common.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import cn.tedu.mgsystem.user.dao.UserDao;
import cn.tedu.mgsystem.user.entity.User;

public class ShiroUserRealm extends AuthorizingRealm{
	@Resource
	private UserDao userDao;
	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("这是一个没异常抛出的方法！");
		User user=(User) SecurityUtils.getSubject().getSession().getAttribute("user");
		int userId=user.getId();
		List<String>permsList=new ArrayList<String>();
		permsList=userDao.findUserPermissions(userId);
		Set<String>permsSet=new HashSet<String>();
		//用户权限列表
		for (String string : permsList) {
			if(string != null && !("".equals(string))){
				permsSet.add(string);
			}
		}
		System.out.println("得到的权限表："+permsSet);
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
		info.setStringPermissions(permsSet);
		return info;
	}
	/**
	 * 认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		System.out.println("这里有一个异常抛出来了！");
		//把AuthenticationToken转换为UsernamePasswordToken
		UsernamePasswordToken upToken=(UsernamePasswordToken)token;
		//从UsernamePasswordToken中获取username
		String username=upToken.getUsername();
		System.out.println("打个点，看下username是什么！");
		//判断用户是否存在，若存在，返回user对象
		User user=userDao.findByAccount(username);
		System.out.println(user);
		//盐值
		ByteSource credentSalt=ByteSource.Util.bytes(user.getAccount());
		//自动完成密码比对 -密码的对比；
		//通过AuthenicatingRealm的credentialMatcher属性来进行的密码的比对
		String password=user.getPassword();
		SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(
				username,password,getName());
		SecurityUtils.getSubject().getSession().setAttribute("user", user);
		System.out.println("打出一个info!"+info);
		return info;
	}

}
