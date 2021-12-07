package com.coforge.training.hibernateDemo3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.training.hibernateDemo3.model.Customer;

//hibernate application using annotation
public class CustomerApp {

	public static void main(String[] args) {
		int cnt=0;
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");//configures hibernate with db
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
//physical connection with db established
		Transaction t=session.beginTransaction();
		
		Customer c1=new Customer();//transient state object
		c1.setFirstName("Rod");
		c1.setLastName("Johnson");
		c1.setBalance(100000);
		c1.setMarried(false);
		session.save(c1); // object in persistent state
		t.commit();
		System.out.println("Customer Details successfully Saved to DB");
		session.close(); // object in detached state
		sf.close();
		
		
	}

}
