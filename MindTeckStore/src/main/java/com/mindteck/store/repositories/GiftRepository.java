package com.mindteck.store.repositories;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import main.java.com.mindteck.store.dao.hibernateutils.SessionManager;
import main.java.com.mindteck.store.model.product.Gift;
import main.java.com.mindteck.store.model.product.Gift;

@Repository
public class GiftRepository extends GenericRepository{
	@Autowired
	private SessionManager sessionManager;
	
	// Get Gift by id
	public Gift getGiftById(Integer id){		
		Session session = sessionManager.createSession();
		
		Gift gift = (Gift) session.load(Gift.class, id);  
		
		sessionManager.closeSession(session);		
		return gift;
	}
		
	
	// Get all Gifts
	public List<Gift> getAllGifts(){
		Session session = sessionManager.createSession();
		
		Criteria criteria = session.createCriteria(Gift.class);
		List<Gift> giftList = criteria.list();
		
		sessionManager.closeSession(session);
		return giftList;
	}
		
	
	// Update gift
	public boolean update(Gift gift) {		
		Session session = sessionManager.createSession();
		
		session.update(gift);			
		
		sessionManager.closeSession(session);
		return true;
	}
	
	
	// Delete Gift
	public boolean deleteById(Integer id) {  
		 Session session = sessionManager.createSession();  
			 
		 Gift gift = (Gift) session.load(Gift.class, id);  
		 if (gift != null) {  
			 session.delete(gift);  
		 }  
			 
		 sessionManager.closeSession(session);
		 return true;
	}  
}
