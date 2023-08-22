package com.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Authentication")
public class Authentication {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="auth_Id")
	private int auth_Id;
			
	@Column(name="uname")
	private String uname;

	@Column(name="pass")
	private String pass;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Cust_Id",referencedColumnName = "cust_Id")
	public Customer customer;

	public Authentication() {
		super();
	}

	public Authentication(int auth_Id, String uname, String pass) {
		super();
		this.auth_Id = auth_Id;
		this.uname = uname;
		this.pass = pass;
	}

	public int getauth_Id() {
		return auth_Id;
	}

	public void setauth_Id(int auth_Id) {
		this.auth_Id = auth_Id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}	
}