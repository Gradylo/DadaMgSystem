package teacher.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.mgsystem.teacher.dao.SeatDao;
import cn.tedu.mgsystem.teacher.entity.Seat;

public class TestTeacherService {
	ClassPathXmlApplicationContext ctx;
	SeatDao dao;
	
	@Before
	public void init(){
		ctx=new ClassPathXmlApplicationContext("spring-mybatis.xml");
		dao=ctx.getBean(SeatDao.class);
	}
	
	@After
	public void destory(){
		ctx.close();
	}
	
	@Test
	public void test1(){
		Seat seat=dao.findSeatById(1);
		System.out.println(seat);
	}
	
	@Test
	public void test2(){
		Seat seat=new Seat();
		seat.setTrainingCampId(1);
		seat.setSeatNumber(1);
		seat.setSeatState(1);
		seat.setCreatedTeacher("admin");
		System.out.println(seat);
		int temp=dao.insertSeat(seat);
		System.out.println(temp);
	}
	
	@Test
	public void test3(){
		int temp=dao.deleteSeat(2);
		System.out.println(temp);
	}
	
	@Test
	public void test4(){
		Seat seat=dao.findSeatById(1);
		System.out.println(seat);
		seat.setCreatedTeacher("user");
		int temp=dao.updateSeat(seat);
		System.out.println(temp);
	}
	
	
}
