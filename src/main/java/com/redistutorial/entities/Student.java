package com.redistutorial.entities;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;
import lombok.Setter;

@RedisHash("Student")
@Getter
@Setter
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public enum Gender {
		MALE, FEMALE
	}	

	public Student(String id, String name, Gender gender, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.grade = grade;
	}
	
	private String id;
	private String name;
	private Gender gender;
	private int grade;
}
