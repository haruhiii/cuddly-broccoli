package com.example.demo.dao;

import org.apache.ibatis.annotations.Select;
import com.example.demo.bean.Classes;

public interface ClassesDao {

	
	@Select(" SELECT * FROM class  WHERE Class_id=#{Class_id};")
	public Classes findByClassId(int Class_id);
}


