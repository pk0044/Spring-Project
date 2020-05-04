package com.pk.students.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.students.student.repo.Student;
import com.pk.students.student.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;
	
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public Optional<Student> getStudentById(int id) {
		return studentRepo.findById(id);
	}
	
	public List<Student> getAllStudents(){
		return (List<Student>) studentRepo.findAll();
	}
	
	public Student updatateStudentByID(Student student) {
		return studentRepo.save(student);
	}
}
