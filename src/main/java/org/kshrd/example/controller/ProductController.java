package org.kshrd.example.controller;

import java.util.ArrayList;

import org.kshrd.example.model.Category;
import org.kshrd.example.model.Product;
import org.kshrd.example.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
	
	@Autowired 
	ProductServiceImpl pro;
	
	@RequestMapping("/product")
	public String getAllProducts(Model model){
		ArrayList<Product> products = pro.getAllProducts();
		model.addAttribute("products", products);
		return "product";
	}

	@RequestMapping("/category")
	@ResponseBody
	public ArrayList<Category> getAllCategories(){
		return pro.getAllCategoriesWithProducts();
	}
//	@RequestMapping("/product/{id}")
//	public String getProductByID(@PathVariable int id, Model model){
//		Product p = pro.getProductById(id);
//		model.addAttribute("product", p);
//		return "product";
//	}

}
