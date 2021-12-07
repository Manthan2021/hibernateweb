package com.coforge.training.hibernateDemo3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.training.hibernateDemo3.model.Employee;



/**
 * Hello world!
 *
 */

//hibernate Application Using Xml configuration
public class EmployeeApp 
{
    public static void main( String[] args )
    {
    	int cnt=0;
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session=sf.openSession();

    	Transaction t=session.beginTransaction();

    	Employee e1=new Employee();

    	e1.setFirstName("Manthan");
    	e1.setLastName("Bhagtani");

    	session.save(e1);
    	t.commit();
    	System.out.println("Data successfully Saved to DB");
    	session.close();
    	sf.close();
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
    }
}
