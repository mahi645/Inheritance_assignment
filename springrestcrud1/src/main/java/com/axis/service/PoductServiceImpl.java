package com.axis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.exception.IDNotFoundException;
import com.axis.exception.InValidPriceException;
import com.axis.model.Product;
import com.axis.repository.ProductRepository;
import com.axis.utils.AppConstants;

@Service
public class PoductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	
	/*
	 * @Description : this method is used to add a product
	 * @Param : It takes product as a paramter
	 * @Returns : It returns product
	 * @Author : safan
	 * @Created data: 9 dec 2022
	 * @created by : safan
	 *
	 */
	
	@Override
	public Product addProduct(Product product) {
		if(product.getPrice()<=0)
			throw new InValidPriceException(AppConstants.INVALID_PRICE_MESSAGE);
		
		return productRepository.save(product);
	}

	
	
	
	
	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	
	
	
	
	@Override
	public Product getProductById(int id) {
		return productRepository.findById(id).orElseThrow(()-> new IDNotFoundException(AppConstants.PRODUCT_ID_NOT_FOUND_MESSAGE));
	}

	
	
	
	@Override
	public Product updateProduct(int id, Product product) {
	
		Product prod=	productRepository.findById(id).orElseThrow(()->new IDNotFoundException(AppConstants.PRODUCT_ID_NOT_FOUND_MESSAGE));
	   prod.setName(product.getName());
	  prod.setCategory(product.getCategory());
	  prod.setPrice(product.getPrice());
	
		return productRepository.save(prod);
	}

	
	
	
	
	@Override
	public String deleteProduct(int id) {
		Product prod=	productRepository.findById(id).orElseThrow(()->new IDNotFoundException(AppConstants.PRODUCT_ID_NOT_FOUND_MESSAGE));
		productRepository.delete(prod);

		return AppConstants.PRODUCT_DELETE_MESSAGE;
	}
	
	
	
	
	
	
	

}
