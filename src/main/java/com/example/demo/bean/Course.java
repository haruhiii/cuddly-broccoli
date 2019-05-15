package com.example.demo.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Course {

	private int CourseId;
	private String Name;
	private int grade;
	private Teacher teachers;
	Classes classes;
	public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int CourseId) {
		this.CourseId = CourseId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public Teacher getTeachers() {
		return teachers;
	}
	public void setTeachers(Teacher teachers) {
		this.teachers = teachers;
	}
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

}
