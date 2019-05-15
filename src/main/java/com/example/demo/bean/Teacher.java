package com.example.demo.bean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Teacher {

	private int Teacher_id;
	private String Name;
	private int sex;
	private String password;
	private List<Course> course;
	
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getTeacher_id() {
		return Teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.Teacher_id = teacher_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	
}
