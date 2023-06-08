package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;
import com.example.demo.services.StudentServiceImpl;

@Controller
@RequestMapping("")
public class StudentController {
	@Autowired
	private StudentServiceImpl impl;
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/view")
	public String findAll(Model model) {
		List<Student> students = impl.findAll();
		model.addAttribute("students", students);
		return "viewStudent";
	}
	@RequestMapping("/update/{id}")
	public String updateStudent(@PathVariable("id") String id, Model model) {
		impl.save(id);
		List<Student> students = impl.findAll();
		model.addAttribute("students", students);
		return "viewStudent";
	}
	@PostMapping("delete/{id}")
	public String deleteStudent(@PathVariable("id") String id, Model model) {
		return "deleteStudent";
	}
}
