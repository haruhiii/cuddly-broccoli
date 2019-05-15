package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.io.IOException;

import com.example.demo.bean.Course;
import com.example.demo.bean.Student;
import com.example.demo.bean.Teacher;
import com.example.demo.bean.User;
import com.example.demo.dao.*;
import com.example.demo.service.CourseService;

@RunWith(SpringRunner.class)
@SpringBootTest

public class Demo6ApplicationTests {

	@Test
	public void findAll() throws IOException {
		CourseSession C = new CourseSession();
		Session U = new Session();
		//CourseService courseService = null;
		int a = 111;
		Course course = C.CourseSession().findById(111);
		Student student = C.CourseSession().findStudent();
		//Course course = C.CourseSession().findById(111);
		//User.Session().add();
		List<User> users = U.Session().findAll();
		for(User user:users)
		{
			System.out.println(user);
		}
		/*for(Course c:course) {
			System.out.println(c.getClasses().getClass_name());
		}*/
		//Teacher teacher = null;
		System.out.println(student.getName());

	}

}
