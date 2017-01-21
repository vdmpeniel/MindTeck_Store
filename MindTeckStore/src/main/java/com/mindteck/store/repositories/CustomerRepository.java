package com.mindteck.store.repositories;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mindteck.store.model.Customer;
import main.java.com.mindteck.store.dao.hibernateutils.SessionManager;



@Repository
public class CustomerRepository extends GenericRepository{
	
	@Autowired
	private SessionManager sessionManager;
	
	// Get Customer by id
	public Customer getCustomerById(Integer id){		
		Session session = sessionManager.createSession();	
		
		Criteria criteria = session.createCriteria(Customer.class);				
		Customer customer = (Customer)criteria.add(Restrictions.eq("id", id)).list().get(0);
		
		sessionManager.closeSession(session);		
		return customer;
	}
	
	
	// Get all customers
	public List<Customer> getAllCustomers(){
		Session session = sessionManager.createSession();
			
		Criteria criteria = session.createCriteria(Customer.class);
		List<Customer> customerList = criteria.list();
			
		sessionManager.closeSession(session);
		return customerList;
	}
	
		
	// Update Customer
	public boolean update(Customer customer) {			
		Session session = sessionManager.createSession();	
		
		session.update(customer);
		
		sessionManager.closeSession(session);
		return true;
	}
	
	
	// Delete Customer
	public boolean deleteById(Integer id) {  
		 Session session = sessionManager.createSession();			 
		 Customer customer = (Customer) session.load(Customer.class, id); 

		 if (customer != null) {  
			 session.delete(customer);  
		 } 		
		 
		 sessionManager.closeSession(session);
		 return true;
	}
	
}
