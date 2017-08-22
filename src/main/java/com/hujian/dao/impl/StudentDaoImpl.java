package com.hujian.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.hujian.dao.StudentDao;
import com.hujian.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Override
	public Student find(Integer id) {
		 Configuration cfg = new Configuration(); 
		 SessionFactory sf = cfg.configure().buildSessionFactory();  
	        Session session = sf.openSession();  
	          
	        session.beginTransaction();  
	        Query query = session.createQuery("from Student t where id=:id");  
	        query.setParameter("id", id);
	        Student s = (Student) query.uniqueResult();
	        session.getTransaction().commit();  
	          
	        session.close();  
	        sf.close();  
		return s;
	}

	@Override
	public List<Student> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Student student) {
		Configuration cfg = new Configuration(); 
		SessionFactory sf = cfg.configure().buildSessionFactory();  
        Session session = sf.openSession();  
          
        session.beginTransaction();  
        session.save(student);
        session.getTransaction().commit();       
        session.close();  
        sf.close();  
	}

	@Override
	public void update(Student student) {
		Configuration cfg = new Configuration(); 
		SessionFactory sf = cfg.configure().buildSessionFactory();  
        Session session = sf.openSession();  
          
        session.beginTransaction();  
        session.update(student);
        session.getTransaction().commit();       
        session.close();  
        sf.close(); 
	}

	@Override
	public void delete(Student student) {
		Configuration cfg = new Configuration(); 
		SessionFactory sf = cfg.configure().buildSessionFactory();  
        Session session = sf.openSession();  
          
        session.beginTransaction();  
        session.delete(student);
        session.getTransaction().commit();       
        session.close();  
        sf.close(); 

	}

}
