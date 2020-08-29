package com.dxc.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.dxc.beans.Student;

public class App_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure();
		
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				                               .applySettings(configuration.getProperties())
				                               .buildServiceRegistry();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Student s1 = new Student(101,"karthik","karthik@gmail.com","9874841");
		Student s2= new Student(102,"sai","sai@gmail.com","54845");
		
		session.save(s1);
		session.save(s2);
		
		transaction.commit();
		System.out.println("Successfully saved in DB");
		
		session.close();
		sessionFactory.close();

	}

}
