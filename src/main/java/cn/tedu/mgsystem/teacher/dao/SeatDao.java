package cn.tedu.mgsystem.teacher.dao;

import org.apache.ibatis.annotations.Param;

import cn.tedu.mgsystem.teacher.entity.Seat;

public interface SeatDao {
	/**查找座位*/
	public Seat findSeatById(Integer id);
	
	/**添加座位信息*/
	public int insertSeat(@Param("seat") Seat seat);
	
	/**删除座位信息*/
	public int deleteSeat(Integer id);
	
	/**修改座位信息*/
	public int updateSeat(@Param("seat") Seat seat);
	
}	
