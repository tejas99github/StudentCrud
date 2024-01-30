package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Student;
import com.demo.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {

		Student std = studentRepository.save(student);

		return std;
	}

	@Override
	public Student getStudentById(Integer id) {

		Student student = studentRepository.findById(id).get();

		return student;
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);

	}

	@Override
	public Student updateStudent(Student std, Integer id) {
		Student student = studentRepository.findById(id).get();
		student.setStdName(std.getStdName());
		student.setStdCity(std.getStdCity());
		return student;
	}

}
