package com.pk.students.student.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pk.students.student.repo.Student;
import com.pk.students.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String displayHome() {
		return "Hello world";
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public Student createStudent(String name, int std, String address) {
		return studentService.saveStudent(new Student(name, std, address));
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public List<Student> getStudents() {
		return studentService.getAllStudents();
	}
	
	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public Optional<Student> getStudentByID(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.PUT)
	public Student updateStudentByID(int id, String name, int std, String address) {
		return studentService.updatateStudentByID(new Student(id, name, std, address));
	}
}
