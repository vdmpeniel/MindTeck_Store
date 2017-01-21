package com.mindteck.store.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

import main.java.com.mindteck.store.model.product.Product;


@Entity
@DiscriminatorValue(value = "gift")
@XmlRootElement
public class Gift extends Product{	
	
	@Column
	String color;
	
	@Column
	Long serialNumber;

	// Constructors
	public Gift(){}
	
	public Gift(String title,
				String description,
				Double price,
				String category,
				Integer stackQuantity,
				String color,
				Long serialNumber) {
		super(title, description, price, category, stackQuantity);
		this.color = color;	
		this.serialNumber = serialNumber;
		
	}

	// Getters and Setters	
	
	public String getColor() {
		return color;
	}

	
	
	public void setColor(String color) {
		this.color = color;
	}	
}
