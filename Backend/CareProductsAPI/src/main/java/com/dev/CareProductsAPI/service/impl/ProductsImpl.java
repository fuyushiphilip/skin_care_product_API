package com.dev.CareProductsAPI.service.impl;

import com.dev.CareProductsAPI.model.Products;
import com.dev.CareProductsAPI.repository.ProductsRepo;
import com.dev.CareProductsAPI.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductsImpl implements ProductsService {

    @Autowired
    private ProductsRepo productsRepo;
    @Override
    public List<Products> getAllProducts() {
        return productsRepo.findAll();
    }

    @Override
    public Optional<Products> getProductsByProductId(String productsId) {
        return productsRepo.getProductByProductId(productsId);
    }
}
