package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RequestMapping("/product")
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@PostMapping
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		return new ResponseEntity<Product>(productService.saveProduct(product),HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") long id) {
		return new ResponseEntity<Product>(productService.getProductById(id),HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable("id") Product product, long id) {
		return new ResponseEntity<Product>(productService.updateProduct(product, id),HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteProduct(@PathVariable("id") long id) {
		productService.deleteProduct(id);
		return new ResponseEntity<String>("employee deleted",HttpStatus.OK);
		
	}
	

}
