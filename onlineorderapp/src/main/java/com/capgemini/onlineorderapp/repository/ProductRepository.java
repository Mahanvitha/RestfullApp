package com.capgemini.onlineorderapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.onlineorderapp.entity.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
