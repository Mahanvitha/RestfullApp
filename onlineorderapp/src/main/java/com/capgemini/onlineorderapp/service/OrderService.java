package com.capgemini.onlineorderapp.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.capgemini.onlineorderapp.entity.Order;

public interface OrderService {
	public Order addOrder(Order order);
	public Order updateOrder(Order order);
	public Order deleteOrder(int orderId);
	public Order findById(int orderId);
	public List<Order> findByCustomerId(int orderId);
	public List<Order> findByDate(LocalDate date);

	
}
