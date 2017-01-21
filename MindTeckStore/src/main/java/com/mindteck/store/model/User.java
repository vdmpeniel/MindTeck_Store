package com.mindteck.store.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="user")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false, nullable = false)
	Integer id;
	
	@Column(length = 20)
	@NotNull
	@Size(min = 5, max = 20)
	String name;
	
	@Column(length = 20)
	@NotNull
	@Size(min = 5, max = 20)
	String lastName;
	
	@Column(length = 30)
	@NotNull
	@Size(min = 10)
	String phoneNumber;
	
	@Column(unique = true)
	@NotNull
	String email;
	
	@Column(length = 32)
	@NotNull
	@Size(min = 8, max = 32)
	String password;	
	
	// Constructors
	public User() {
		
	}
	
	public User(String name, String lastName, String phoneNumber, String email,String password) {
		this.name = name;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
	}
	
	//Getters and Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// Methods
	

}
