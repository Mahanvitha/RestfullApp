package com.capgemini.onlineorderapp.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
@Document(collection="Order")
public class Order {
	private int orderId;
	private double total;
	@DateTimeFormat(pattern= "YYYY-MM-DD")
	private LocalDate date;
	private int customerId;
	private List<Item> item;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order(int orderId, double total, LocalDate date, int customerId, List<Item> item) {
		super();
		this.orderId = orderId;
		this.total = total;
		this.date = date;
		this.customerId = customerId;
		this.item = item;
	}

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", total=" + total + ", date=" + date + ", customerId=" + customerId + "]";
	}
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
}