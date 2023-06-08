package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Student;

public interface StudentRepo extends JpaRepository<Student, String> {
	List<Student> findAll();
	Optional<Student> findById(String id);
	void deleteById(String id);
	Student save(String id);
}
