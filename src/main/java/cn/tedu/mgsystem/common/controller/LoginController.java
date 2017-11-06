package cn.tedu.mgsystem.common.controller;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.mgsystem.common.service.SysShiroService;
import cn.tedu.mgsystem.common.web.JsonResult;
import cn.tedu.mgsystem.user.entity.User;

@Controller
public class LoginController {
	@Autowired
	private SysShiroService loginService;
	@RequestMapping("/toLogin")
	public String toLogin(){
		System.out.println("进入到这里来了");
		return "test/login";
	}
	/**登录操作*/
	@RequestMapping("/login.do")
	@ResponseBody
	public JsonResult login(String username,String password){
		System.out.println(username+"/"+password);
	    User user=loginService.login(username, password);
		return new JsonResult(user);
	}
	@ExceptionHandler
	/**
	 * 这是一个异常处理方法(用来处理其他方法所抛出的异常)
	 * e:是其它方法抛出的异常
	 */
	@ResponseBody
	public JsonResult handle(Exception e){
		if(e instanceof IncorrectCredentialsException){
			return new JsonResult(e);
		}else if(e instanceof AuthenticationException){
			return new JsonResult(e);
		}
		//其他异常
		return new JsonResult(e);
	}
}
