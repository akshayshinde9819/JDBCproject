package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentControllerUpdate {
   public static void main(String[] args) {
	   Student student=new Student();
		student.setId(11);
		student.setName("Ankit");
		student.setEmail("ankit@mail.com");
		student.setGender("Male");
		student.setCno(9870654);
		
		StudentDao studentDao=new StudentDao();
		studentDao.updateStudent(student);
		
}
}
