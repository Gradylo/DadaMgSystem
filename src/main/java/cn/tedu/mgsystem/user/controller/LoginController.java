package cn.tedu.mgsystem.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.tedu.mgsystem.user.entity.User;
import cn.tedu.mgsystem.user.service.IUserService;

@Controller
public class LoginController {
	@Resource(name="loginService")
	private IUserService uservice;

	@RequestMapping("/toLogin.do")
	public String toLogin(){
		System.out.println("转发到登陆页面！");
		return "test/login";
	}
	@RequestMapping("/login.do")
	public ModelAndView login(User user){
		Map<String,String> map=new HashMap<String,String>();
		try {
			User getUser=uservice.checkLogin(user.getAccount(), user.getPassword());
			
		} catch (Exception e) {
		
		}
		
		return null; 
	}
}
