package com.mindteck.store.services;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindteck.store.repositories.BookRepository;

import main.java.com.mindteck.store.model.product.Book;

@Service("bookService")
public class BookService {
	@Autowired
	BookRepository bookRepository;	

	// Get Book by id
	@Transactional
	public Book getBookById(Integer id){		
		Book book = bookRepository.getBookById(id);
		return book;
	}		
		
	// Get all books
	@Transactional
	public List<Book> getAllBooks(){		
		List<Book> bookList = bookRepository.getAllBooks();
		return bookList;
	}
		
	// Add Book
	@Transactional
	public boolean add(Book book){
		bookRepository.save(book);
		return true;
	}
	
	// Update Book
	@Transactional
	public boolean update(Book book) {	
		bookRepository.update(book);
		return true;
	}
			
	// Delete Book
	@Transactional
	public boolean deleteById(Integer id) {  
		 bookRepository.deleteById(id);
		 return true;
	}  
}
