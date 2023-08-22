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
@Table(name = "Product_Details")
public class Product_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prodDtl_Id") 
	private int prodDtl_Id;
	
	@Column(name = "configDtls")
	private int configDtls;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "config_Id",referencedColumnName = "config_Id")
	private Config config;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "prod_Id",referencedColumnName = "prod_Id")
	private Product product;
	
	public Product_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product_Details(int configDtls, Config config, Product product) {
		super();
		this.configDtls = configDtls;
		this.config = config;
		this.product = product;
	}

	
	public int getProdDtl_Id() {
		return prodDtl_Id;
	}

	public void setProdDtl_Id(int prodDtl_Id) {
		this.prodDtl_Id = prodDtl_Id;
	}

	public int getConfigDtls() {
		return configDtls;
	}

	public void setConfigDtls(int configDtls) {
		this.configDtls = configDtls;
	}

	public Config getConfig() {
		return config;
	}
	public void setConfig(Config config) {
		this.config = config;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	


}