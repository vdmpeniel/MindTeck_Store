package main.java.com.mindteck.store.model.product;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue(value = "training")
public class Training extends Product{	
	@Column
	@NotNull
	String author;
	
	@Column
	@NotNull
	Boolean downloadable;

	// Constructors
	public Training(){}
	
	public Training(String title,
					String description,
					String author,
					Double price,
					String category,
					Integer stackQuantity,
					String iSBN,
					Boolean downloadable) {
	super(title, description, price, "Trainings", stackQuantity);		
		this.downloadable = downloadable;		
	}

	
	// Getters and Setters	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public Boolean getDownloadable() {
		return downloadable;
	}

	public void setDownloadable(Boolean downloadable) {
		this.downloadable = downloadable;
	}
	

}
