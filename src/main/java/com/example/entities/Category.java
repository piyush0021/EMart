package com.example.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "CategoryMaster")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="catmaster_Id")
	private int catmaster_Id;
	
	@Column(name="cat_Id")
	private String cat_Id;
	
	@Column(name="subcat_Id")
	private String subcat_Id;
	
	@Column(name="categoryName")
	private String categoryName;
	
	@Column(name="flag")
	private boolean flag;
	
	@Column(name= "catImgPath",nullable = false)
	private String catImgPath;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "catmaster_Id",referencedColumnName = "catmaster_ID")
	private Set<Product> products;

	public Category() {
		super();
	}

	public Category(String cat_Id, String subcat_Id, String categoryName, boolean flag, String catImgPath) {
		super();
		this.cat_Id = cat_Id;
		this.subcat_Id = subcat_Id;
		this.categoryName = categoryName;
		this.flag = flag;
		this.catImgPath = catImgPath;
	}

	public int getcatmaster_Id() {
		return catmaster_Id;
	}

	public void setcatmaster_Id(int catmaster_Id) {
		this.catmaster_Id = catmaster_Id;
	}

	public String getcat_Id() {
		return cat_Id;
	}

	public void setcat_Id(String cat_Id) {
		this.cat_Id = cat_Id;
	}

	public String getSubcat_Id() {
		return subcat_Id;
	}

	public void setSubcat_Id(String subcat_Id) {
		this.subcat_Id = subcat_Id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getCatImgPath() {
		return catImgPath;
	}

	public void setCatImgPath(String catImgPath) {
		this.catImgPath = catImgPath;
	}

	@Override
	public String toString() {
		return "Category [catmaster_Id=" + catmaster_Id + ", cat_Id=" + cat_Id + ", subcat_Id=" + subcat_Id
				+ ", categoryName=" + categoryName + ", flag=" + flag + ", catImgPath=" + catImgPath + "]";
	}
	
	
	
}
