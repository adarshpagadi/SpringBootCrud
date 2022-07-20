package com.example.demo.service.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(long id) {
		return productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("employee","id",id) );
	}

	@Override
	public Product updateProduct(Product product, long id) {
		Product existingProduct = productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("employee","id",id));
		existingProduct.getname(product.getname());
		existingProduct.getemail(product.getemail());
		existingProduct.getaddress(product.getaddress());
		productRepository.save(existingProduct);
		return existingProduct;
	}

	@Override
	public void deleteProduct(long id) {
		productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("employee","id",id));
		productRepository.deleteById(id);
		
	}

	

}
