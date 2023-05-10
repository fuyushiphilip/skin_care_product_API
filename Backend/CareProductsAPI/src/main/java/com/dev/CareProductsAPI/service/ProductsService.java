package com.dev.CareProductsAPI.service;

import com.dev.CareProductsAPI.model.Products;
import com.dev.CareProductsAPI.repository.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
public interface ProductsService {
    List<Products> getAllProducts();

    Optional<Products> getProductsByProductId(String productsId);
}
