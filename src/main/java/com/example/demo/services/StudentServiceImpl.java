package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentServiceImpl {
	List<Student> findAll();
	Student findById(String id);
//	Student add(String id, Student newStudent);
	Student save(String id);
	void deleteById(String id);
}
