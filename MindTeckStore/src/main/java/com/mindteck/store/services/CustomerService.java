package com.mindteck.store.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mindteck.store.model.Customer;
import com.mindteck.store.repositories.CustomerRepository;



@Service("customerService")
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;	

	// Get Customer by id
	@Transactional
	public Customer getCustomerById(Integer id){		
		Customer customer = customerRepository.getCustomerById(id);
		return customer;
	}		
		
	// Get all Customers
	@Transactional
	public List<Customer> getAllCustomers(){		
		List<Customer> customerList = customerRepository.getAllCustomers();
		return customerList;
	}
		
	// Add Customer
	@Transactional
	public boolean add(Customer customer){
		customerRepository.save(customer);
		return true;
	}
	
	// Update Customer
	@Transactional
	public boolean update(Customer customer) {	
		customerRepository.update(customer);
		return true;
	}
			
	// Delete Customer
	@Transactional
	public boolean deleteById(Integer id) {  
		 customerRepository.deleteById(id);
		 return true;
	}  
}
