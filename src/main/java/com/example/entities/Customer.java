package com.example.entities;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_Id")
	private int cust_Id;
	
	@Column(name = "custName")
	private String custName;
	
	@Column(name = "phoneNo")
	private long phoneNo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "gender")
	private char gender;
	
	@Column(name = "redeemPoints")
	private int redeemPoints;
	
	@Column(name = "addLine1")
	private String addLine1;
	
	@Column(name = "addLine2")
	private String addLine2;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "pincode")
	private long pincode;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cust_Id" , referencedColumnName = "cust_Id")
	private Set<Invoice> invoices;
	
	@OneToOne
	private Authentication authentication;	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int cust_Id, String cust_Name, long phone_No, String email, char gender, int redeem_points,
			String addLine1, String addLine2, String city, long pincode) {
		super();
		this.cust_Id = cust_Id;
		this.custName = cust_Name;
		this.phoneNo = phone_No;
		this.email = email;
		this.gender = gender;
		this.redeemPoints = redeem_points;
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.city = city;
		this.pincode = pincode;
	}
	
	
	public int getCust_Id() {
		return cust_Id;
	}
	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}
	
	public String getCust_Name() {
		return custName;
	}
	public void setCust_Name(String cust_Name) {
		this.custName = cust_Name;
	}
	
	public long getPhone_No() {
		return phoneNo;
	}
	public void setPhone_No(long phone_No) {
		this.phoneNo = phone_No;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getRedeem_points() {
		return redeemPoints;
	}
	public void setRedeem_points(int reedeem_points) {
		this.redeemPoints = reedeem_points;
	}
	
	public String getaddLine1() {
		return addLine1;
	}
	public void setaddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}
	
	public String getaddLine2() {
		return addLine2;
	}
	public void setaddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public Set<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(Set<Invoice> invoices) {
		this.invoices = invoices;
	}
	
	
	
}