package com.nie.csd.ecom_app.repositories;

import com.nie.csd.ecom_app.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
