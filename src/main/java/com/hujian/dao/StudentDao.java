package com.hujian.dao;

import java.util.List;

import com.hujian.entity.Student;

public interface StudentDao {
	public Student find(Integer id);
	
	public List<Student> find();
	
	public void save(Student student);
	
	public void update(Student student);
	
	public void delete(Student student);
}
