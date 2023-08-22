package com.example.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Invoice_Details")
public class Invoice_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "invdtl_Id")
	private int invdtl_Id;

	@Column(name="mrp")
	private double mrp;
	
	@Column(name = "cardHolderPrice")
	private double cardHolderPrice;

	@Column(name = "pointsReedemed")
	private int pointsReedemed;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "inv_Id",referencedColumnName = "inv_Id")
	private Invoice invoice;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "prod_Id",referencedColumnName = "prod_Id")
	private Product product;

	public Invoice_Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Invoice_Details(double mrp, double cardHolderPrice, int pointsReedemed, Invoice invoice, Product product) {
		super();
		this.mrp = mrp;
		this.cardHolderPrice = cardHolderPrice;
		this.pointsReedemed = pointsReedemed;
		this.invoice = invoice;
		this.product = product;
	}

	public int getInvdtl_Id() {
		return invdtl_Id;
	}

	public void setInvdtl_Id(int invdtl_Id) {
		this.invdtl_Id = invdtl_Id;
	}

	public double getMrp() {
		return mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}

	public double getCardHolderPrice() {
		return cardHolderPrice;
	}

	public void setCardHolderPrice(double cardHolderPrice) {
		this.cardHolderPrice = cardHolderPrice;
	}

	public int getPointsReedemed() {
		return pointsReedemed;
	}

	public void setPointsReedemed(int pointsReedemed) {
		this.pointsReedemed = pointsReedemed;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
}

