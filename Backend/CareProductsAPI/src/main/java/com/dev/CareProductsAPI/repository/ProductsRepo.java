package com.dev.CareProductsAPI.repository;

import com.dev.CareProductsAPI.model.Products;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductsRepo extends MongoRepository<Products, ObjectId> {
    Optional<Products> getProductByProductId(String productId);
}
