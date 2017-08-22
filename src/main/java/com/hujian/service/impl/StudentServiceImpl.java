package com.hujian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hujian.dao.StudentDao;
import com.hujian.entity.Student;
import com.hujian.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;

	@Override
	public Student find(Integer id) {
		// TODO Auto-generated method stub
		return studentDao.find(id);
	}

	@Override
	public List<Student> find() {
		// TODO Auto-generated method stub
		return studentDao.find();
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		studentDao.save(student);
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		studentDao.update(student);
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		studentDao.delete(student);
	}

}
