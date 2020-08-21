package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

	@Document(collection = "students")
	public class Student {
	    @Id
	    private String id;
	    private String name;
	    private long studentNumber;
	    private String email;
	    private List<String> courseList;
	    private float gpa;
		public Student() {
			//super();
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getStudentNumber() {
			return studentNumber;
		}
		public void setStudentNumber(long studentNumber) {
			this.studentNumber = studentNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public List<String> getCourseList() {
			return courseList;
		}
		public void setCourseList(List<String> courseList) {
			this.courseList = courseList;
		}
		public float getGpa() {
			return gpa;
		}
		public void setGpa(float gpa) {
			this.gpa = gpa;
		}
		
	    
	    
	    
	    
}
