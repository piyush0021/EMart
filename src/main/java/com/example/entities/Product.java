package com.example.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ProductMaster")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="prod_id")
	private int prod_id;
	
	@Column (name="prodName")
	private String prodName;

	@Column (name="prodDescription")
	private String prodDescription;
	
	@Column (name="mrpPrice")
	private double mrpPrice;
	
	@Column (name="cardholdersPrice")
	private double cardholdersPrice;
	
	@Column (name="pointsToBeRedm")
	private int pointsToBeRedm;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String prodName, String prodDescription, double mrpPrice, double cardholdersPrice,
			int pointsToBeRedm) {
		super();
		this.prodName = prodName;
		this.prodDescription = prodDescription;
		this.mrpPrice = mrpPrice;
		this.cardholdersPrice = cardholdersPrice;
		this.pointsToBeRedm = pointsToBeRedm;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDescription() {
		return prodDescription;
	}

	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}

	public double getMrpPrice() {
		return mrpPrice;
	}

	public void setMrpPrice(double mrpPrice) {
		this.mrpPrice = mrpPrice;
	}

	public double getCardholdersPrice() {
		return cardholdersPrice;
	}

	public void setCardholdersPrice(double cardholdersPrice) {
		this.cardholdersPrice = cardholdersPrice;
	}

	public int getPointsToBeRedm() {
		return pointsToBeRedm;
	}

	public void setPointsToBeRedm(int pointsToBeRedm) {
		this.pointsToBeRedm = pointsToBeRedm;
	}

	
	
	
}
;