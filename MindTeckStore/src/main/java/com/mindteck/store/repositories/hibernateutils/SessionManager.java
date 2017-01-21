package com.mindteck.store.repositories.hibernateutils;

import org.hibernate.Session;

public class SessionManager {
	
	public Session createSession(){
		System.out.println("Opening session...");		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		return session;
	}
	
	
	public void closeSession(Session session){
		session.flush();
		session.getTransaction().commit();
		session.close();
		System.out.println("Closing session...");
	}

}
