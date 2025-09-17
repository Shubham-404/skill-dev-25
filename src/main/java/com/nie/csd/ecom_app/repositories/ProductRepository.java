package com.nie.csd.ecom_app.repositories;

import com.nie.csd.ecom_app.models.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Products, String> {
}
