package com.mindteck.store.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import main.java.com.mindteck.store.model.product.Product;


@Entity
@DiscriminatorValue(value = "book")
public class Book extends Product{	
	@Column
	@NotNull
	private String author;
		
	@Column(unique = true)
	@NotNull
	private String iSBN;	
	

	// Constructors
	public Book(){}
	
	public Book(String title,
				String description,
				String author,
				Double price,
				String category,
				Integer stackQuantity,
				String iSBN) {
		super(title, description, price, category, stackQuantity);
		this.author = author;
		this.iSBN = iSBN;			
		
	}

	
	// Getters and Setters
	public String getiSBN() {
		return iSBN;
	}
	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}	
	
}
