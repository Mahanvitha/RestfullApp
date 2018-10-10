package com.capgemini.onlineorderapp.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.onlineorderapp.entity.Order;

public interface OrderRepository extends MongoRepository<Order, Integer>{

}
