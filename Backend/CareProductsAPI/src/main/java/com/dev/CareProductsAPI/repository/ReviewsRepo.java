package com.dev.CareProductsAPI.repository;

import com.dev.CareProductsAPI.model.Reviews;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepo extends MongoRepository<Reviews, ObjectId> {
}
