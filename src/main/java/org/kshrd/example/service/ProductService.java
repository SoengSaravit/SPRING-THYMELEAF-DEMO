package org.kshrd.example.service;

import java.util.ArrayList;

import org.kshrd.example.model.Category;
import org.kshrd.example.model.Product;

public interface ProductService {
	public ArrayList<Product> getAllProducts();
	public ArrayList<Category> getAllCategoriesWithProducts();
}
