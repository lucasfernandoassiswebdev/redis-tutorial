package com.redistutorial.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redistutorial.entities.Student;
import com.redistutorial.services.StudentService;

@RestController
@RequestMapping("/student-api/")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("save")
	public ResponseEntity<Student> saveStudent() {
		Student savedStudent = studentService.saveStudent();
		return ResponseEntity.status(HttpStatus.OK).body(savedStudent);
	}
	
	@GetMapping("getById")
	public ResponseEntity<Student> getStudentById() {
		Student student = studentService.getStudent();
		return ResponseEntity.status(HttpStatus.OK).body(student);
	}
	
	@PutMapping("updateData")
	public ResponseEntity<Student> updateStudent() {
		Student updatedStudent = studentService.updateStudent();
		return ResponseEntity.status(HttpStatus.OK).body(updatedStudent);
	}
	
	@DeleteMapping("deleteStudent")
	public ResponseEntity<?> deleteStudent() {
		studentService.deleteStudent();;
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	@GetMapping("getAll")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> students = studentService.getAllStudents();
		return ResponseEntity.status(HttpStatus.OK).body(students);
	}
}
