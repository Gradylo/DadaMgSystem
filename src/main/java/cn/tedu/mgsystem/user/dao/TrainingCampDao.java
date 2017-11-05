package cn.tedu.mgsystem.user.dao;

import org.apache.ibatis.annotations.Param;

import cn.tedu.mgsystem.user.entity.TrainingCamp;

public interface TrainingCampDao {
	
	/**增加训练营*/
	public int insertTrainingCamp(@Param("TrainingCamp") TrainingCamp TrainingCamp);
	
	/**查找训练营*/
	public TrainingCamp findTrainingCampByClassNumber(Integer classroomNumber);
	
	/**删除训练营*/
	public int deleteTrainingCamp(Integer id);
	
	/**修改训练营*/
	public int updateTrainingCamp(@Param("TrainingCamp") TrainingCamp TrainingCamp);
	
	
}
