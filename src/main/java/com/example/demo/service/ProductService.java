package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
	
	Product saveProduct(Product product);
	
	List<Product> getAllProduct();
	
	Product getProductById(long id);
	
	Product updateProduct(Product product,long id);
	
	void deleteProduct(long id);
	

}
