package main.java.com.mindteck.store.model.user;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import main.java.com.mindteck.store.model.ecommerce.Order;
import main.java.com.mindteck.store.model.ecommerce.ProductRequest;
import main.java.com.mindteck.store.model.product.Product;

@Entity
@Table(name = "customer")
@PrimaryKeyJoinColumn(name = "customerId", referencedColumnName = "id")
public class Customer extends User{
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL) // One product to many product requests
	Set<ProductRequest> shoppingCart = new HashSet<>();
	
	@Transient
	private Queue<Order> orderList; // Customer may have many pending orders
	
	// Constructors
	public Customer() {	
		super();
		
	}
	public Customer(String name,
					String lastName,
					String phoneNumber,
					String email,
					String password,
					Queue<Order> orderList) {
		
		super(name, lastName, phoneNumber, email, password);		
		this.orderList = orderList;
	}
	
	// Setters and Getters
	public Set<ProductRequest> getShopingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(Set<ProductRequest> shopingCart) {
		this.shoppingCart = shopingCart;
	}
	public Queue<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(Queue<Order> orderList) {
		this.orderList = orderList;
	}	
	
}
