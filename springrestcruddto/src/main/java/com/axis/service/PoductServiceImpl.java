package com.axis.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.dto.ProductDto;
import com.axis.exception.IDNotFoundException;
import com.axis.exception.InValidPriceException;
import com.axis.model.Product;
import com.axis.repository.ProductRepository;
import com.axis.utils.AppConstants;

@Service
public class PoductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public ProductDto addProduct(ProductDto productDto) {
 
		  
		 
		
	return null;
	}

	
	


	@Override
	public List<ProductDto> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ProductDto getProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
