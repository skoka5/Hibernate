package com.dxc.hibdao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dxc.beans.Student;

public class StudentHibDAO extends HibDAO implements DAO {
	
	@Autowired
	SessionFactory sessionFactory ;
	Session session;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void openSession(){
		System.out.println("inside employeehibdao sessionFactory : "+sessionFactory);
		session = getSessionFactory().openSession();
	}
	
	public void closeSession(){
		session.close();
	}
	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}


	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student insert(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
