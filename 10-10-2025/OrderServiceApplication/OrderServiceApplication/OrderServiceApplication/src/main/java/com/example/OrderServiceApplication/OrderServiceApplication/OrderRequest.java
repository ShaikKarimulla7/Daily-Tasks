package com.example.OrderServiceApplication.OrderServiceApplication;

public class OrderRequest {
    private String productId;
    public OrderRequest() {}
    public OrderRequest(String productId) { this.productId = productId; }
    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }
}