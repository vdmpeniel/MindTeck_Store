package com.mindteck.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindteck.store.services.BookService;

import main.java.com.mindteck.store.model.product.Book;

@RestController
public class BookController {
	@Autowired
	BookService bookService;
	
	@RequestMapping(value = "/getAllBooks", method = RequestMethod.GET, headers = "Accept=application/json")  
	public List<Book> getBooks(){
		return bookService.getAllBooks();
	}
	
	@RequestMapping(value = "/getBook/{id}", method = RequestMethod.GET, headers = "Accept=application/json")  
	public Book getBookById(@PathVariable int id) {  
		return bookService.getBookById(id);  
	} 
	
	@RequestMapping(value = "/addBook", method = RequestMethod.POST, headers = "Accept=application/json")  
	public void addBook(@RequestBody Book book) {   
		bookService.add(book);
	}
	
	@RequestMapping(value = "/updateBook", method = RequestMethod.PUT, headers = "Accept=application/json")  
	public void updateBook(@RequestBody Book book) {  
		bookService.update(book);  
	}  
	  
	@RequestMapping(value = "/deleteBook/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")  
	public void delete(@PathVariable("id") int id) {  
		bookService.deleteById(id);    
	}   	
	
}
