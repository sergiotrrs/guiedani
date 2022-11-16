package org.generation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.generation.entity.*;
import org.generation.repository.*;

@Service
public class ProductsService {
	@Autowired
	IProductsRepository iProductsRepository;
	
	
	public Iterable<Products> getAllProducts(){
		return iProductsRepository.findAll();
	}
	
	public Products saveProducts(Products products) {
		return iProductsRepository.save(products);
	}
	
	


	
	
}