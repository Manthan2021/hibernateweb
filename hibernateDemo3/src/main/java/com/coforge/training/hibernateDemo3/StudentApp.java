package com.coforge.training.hibernateDemo3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.coforge.training.hibernateDemo3.model.Student;

//hibernate Application Using Xml configuration
public class StudentApp {
	public static void main(String[] args) {
	int cnt=0;
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();

	Transaction t=session.beginTransaction();
	Student s1=new Student();
	s1.setId(1);
	s1.setFirstName("James");
	s1.setLastName("Gosling");
	s1.setCollege("Sun");
	s1.setCompany("coforge");
	session.save(s1); // object in persistent state
	t.commit();
	System.out.println("Student Details successfully Saved to DB");
	session.close(); // object in detached state
	sf.close();
	
	
	}
}
