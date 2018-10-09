package com.capgemini.productapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.productapp.entity.Product;
import com.capgemini.productapp.repository.ProductRepository;
import com.capgemini.productapp.service.ProductService;
import com.capgemini.productapp.service.exceptions.ProductNotFoundException;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);

	}

	@Override
	public Product findProductById(int productId) throws ProductNotFoundException {
		return productRepository.findById(productId).get();
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Product product) {
		productRepository.delete(product);
		
	}

	
}
