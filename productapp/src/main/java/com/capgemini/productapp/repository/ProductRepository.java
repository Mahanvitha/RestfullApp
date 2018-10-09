package com.capgemini.productapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.productapp.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer>{

}
