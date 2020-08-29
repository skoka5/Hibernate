package com.dxc.hibdao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HibDAO {
	
	@Autowired
	private SessionFactory sessionFactory ;
	private Session session;
	public HibDAO(){
		session = sessionFactory.openSession();
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
