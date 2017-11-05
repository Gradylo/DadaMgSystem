package user.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.mgsystem.user.dao.TrainingCampDao;
import cn.tedu.mgsystem.user.dao.UserDao;
import cn.tedu.mgsystem.user.entity.User;

public class TestUserService {
	ClassPathXmlApplicationContext ctx;
	TrainingCampDao trainingCampDao;
	
	@Before
	public void init(){
		ctx=new ClassPathXmlApplicationContext("spring-mybatis.xml");
		trainingCampDao=ctx.getBean(TrainingCampDao.class);
	}
	@Test
	public void test1(){
		UserDao dao=ctx.getBean(UserDao.class);
		User u=dao.findByAccount("temple");
		System.out.println(u);
	}
	
	@Test
	public void test2(){
		UserDao dao=ctx.getBean(UserDao.class);
		User user=new User();
		user.setAccount("123456");
		user.setPassword("123456");
		user.setState(1);
		user.setName("李白");
		int temp=dao.insertUser(user);
		System.out.println(temp);
	}
	
	
	@Test
	public void test3(){
		UserDao dao=ctx.getBean(UserDao.class);
		int temp =dao.deleteUser(1);
		System.out.println(temp);
	}
	
	@Test
	public void test4(){
		UserDao dao=ctx.getBean(UserDao.class);
		User user=dao.findByAccount("123456");
		user.setName("杜浦");
		int temp=dao.updateUser(user);
		System.out.println(temp);
	}
	
	
	
	
}
