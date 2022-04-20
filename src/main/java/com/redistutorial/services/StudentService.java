package com.redistutorial.services;

import java.util.List;

import com.redistutorial.entities.Student;

public interface StudentService {

	Student saveStudent();
	Student getStudent(); 
	Student updateStudent();
	void deleteStudent();
	List<Student> getAllStudents();
}
