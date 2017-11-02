package user.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {
	ClassPathXmlApplicationContext ctx;
	
	
	@Before
	public void init(){
		ctx=new ClassPathXmlApplicationContext("spring-mybatis.xml");
	}
	@Test
	public void test1(){
	}
	
}
