package com.capgemini.onlineorderapp.entity;

import java.util.HashMap;
import java.util.Objects;

public class Product {

	private int productId;
	private String productName;
	private float productCost;
	private String productCategory;
	private HashMap<String, Objects> specifications;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, float productCost, String productCategory,
			HashMap<String, Objects> specifications) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.productCategory = productCategory;
		this.specifications = specifications;
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
	public HashMap<String, Objects> getSpecifications() {
		return specifications;
	}
	public void setSpecifications(HashMap<String, Objects> specifications) {
		this.specifications = specifications;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", productCategory=" + productCategory + ", specifications=" + specifications + "]";
	}
}