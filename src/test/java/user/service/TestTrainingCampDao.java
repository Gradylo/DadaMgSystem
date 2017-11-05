package user.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.mgsystem.user.dao.TrainingCampDao;
import cn.tedu.mgsystem.user.entity.TrainingCamp;

public class TestTrainingCampDao {
	ClassPathXmlApplicationContext ctx;
	TrainingCampDao trainingCampDao;

	@Before
	public void init() {
		ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		trainingCampDao = ctx.getBean(TrainingCampDao.class);
	}
	
	@After
	public void destory(){
		ctx.close();
	}
	
	@Test
	public void test1(){
		TrainingCamp tc=new TrainingCamp();
		tc.setClassroomNumber(1);
		tc.setCadetNumber(1);
		tc.setTeacherName("admin");
		tc.setTeacherPhone("123456");
		tc.setProductLine("产品线");
		System.out.println(tc);
		int temp=trainingCampDao.insertTrainingCamp(tc);
		System.out.println(temp);
	}
	
	@Test
	public void test2(){
		TrainingCamp tc=trainingCampDao.findTrainingCampByClassNumber(1);
		System.out.println(tc);
	}
	
	@Test
	public void test3(){
		int temp=trainingCampDao.deleteTrainingCamp(6);
		System.out.println(temp);
	}
	
	@Test
	public void test4(){
		TrainingCamp tc=trainingCampDao.findTrainingCampByClassNumber(1);
		tc.setTeacherName("user");
		int temp=trainingCampDao.updateTrainingCamp(tc);
		System.out.println(temp);
	}
	
	
}




