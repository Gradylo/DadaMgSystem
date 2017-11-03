package user.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.mgsystem.user.dao.UserDao;
import cn.tedu.mgsystem.user.entity.User;

public class TestUserService {
	ClassPathXmlApplicationContext ctx;
	
	
	@Before
	public void init(){
		ctx=new ClassPathXmlApplicationContext("spring-mybatis.xml");
	}
	@Test
	public void test1(){
		UserDao dao=ctx.getBean(UserDao.class);
		User u=dao.findByAccount("temple");
		System.out.println(u);
	}
	
}
