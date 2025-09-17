package com.nie.csd.ecom_app.controllers;

import com.nie.csd.ecom_app.models.Products;
import com.nie.csd.ecom_app.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;

	@GetMapping("/")
	public String home() {
		return "Welcome to the E-Commerce API";
	}

	@GetMapping("/products")
	public List<Products> getAllProducts() {
		return productService.getAllProducts();
	}
}
