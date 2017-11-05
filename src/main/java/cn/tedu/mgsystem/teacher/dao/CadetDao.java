package cn.tedu.mgsystem.teacher.dao;

import org.apache.ibatis.annotations.Param;

import cn.tedu.mgsystem.teacher.entity.Cadet;

public interface CadetDao {
	
	/**新增学员*/
	public int insertCadet(@Param("cadet") Cadet cadet);
	
	/**查找学员*/
	public Cadet findCadetById(Integer id);
	
	/**删除学员*/
	public int deleteCadet(Integer id);
	
	/**修改学员*/
	public int updateCadet(@Param("cadet") Cadet cadet);
	
}
