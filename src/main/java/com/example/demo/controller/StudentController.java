package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.Course;
import com.example.demo.dao.CourseSession;
import com.example.demo.service.CourseService;

@Controller
@RequestMapping("student")
public class StudentController {

	@Resource
	 private CourseService courseService;
	 
	@RequestMapping("toGrade")	
	 public String toGrade() {
			
			return "student/grade";
	}
	
	@RequestMapping("toCourse")	
	 public String toCourse() {
			
			return "student/course";
	}
	
	@RequestMapping("findAllCourse")
	 public String findAll(Model model) throws IOException {
			
		List<Course> course = courseService.findAll();
		
		model.addAttribute("course",course);
		return "student/student";
	}
	@RequestMapping("toTeacher")	
	public String toTeacher() {
		return "teacher/teacher";
	}
	
	@RequestMapping("toScore")	
	 public String toScore() {
			
			return "teacher/score";
	}
	
	@RequestMapping("toPig")	
	 public String toPig() {
			
			return "teacher/pig";
	}
	
	@RequestMapping("toRap")	
	 public String toRap() {
			
			return "teacher/rap";
	}
	
	@RequestMapping("toCourse1")	
	 public String toCourse1() {
			
			return "teacher/course";
	}
}
