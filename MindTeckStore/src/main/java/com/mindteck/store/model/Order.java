package com.mindteck.store.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private String id;
	
	// This set will contain the cart once it have being ordered
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL) // One product to many product requests
	Set<ProductRequest> shoppingCart = new HashSet<>();
		
	@Column
	private Double saleTaxes;
	
	@Column(unique = true)
	private String trackingNumber;
	
	@Column
	private String shippingAddress;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	
	@Column
	Boolean fullfiled;
	
	public Order() {
		
	}

	public Order(String id, Set<ProductRequest> shoppingCart, Double saleTaxes, String trackingNumber, String shippingAddress, Date orderDate,
				 Boolean fullfiled) {
		this.id = id;
		this.shoppingCart = shoppingCart;
		this.saleTaxes = 0.0;
		this.trackingNumber = trackingNumber;
		this.shippingAddress = shippingAddress;
		this.orderDate = orderDate;
		this.fullfiled = fullfiled;
	}

	
	// Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Set<ProductRequest> getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(Set<ProductRequest> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public Double getSaleTaxes() {
		return saleTaxes;
	}

	public void setSaleTaxes(Double saleTaxes) {
		this.saleTaxes = saleTaxes;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Boolean getFullfiled() {
		return fullfiled;
	}

	public void setFullfiled(Boolean fullfiled) {
		this.fullfiled = fullfiled;
	}
	
	
	// Methods
	
}
