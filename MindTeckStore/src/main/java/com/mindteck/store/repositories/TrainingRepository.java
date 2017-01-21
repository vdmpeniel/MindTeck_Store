package com.mindteck.store.repositories;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import main.java.com.mindteck.store.dao.hibernateutils.SessionManager;
import main.java.com.mindteck.store.model.product.Training;
import main.java.com.mindteck.store.model.product.Training;

@Repository
public class TrainingRepository extends GenericRepository{
	@Autowired
	private SessionManager sessionManager;
	
	// Get Training by id
	public Training getTrainingById(Integer id){		
		Session session = sessionManager.createSession();
		
		Training training = (Training) session.load(Training.class, id);  
		
		sessionManager.closeSession(session);		
		return training;
	}
		
		
	// Get all Trainings
	public List<Training> getAllTrainings(){
		Session session = sessionManager.createSession();
		
		Criteria criteria = session.createCriteria(Training.class);
		List<Training> trainingList = criteria.list();
		
		sessionManager.closeSession(session);
		return trainingList;
	}
		
		
	// Update Training
	public boolean update(Training training) {		
		Session session = sessionManager.createSession();
		
		session.update(training);			
			
		sessionManager.closeSession(session);
		return true;
	}
		
		
	// Delete Training
	public boolean deleteById(Integer id) {  
		 Session session = sessionManager.createSession();  
		 
		 Training training = (Training) session.load(Training.class, id);  
		 if (training != null) {  
			 session.delete(training);  
		 }  
		 
		 sessionManager.closeSession(session);
		 return true;
	}  
}
