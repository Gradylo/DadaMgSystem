package cn.tedu.mgsystem.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.tedu.mgsystem.entity.UserNameEmp;

@Repository
public interface UserNameDAO {
	List<UserNameEmp> findAll();

	UserNameEmp findById(String user);
}
