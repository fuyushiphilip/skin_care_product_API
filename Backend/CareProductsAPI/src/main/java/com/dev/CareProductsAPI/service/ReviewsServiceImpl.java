package com.dev.CareProductsAPI.service;

import com.dev.CareProductsAPI.model.Products;
import com.dev.CareProductsAPI.model.Reviews;
import com.dev.CareProductsAPI.repository.ReviewsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReviewsServiceImpl {

    @Autowired
    private ReviewsRepo reviewsRepo;
    @Autowired
    private MongoTemplate mongoTemplate;

    public Reviews createReview(String reviewBody, String productId) {
        Reviews review = reviewsRepo.insert(new Reviews(reviewBody, LocalDateTime.now(), LocalDateTime.now()));

        mongoTemplate.update(Products.class)
                .matching(Criteria.where("productId").is(productId))
                .apply(new Update().push("reviews").value(review))
                .first();

        return review;
    }
}
