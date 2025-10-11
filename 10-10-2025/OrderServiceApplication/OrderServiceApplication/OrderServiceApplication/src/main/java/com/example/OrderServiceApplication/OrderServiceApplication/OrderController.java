package com.example.OrderServiceApplication.OrderServiceApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    private final RestTemplate restTemplate;
    private final String productServiceUrl;

    public OrderController(RestTemplate restTemplate,
                           @Value("${product.service.url}") String productServiceUrl) {
        this.restTemplate = restTemplate;
        this.productServiceUrl = productServiceUrl;
    }

    @PostMapping("/orders")
    public OrderResponse createOrder(@RequestBody OrderRequest request) {
        // 1. call product service
        String prodUrl = productServiceUrl + "/products/" + request.getProductId();
        Product product = restTemplate.getForObject(prodUrl, Product.class);

        // 2. now “confirm” order and respond
        OrderResponse resp = new OrderResponse();
        resp.setOrderId("order-" + System.currentTimeMillis());
        resp.setProduct(product);
        resp.setStatus("CONFIRMED");
        return resp;
    }
}