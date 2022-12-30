package com.jsp.controller;

	import com.jsp.dao.StudentDao;
	import com.jsp.dto.Student;

	public class StudentController {
	public static void main(String[] args) {
		Student student=new Student();
		student.setId(11);
		student.setName("Mahesh");
		student.setEmail("mahesh@mail.com");
		student.setGender("Male");
		student.setCno(987065448);
		
		StudentDao studentDao=new StudentDao();
		studentDao.saveStudent(student);
		
		
		
	}
	}


