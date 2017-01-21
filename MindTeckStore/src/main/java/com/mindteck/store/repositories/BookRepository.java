package com.mindteck.store.repositories;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import main.java.com.mindteck.store.dao.hibernateutils.SessionManager;
import main.java.com.mindteck.store.model.product.Book;


@Repository
public class BookRepository extends GenericRepository{
	@Autowired
	private SessionManager sessionManager;
	
	// Get Book by id
	public Book getBookById(Integer id){		
		Session session = sessionManager.createSession();
		
		Book book = (Book) session.load(Book.class, id);  
		
		sessionManager.closeSession(session);		
		return book;
	}
	
	
	// Get all books
	public List<Book> getAllBooks(){
		Session session = sessionManager.createSession();
		
		Criteria criteria = session.createCriteria(Book.class);
		List<Book> bookList = criteria.list();
		
		sessionManager.closeSession(session);
		return bookList;
	}
	
	
	// Add Book
	public boolean add(Book book) {		
		Session session = sessionManager.createSession();
		
		session.save(book);			
		
		sessionManager.closeSession(session);
		return true;
	}
	
		
	// Update Book
	public boolean update(Book book) {		
		Session session = sessionManager.createSession();
		
		session.update(book);			
		
		sessionManager.closeSession(session);
		return true;
	}
	
	
	// Delete Book
	public boolean deleteById(Integer id) {  
		 Session session = sessionManager.createSession();  
		 
		 Book book = (Book) session.load(Book.class, id);  
		 if (book != null) {  
			 session.delete(book);  
		 }  
		 
		 sessionManager.closeSession(session);
		 return true;
	}  

		
}
