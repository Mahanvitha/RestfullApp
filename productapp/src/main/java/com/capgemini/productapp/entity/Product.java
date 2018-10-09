package com.capgemini.productapp.entity;

public class Product {
	private int productId;
	private String productName;
	private float productCost;
	private String productCategory;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, float productCost, String productCategory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.productCategory = productCategory;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductCost() {
		return productCost;
	}
	public void setProductCost(float productCost) {
		this.productCost = productCost;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

}
