package com.capgemini.onlineorderapp.service.impl;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.onlineorderapp.entity.Order;
import com.capgemini.onlineorderapp.repository.OrderRepository;
import com.capgemini.onlineorderapp.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public Order addOrder(Order order) {
	return orderRepository.save(order);
	}

	@Override
	public Order updateOrder(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public Order deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findById(int orderId)  {
		return orderRepository.findById(orderId).get();
	}

	@Override
	public List<Order> findByCustomerId(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> findByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
