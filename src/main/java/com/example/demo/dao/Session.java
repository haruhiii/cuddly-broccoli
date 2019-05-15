package com.example.demo.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Session {
	
	public UserDao Session() throws IOException{
		//读取配置文件流
		InputStream res = Resources.getResourceAsStream("config.xml");
		//获取SqlSession工厂方法
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(res);
		//生成SqlSession
		SqlSession session = sessionFactory.openSession(true);
		//获取代理接口
		UserDao userDao = session.getMapper(UserDao.class);
		
		return userDao;
		
	}
}
