package com.axis.service;

import java.util.List;

import com.axis.dto.ProductDto;

public interface ProductService {

	public ProductDto addProduct(ProductDto product);
	public List<ProductDto> getAllProducts();
	public ProductDto getProductById(Long id);
	
}
