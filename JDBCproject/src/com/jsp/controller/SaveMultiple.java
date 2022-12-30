package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class SaveMultiple {
    public static void main(String[] args) {
		ArrayList<Student> a=new ArrayList<Student>();
		Student s1=new Student();
		s1.setId(32);
		s1.setName("Akshay");
		s1.setEmail("akshay.gmail.com");
		s1.setGender("male");
		s1.setCno(986547);
		
		Student s2=new Student();
		s2.setId(31);
		s2.setName("Amit");
		s2.setEmail("amit.gmail.com");
		s2.setGender("male");
		s2.setCno(9865475);
		
		Student s3=new Student();
		s3.setId(33);
		s3.setName("Ashu");
		s3.setEmail("ashu.gmail.com");
		s3.setGender("male");
		s3.setCno(9865476);
		
		Student s4=new Student();
		s4.setId(40);
		s4.setName("Akku");
		s4.setEmail("akku.gmail.com");
		s4.setGender("male");
		s4.setCno(98654788);
		
		a.add(s4);
		a.add(s3);
		a.add(s2);
		a.add(s1);
		
		StudentDao studentDao=new StudentDao();
		studentDao.addmultipleStudent(a);
	}
}
