package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.bean.Course;
import com.example.demo.service.CourseService;

@Controller
@RequestMapping("course")
public class CourseController {

	 @Resource
	 private CourseService courseService;
	 
	 @RequestMapping("findAllCourse")
	 public String findAll(Model model) throws IOException {
			
			List<Course> course = courseService.findAll();
			model.addAttribute("course",course);
			return "admin/course";
	}
	 
	 @RequestMapping("toAddCourse")	
	 public String toAdd() {
			
			return "admin/add_course";
	}
	 
	 @PostMapping("addCourse")
	 public String add(@ModelAttribute Course course) throws IOException  {
		 courseService.add(course);
		 return "admin/add_course";
	 }
	 
	 @RequestMapping("toUpdateCourse")	
	 public String toUpdate(int CourseId, Model model) throws IOException {
			Course course = courseService.findById(CourseId);
			model.addAttribute("course",course);
			return "admin/update_course";
	}
	 
	 @PostMapping("updateCourse")
	 public String update(@ModelAttribute Course course) throws IOException  {
		courseService.update(course);
		return "admin/update_course";
	 }
	 
	 @RequestMapping("deleteCourse")
	 public String delete(@RequestParam(value = "CourseId") int CourseId, Model model) throws IOException {
		 courseService.delete(CourseId);
		 List<Course> course = courseService.findAll();
		 model.addAttribute("course",course);
		 return "admin/course";
	 }
	 
	 
}
