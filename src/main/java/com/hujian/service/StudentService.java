package com.hujian.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hujian.entity.Student;

public interface StudentService {
	public Student find(Integer id);
	
	public List<Student> find();
	
	public void save(Student student);
	
	public void update(Student student);
	
	public void delete(Student student);
}
