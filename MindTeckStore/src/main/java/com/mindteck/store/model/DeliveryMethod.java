package com.mindteck.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class DeliveryMethod {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	@Column
	@NotNull
	String method;
	
	@Column
	@NotNull
	Integer minNumberOfDays;
	
	@Column
	@NotNull
	Integer maxNumberOfDays;
	
	// Constructors
	public DeliveryMethod(){}
	public DeliveryMethod(Integer id, String method, Integer minNumberOfDays, Integer maxNumberOfDays) {
		super();
		this.id = id;
		this.method = method;
		this.minNumberOfDays = minNumberOfDays;
		this.maxNumberOfDays = maxNumberOfDays;
	}
	
	// Getters and Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Integer getMinNumberOfDays() {
		return minNumberOfDays;
	}
	public void setMinNumberOfDays(Integer minNumberOfDays) {
		this.minNumberOfDays = minNumberOfDays;
	}
	public Integer getMaxNumberOfDays() {
		return maxNumberOfDays;
	}
	public void setMaxNumberOfDays(Integer maxNumberOfDays) {
		this.maxNumberOfDays = maxNumberOfDays;
	}
	
	
	
	

}
