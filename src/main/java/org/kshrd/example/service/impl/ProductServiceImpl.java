package org.kshrd.example.service.impl;

import java.util.ArrayList;

import org.kshrd.example.model.Category;
import org.kshrd.example.model.Product;
import org.kshrd.example.repository.ProductRepository;
import org.kshrd.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public ArrayList<Product> getAllProducts() {
		return  productRepository.getAllProducts();
	}

	@Override
	public ArrayList<Category> getAllCategoriesWithProducts() {
		return productRepository.getAllCategoriesWithProducts();
	}
}
