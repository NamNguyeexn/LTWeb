package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id //tag khoa chinh
	@Column(name = "id", nullable = false)
	private String id;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "dob", nullable = false)
	private String dob;
	@Column(name = "department", nullable = false)
	private String department;
	@Column(name = "approved", nullable = false)
	private int approved;
	
	public Student() {
		super();
	}
	public Student(String id, String name, String dob, String department, int approved) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.department = department;
		this.approved = approved;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getApproved() {
		return approved;
	}
	public void setApproved(int approved) {
		this.approved = approved;
	}
}
