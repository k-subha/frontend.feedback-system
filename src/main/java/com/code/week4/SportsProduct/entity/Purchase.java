package com.code.week4.SportsProduct.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Purchase")
public class Purchase {
	
	@Id

	private Long id;
	private String productName;
	private double cost;
    private LocalDate dateOfPurchase;
    private LocalDate deliveryDate;
    private String feedback;
    
    
	public Purchase(Long id, String productName, double cost, LocalDate dateOfPurchase, LocalDate deliveryDate,
			String feedback) {
		super();
		this.id = id;
		this.productName = productName;
		this.cost = cost;
		this.dateOfPurchase = dateOfPurchase;
		this.deliveryDate = deliveryDate;
		this.feedback = feedback;
		
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}


	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}


	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}


	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}


	public String getFeedback() {
		return feedback;
	}


	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

	
	

}
