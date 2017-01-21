package com.mindteck.store.repositories;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import main.java.com.mindteck.store.dao.hibernateutils.SessionManager;


@Repository
public abstract class GenericRepository {
	@Autowired
	private SessionManager sessionManager;
	
	// Save Object
	public boolean save(Object object) {			
		Session session = sessionManager.createSession();	
		
		session.save(object);
		
		sessionManager.closeSession(session);
		return true;
	}

	
	// Delete object
	public boolean delete(Object object) {		
		Session session = sessionManager.createSession();	
		
		session.delete(object);
		
		sessionManager.closeSession(session);
		return true;
	}
}
