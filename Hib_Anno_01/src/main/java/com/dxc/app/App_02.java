package com.dxc.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.dxc.beans.Employee;

public class App_02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure();
		
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				                               .applySettings(configuration.getProperties())
				                               .buildServiceRegistry();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = new Employee();
		
		session.save(e1);
		transaction.commit();
		System.out.println("Successfully saved in DB");
		
		session.close();
		sessionFactory.close();

	}

}
