package com.capgemini.orderapp.entity;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

public class order {
	private int orderId;
	private double total;
	@DateTimeFormat(pattern= "YYYY-MM-DD")
	private LocalDate date;
	private int customerId;
	public order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public order(int orderId, double total, LocalDate date, int customerId) {
		super();
		this.orderId = orderId;
		this.total = total;
		this.date = date;
		this.customerId = customerId;
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
		return "order [orderId=" + orderId + ", total=" + total + ", date=" + date + ", customerId=" + customerId + "]";
	}
	
}
