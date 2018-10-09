package com.capgemini.productapp.service;

import java.util.List;

import com.capgemini.productapp.entity.Product;
import com.capgemini.productapp.service.exceptions.ProductNotFoundException;

public interface ProductService {
	public Product addProduct(Product product);
	public Product findProductById(int productId) throws ProductNotFoundException;
	public Product updateProduct(Product product);
	public void deleteProduct(Product product);
	
}
