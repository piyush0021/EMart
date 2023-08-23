package com.example.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="Cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_Id")
	private int cart_Id;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "delivery_Charges")
	private double delivery_Charges;
	
	@Column(name = "discount")
	private double discount;
	
	@Column(name = "total")
	private double total;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cust_Id",referencedColumnName = "cust_Id")
	public Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "prod_Id",referencedColumnName = "prod_Id")
	private Product product;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "cust_Id",referencedColumnName = "cust_Id")
//	private List<Customer> customers;
//	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "prod_Id",referencedColumnName = "prod_Id")
//	private List<Product> products;
	
	

	public Cart() {
		super();
	}
	
	public Cart(int cart_Id, int quantity, double price, double delivery_Charges,
			double discount, double total) {
		super();
		this.cart_Id = cart_Id;
		this.quantity = quantity;
		this.price = price;
		this.delivery_Charges = delivery_Charges;
		this.discount = discount;
		this.total = total;
	}

	
	public int getCart_Id() {
		return cart_Id;
	}

	public void setCart_Id(int cart_Id) {
		this.cart_Id = cart_Id;
	}

	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public double getDelivery_Charges() {
		return delivery_Charges;
	}

	public void setDelivery_Charges(double delivery_Charges) {
		this.delivery_Charges = delivery_Charges;
	}

	
	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
		
}