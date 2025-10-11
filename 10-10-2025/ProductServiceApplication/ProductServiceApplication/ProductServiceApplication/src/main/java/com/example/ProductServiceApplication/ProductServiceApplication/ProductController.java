package com.example.ProductServiceApplication.ProductServiceApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable String id) {
        // In real life, fetch from DB; here return dummy
        return new Product(id, "Product-" + id, 100.0 + id.length());
    }
}