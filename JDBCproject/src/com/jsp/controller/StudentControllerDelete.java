package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentControllerDelete {
    public static void main(String[] args) {
    	Student student=new Student();
		student.setId(41);
		student.setName("Akshay");
		student.setEmail("akshay@mail.com");
		student.setGender("Male");
		student.setCno(987065437);
		
		StudentDao studentDao=new StudentDao();
		studentDao.deleteStudent(student);
		
	}
}
