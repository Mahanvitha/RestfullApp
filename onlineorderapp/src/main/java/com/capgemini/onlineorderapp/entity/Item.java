package com.capgemini.onlineorderapp.entity;

public class Item {
	private int productQuantity;
	private int productId;
	private int itemTotalAmount;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int productQuantity, int productId, int itemTotalAmount) {
		super();
		this.productQuantity = productQuantity;
		this.productId = productId;
		this.itemTotalAmount = itemTotalAmount;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getItemTotalAmount() {
		return itemTotalAmount;
	}
	public void setItemTotalAmount(int itemTotalAmount) {
		this.itemTotalAmount = itemTotalAmount;
	}
	@Override
	public String toString() {
		return "Item [productQuantity=" + productQuantity + ", productId=" + productId + ", itemTotalAmount="
				+ itemTotalAmount + "]";
	}

	
}