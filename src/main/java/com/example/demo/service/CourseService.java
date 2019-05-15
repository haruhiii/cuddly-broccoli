package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Course;
import com.example.demo.bean.Student;
import com.example.demo.dao.CourseDao;
import com.example.demo.dao.CourseSession;

@Service
public class CourseService {
	
	@Resource
	private CourseDao courseDao;
	CourseSession Course = new CourseSession();

	public List<Course> findAll() throws IOException {
		List<Course> courses=Course.CourseSession().findAll();
		return Course.CourseSession().findAll();
	}

    // currentPageNumber:当前的页号 0，注意：0表示第一页。
    //pageSize: 每页显示多少条记录  10

    public void add(Course course) throws IOException {
    	Course.CourseSession().add(course);
    	
	}
    
    public void update(Course course) throws IOException {
    	Course.CourseSession().update(course);
    	
	}

    public Course findById(int id) throws IOException {
    	System.out.println(Course.CourseSession().findById(id));
		return Course.CourseSession().findById(id);
	}

    public void delete(int CourseId) throws IOException {
    	Course.CourseSession().delete(CourseId);
	}
    
    public Student findStudent() throws IOException {
    	return Course.CourseSession().findStudent();
    }
}
