package com.example.demo.dao;

import org.apache.ibatis.annotations.Select;

import com.example.demo.bean.Teacher;

public interface TeacherDao {

	@Select(" SELECT * FROM teacher WHERE Teacher_id=#{Teacher_id};")
	public Teacher findByTeacherId(int Teacher_id);
}
