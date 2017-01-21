package com.mindteck.store.model;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import main.java.com.mindteck.store.model.ecommerce.Order;
import main.java.com.mindteck.store.model.ecommerce.ProductRequest;

@Entity
@Table(name = "customer")
@PrimaryKeyJoinColumn(name = "customerId", referencedColumnName = "id")
public class Customer extends User{
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL) // One product to many product requests
	Set<ProductRequest> shoppingCart;	

	// Constructors
	public Customer() {	
		super();
		
	}
	public Customer(String name,
					String lastName,
					String phoneNumber,
					String email,
					String password) {
		
		super(name, lastName, phoneNumber, email, password);		
		this.shoppingCart = new HashSet<>();
	}
	
	
	// Setters and Getters
	public Set<ProductRequest> getShopingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(Set<ProductRequest> shopingCart) {
		this.shoppingCart = shopingCart;
	}	
}
