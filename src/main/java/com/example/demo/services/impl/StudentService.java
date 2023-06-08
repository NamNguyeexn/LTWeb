package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.services.StudentServiceImpl;

@Service
public class StudentService implements StudentServiceImpl{
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> findAll() {
		List<Student> students = studentRepo.findAll();
		return students;
	}

	@Override
	public Student findById(String id) {
		Optional<Student> _student = studentRepo.findById(id);
		if(!_student.isPresent()) {
			return null;
		}
		return _student.get();
	}

	@Override
	public Student save(String id) { // cap nhat gia tri aprrove cua student co id 
		Optional<Student> _student = studentRepo.findById(id);
		if(!_student.isPresent()) {
			return null;
		}
		_student.get().setApproved(1);
		return _student.get();
	}

	@Override
	public void deleteById(String id) {
//		Optional<Student> _student = studentRepo.findById(id);
//		if(!_student.isPresent()) {
//			return null;
//		}
		studentRepo.deleteById(id);
//		return null;
	}
	
}
