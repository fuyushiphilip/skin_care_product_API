package com.dev.CareProductsAPI.controller;

import com.dev.CareProductsAPI.model.Reviews;
//import com.dev.CareProductsAPI.service.ReviewsService;
import com.dev.CareProductsAPI.service.ReviewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewsController {

    @Autowired
    private ReviewsServiceImpl reviewsService;

    @GetMapping("/test")
    public String test(){
        return "Test...";
    }

    @PostMapping
    public ResponseEntity<Reviews> createReview(@RequestBody Map<String, String> payload) {

        return new ResponseEntity<Reviews>(reviewsService.createReview(payload.get("reviewBody"), payload.get("productId")), HttpStatus.OK);
    }
}
