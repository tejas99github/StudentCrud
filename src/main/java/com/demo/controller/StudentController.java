package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.service.StudentService;

@RestController
@RequestMapping("/stdcontrol")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {

		Student std = studentService.saveStudent(student);

		return ResponseEntity.ok().body(std);

	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Integer id) {

		Student student = studentService.getStudentById(id);

		return ResponseEntity.ok().body(student);

	}

	@DeleteMapping("delete/{id}")
	public void deleteStudentById(@PathVariable Integer id) {
		studentService.deleteStudentById(id);
	}

	@PutMapping("/update/{id}")
	public Student updateStdById(@RequestBody Student std, @PathVariable Integer id) {

		Student student = studentService.updateStudent(std, id);

		return student;

	}

}
