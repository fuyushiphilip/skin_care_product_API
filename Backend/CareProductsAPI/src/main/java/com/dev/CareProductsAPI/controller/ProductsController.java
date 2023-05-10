package com.dev.CareProductsAPI.controller;

import com.dev.CareProductsAPI.model.Products;
import com.dev.CareProductsAPI.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/care_products")
public class ProductsController {
    @Autowired
    private ProductsService productsService;
    @GetMapping("/test")
    public String test(){
        return "Test...";
    }

    @GetMapping
    public ResponseEntity<List<Products>> getAllProducts(){
        return new ResponseEntity<List<Products>>(productsService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Optional<Products>> getProductByProductId(@PathVariable String productId){
        return new ResponseEntity<Optional<Products>>(productsService.getProductsByProductId(productId), HttpStatus.OK);
}}
