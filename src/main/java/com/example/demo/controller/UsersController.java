package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.bean.Course;
import com.example.demo.bean.User;
import com.example.demo.service.CourseService;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("users")
public class UsersController {

	 @Resource
	 private UserService userService;
	 @Resource
	 private CourseService courseService;
	 
	 @RequestMapping("findAll")
	 public String findAll(Model model) throws IOException {
			
			List<User> users = userService.findAllUsers();
			for(User u:users) {
				System.out.println(u);
			}
			model.addAttribute("users",users);
			return "admin/user";
	 }
	 
	 @RequestMapping("toadd")	
	 public String toAdd() {
			
			return "admin/add_user";
	}
	 
	 @PostMapping("add")
	 public String add(@ModelAttribute User user) throws IOException  {
		 userService.add(user);
		 return "admin/add_user";
	 }
	 
	 @RequestMapping("toupdate")	
	 public String toUpdate(int id, Model model) throws IOException {
			User user = userService.findById(id);
			model.addAttribute("user",user);
			return "admin/update_user";
	}
	 
	 @PostMapping("update")
	 public String update(@ModelAttribute User user) throws IOException  {
		userService.update(user);
		return "admin/update_user";
	 }
	 
	 @RequestMapping("delete")
	 public String delete(@RequestParam(value = "id") int id, Model model) throws IOException {
		 userService.delete(id);
		 List<User> users = userService.findAllUsers();
		 model.addAttribute("users",users);
		 return "admin/user";
	 }
	 
	 @RequestMapping("/")
	 public String index(){
	    return "login";
	 }
	 
    @RequestMapping("/login")
    public String login(@RequestParam(value = "id") int id, @RequestParam(value = "password") String password, Model model)
        throws IOException {
        User user = userService.login(id, password);
        if(user.getType().equals("学生")){
        	List<Course> course = courseService.findAll();
    		
    		model.addAttribute("course",course);
            return "student/student";
        }
        else if(user.getType().equals("教师")){
            return "teacher/teacher";
        }       
        else if(user.getType().equals("管理员")){
        	List<User> users = userService.findAllUsers();
   		    model.addAttribute("users",users);
   		    return "admin/user";
            
        }else {
        	return "login";
        }
        
    }
    
    @RequestMapping("/loginout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "login";
    }
	 
}
