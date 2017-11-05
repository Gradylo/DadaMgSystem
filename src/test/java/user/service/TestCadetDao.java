package user.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.mgsystem.teacher.dao.CadetDao;
import cn.tedu.mgsystem.teacher.entity.Cadet;
import cn.tedu.mgsystem.user.dao.TrainingCampDao;
import cn.tedu.mgsystem.user.entity.TrainingCamp;

public class TestCadetDao {
	ClassPathXmlApplicationContext ctx;
	CadetDao cadetDao;

	@Before
	public void init() {
		ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		cadetDao = ctx.getBean(CadetDao.class);
	}
	
	@After
	public void destory(){
		ctx.close();
	}
	
	@Test
	public void test1(){
		Cadet cadet=new Cadet();
		cadet.setName("杜浦");
		cadet.setStage("预定");
		cadet.setEducational("高中");
		int temp=cadetDao.insertCadet(cadet);
		System.out.println(temp);
	}
	
	@Test
	public void test2(){
		Cadet cadet=cadetDao.findCadetById(1);
		System.out.println(cadet);
	}
	
	@Test
	public void test3(){
		int temp=cadetDao.deleteCadet(3);
		System.out.println(temp);
	}
	
	@Test
	public void test4(){
		Cadet cadet=cadetDao.findCadetById(1);
		cadet.setName("杜浦");
		cadet.setEducational("本科");
		int temp=cadetDao.updateCadet(cadet);
		System.out.println(temp);
	}
	
	
}




