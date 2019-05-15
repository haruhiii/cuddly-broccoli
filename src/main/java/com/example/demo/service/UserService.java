package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.print.attribute.standard.RequestingUserName;

import org.springframework.stereotype.Service;

import com.example.demo.bean.User;
import com.example.demo.dao.Session;
import com.example.demo.dao.UserDao;

@Service
public class UserService {
	
	@Resource
	private UserDao userDao;
	Session User = new Session();

	public List<User> findAllUsers() throws IOException {
		return User.Session().findAll();
	}

    // currentPageNumber:当前的页号 0，注意：0表示第一页。
    //pageSize: 每页显示多少条记录  10

    //添加汽车的方法
    public void add(User user) throws IOException {
    	User.Session().add(user);
    	
	}
    
    public void update(User user) throws IOException {
    	User.Session().update(user);
    	
	}

    public User findById(int id) throws IOException {
		return User.Session().findById(id);
	}

    public void delete(int id) throws IOException {
    	User.Session().delete(id);
	}

	public User login(int id, String password) throws IOException {
		// TODO Auto-generated method stub
		return User.Session().findById(id);
	}
}
