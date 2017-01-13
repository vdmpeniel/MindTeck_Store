package main.java.com.mindteck.store.model.ecommerce;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private String id;
		
	@Column
	private Double saleTaxes;
	
	@Column
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

	public Order(String id, ShoppingCart shoppingCart, Double saleTaxes, String trackingNumber, String shippingAddress, Date orderDate,
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

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
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

	public Double getSaleTaxes() {		
		return calculateSaleTaxes();
	}
	
	private Double calculateSaleTaxes(){
		// At this point let us stablish sales taxes rate at 7%
		saleTaxes = this.shoppingCart.totalPrice * 0.07;
		return saleTaxes;
	}
	
	
	
	// Methods
	 
	

}
