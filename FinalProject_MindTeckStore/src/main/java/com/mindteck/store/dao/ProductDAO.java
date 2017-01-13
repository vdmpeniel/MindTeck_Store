package main.java.com.mindteck.store.dao;

import org.hibernate.Session;

import main.java.com.mindteck.store.dao.hibernateutils.SessionManager;

public class ProductDAO {
	public boolean save(Object object) {		
		SessionManager sessionManager = new SessionManager();
		Session session = sessionManager.createSession();	
		
		session.save(object);
		
		sessionManager.closeSession(session);
		return true;
	}
}