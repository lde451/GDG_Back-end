package com.example.shop.order;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    public Long createOrder(Long memberId, Long productId, int quantity) {
        return null;
    }

    public List<Order> getAllOrders() {
        return null;
    }

    public Order getOrderById(Long id) {
        return null;
    }

    public void cancelOrder(Long id) {
    }
}