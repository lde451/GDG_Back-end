package com.example.shop.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public Long createProduct(String name, int price, int stock, String description) {
        return null;
    }

    public List<Product> getAllProducts() {
        return null;
    }

    public Product getProductById(Long id) {
        return null;
    }

    public void updateProduct(Long id, String name, Integer price, Integer stock, String description) {
    }

    public void deleteProduct(Long id) {
    }
}