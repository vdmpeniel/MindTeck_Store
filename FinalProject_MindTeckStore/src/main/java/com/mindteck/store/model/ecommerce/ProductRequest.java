package main.java.com.mindteck.store.model.ecommerce;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import main.java.com.mindteck.store.model.product.Product;

@Entity
@Table(name = "product_request")
public class ProductRequest {
	@Id
	Integer id;
	
	@Column
	Product product;
	
	@Column
	Integer quantity;
	
	// Constructors
	public ProductRequest(){
		
	}	
	public ProductRequest(Product product, Integer quantity) {		
		this.product = product;
		this.quantity = quantity;
	}
	
	// Getters and setters
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	

}
