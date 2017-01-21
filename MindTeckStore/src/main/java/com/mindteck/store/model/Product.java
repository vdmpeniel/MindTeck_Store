package com.mindteck.store.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/*
  Here we are implementing a single 
  table strategy    
*/


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "productType", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "product")
@XmlRootElement
public abstract class Product implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
	private Integer id;
	
	@Column
	@NotNull
	@Size(min = 1, max = 20)
	private String title;
	
	@Column(length = 10000)
	@NotNull
	@Size(min = 1, max = 10000)
	private String description;
	
	@Column
	@NotNull
	private Double price;	
	
	@Column
	@NotNull
	private String category;
	
	@Column
	@NotNull
	private Integer stackQuantity;
	
	// Constructors
	public Product(){}
	
	public Product(String title, String description, Double price, String category, Integer stackQuantity) {		
		this.title = title;
		this.description = description;		
		this.price = price;
		this.category = category;
		this.stackQuantity = stackQuantity;
		
	}

	// Getters and Setters
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Integer getStackQuantity() {
		return stackQuantity;
	}
	
	public void setStackQuantity(Integer stackQuantity) {
		this.stackQuantity = stackQuantity;
	}			
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	// Methods		
	public String toString() {
        String result = getClass().getSimpleName() + " ";
        if (id != null)
            { result += "id: " + id + "\n"; }
        if (title != null && !title.trim().isEmpty())
            { result += "title: " + title + "\n"; }
        if (description != null && !description.trim().isEmpty())
            { result += "description: " + description + "\n";  }
        if(price != null)
        	{ result += "price: " + price;}
        return result;
    }
	
}
