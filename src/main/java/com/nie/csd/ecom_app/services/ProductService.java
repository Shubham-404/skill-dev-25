package com.nie.csd.ecom_app.services;

import com.nie.csd.ecom_app.models.Products;
import com.nie.csd.ecom_app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }
}
