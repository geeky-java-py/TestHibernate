package com.test;

import com.execute.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans =  session.beginTransaction();
		employee emp = new employee();
		emp.setSname("James");
		emp.setLastName("Mathew");
		//emp.setSid(1002);
		session.save(emp);
		trans.commit();
		
		
	}

}
