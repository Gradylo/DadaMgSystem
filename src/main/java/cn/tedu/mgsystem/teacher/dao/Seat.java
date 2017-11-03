package cn.tedu.mgsystem.teacher.dao;

import java.util.Date;

/**
 * 座位
 * @author Temple
 *
 */
public class Seat {
	private int id;
	private int trainingCampId;//训练营id
	private int seatNumber;//座位编号
	private String createdTeacher;//创建者
	private String modifiyTeacher;//修改者
	private int cadetId;//学员ID
	private Date createdTime;//创建时间
	private Date modifiyTime;//修改时间
	private int seatState;//座位状态
}
