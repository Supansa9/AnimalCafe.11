package com.supansa.animalcafe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")

public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	
	@Column(name="productname")
	public String productname;
	
	@Column(name="productdescription")
	public String productdescription;
	
	@Column(name="productprice")
	public double productprice;
	
	@Column(name="productimage")
	public String productimage;

	public Product() {}

	public Product(int id, String productname, String productdescription, double productprice, String productimage) {
		super();
		this.id = id;
		this.productname = productname;
		this.productdescription = productdescription;
		this.productprice = productprice;
		this.productimage = productimage;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductdescription() {
		return productdescription;
	}

	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

	public double getProductprice() {
		return productprice;
	}

	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}

	public String getProductimage() {
		return productimage;
	}

	public void setProductimage(String productimage) {
		this.productimage = productimage;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productname=" + productname + ", productdescription=" + productdescription
				+ ", productprice=" + productprice + ", productimage=" + productimage + "]";
	}

}