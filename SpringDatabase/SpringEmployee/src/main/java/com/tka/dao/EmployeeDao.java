package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory sf;
	
	public String insertData(Employee e) {
		
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		ss.persist(e);
		
		tr.commit();
		ss.close();
		
		return "data inserted!";
	}
	
}
