package com.example.OrderServiceApplication.OrderServiceApplication;

public class OrderResponse {
    private String orderId;
    private Product product;
    private String status;

    public OrderResponse() {}
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}