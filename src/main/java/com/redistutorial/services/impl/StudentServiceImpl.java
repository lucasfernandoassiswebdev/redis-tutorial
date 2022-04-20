package com.redistutorial.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redistutorial.entities.Student;
import com.redistutorial.repositories.StudentRepository;
import com.redistutorial.services.StudentService;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent() {
		Student student = new Student("Eng2015001", "John Doe", Student.Gender.MALE, 1);
		Student savedStudent = studentRepository.save(student);
		return savedStudent;
	}

	@Override
	public Student getStudent() {
		return studentRepository.findById("Eng2015001").get();
	}

	@Override
	public Student updateStudent() {
		Student retrievedStudent = getStudent();
		retrievedStudent.setName("Richard Watson");
		Student updatedStudent = studentRepository.save(retrievedStudent);
		return updatedStudent;
	}

	@Override
	public void deleteStudent() {
		studentRepository.deleteById("Eng2015001");
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}
}
