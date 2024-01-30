package com.demo.service;

import com.demo.model.Student;

public interface StudentService {
	
	public  Student saveStudent(Student student);
	
	public Student getStudentById(Integer id);
	
	public void deleteStudentById(Integer id);
	
	public Student updateStudent(Student std,Integer id);
}
