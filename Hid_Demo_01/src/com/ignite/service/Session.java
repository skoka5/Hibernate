package com.ignite.service;

public class Session {
	
	static Session session = null;
	
	protected Session() {
		
	}
    
	public static  Session sessionFactory() {
		if(session == null) {
			session = new Session();
		}
		return session;
	}
}
