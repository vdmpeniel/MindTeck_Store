package main.java.com.mindteck.store.model.product;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value = "gift")
public class Gift extends Product{	
	
	@Column
	String color;	

	// Constructors
	public Gift(){}
	
	public Gift(String title,
				String description,
				Double price,
				String category,
				Integer stackQuantity,
				String color) {
		super(title, description, price, category, stackQuantity);
		this.color = color;			
		
	}

	// Getters and Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	
}
