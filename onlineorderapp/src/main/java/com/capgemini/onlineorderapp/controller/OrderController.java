package com.capgemini.onlineorderapp.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlineorderapp.entity.Item;
import com.capgemini.onlineorderapp.entity.Order;
import com.capgemini.onlineorderapp.service.OrderService;
@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	private  HashMap<Integer, Set<Item>> hashMap;
	



	public OrderController() {
		super();
		this.hashMap = hashMap;
	}




//		@PostMapping("/addToCart/{customerId}")
//	public ResponseEntity<Set<Item>> addToCart(@RequestParam int customerId, @RequestBody Item item){
//		Set<Item> listOfItems = hashMap.get(customerId);
//		
//		if(listOfItems==null) {
//			listOfItems = new HashSet();
//			listOfItems.add(item);
//			hashMap.put(customerId, listOfItems);
//		}
//		else {
//		if(listOfItems.contains(item)) {
//			
//			item.increaseProductQuantity();
//		}
//		else {
//			listOfItems.add(item);
//			hashMap.put(customerId, listOfItems);
//		}
//		}
//		return  new ResponseEntity<Set<Item>>(HttpStatus.OK);
//			
//	}
//	@PostMapping("/order/addOrder")
//	 public ResponseEntity<Order> addOrder(@RequestBody Order order){
//		return new ResponseEntity<Order>(orderService.addOrder(order),(HttpStatus.OK));		
//	}
	@PutMapping("/order")
	public ResponseEntity<Order> updateOrder(@RequestBody Order order){
		return new ResponseEntity<Order>(orderService.updateOrder(order),(HttpStatus.OK));
	}
	@DeleteMapping("/order")
	public ResponseEntity<Order> deleteOrder(@RequestBody Order order) {
		return new ResponseEntity<Order>(orderService.deleteOrder(order.getOrderId()), HttpStatus.OK);
	}
	}
