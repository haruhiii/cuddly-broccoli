package com.example.demo.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CourseSession {
	
	public CourseDao CourseSession() throws IOException{
		InputStream res = Resources.getResourceAsStream("config.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(res);
		SqlSession session = sessionFactory.openSession(true);
		CourseDao courseDao = session.getMapper(CourseDao.class);
		return courseDao;
	}
}
