package com.redistutorial.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.redistutorial.entities.Student;

@Repository("StudentRepository")
public interface StudentRepository extends CrudRepository<Student, String> {}
