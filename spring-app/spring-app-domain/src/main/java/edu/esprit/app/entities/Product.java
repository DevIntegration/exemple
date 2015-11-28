package edu.esprit.app.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Product
 *
 */
@Entity

public class Product implements Serializable {

	   
	@Id
	private String serianNumber;
	private String designation;
	private double price;
	private Long quantity;
	private static final long serialVersionUID = 1L;

	public Product() {
		super();
	}   
	public String getSerianNumber() {
		return this.serianNumber;
	}

	public void setSerianNumber(String serianNumber) {
		this.serianNumber = serianNumber;
	}   
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}   
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}   
	public Long getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
   
}
