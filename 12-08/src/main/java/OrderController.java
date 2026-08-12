package com.mitmysore.mapping;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/api/order")
    public String getOrder() {
        return "Order retrieved successfully";
    }

    @PostMapping("/api/order")
    public String createOrder() {
        return "Order created successfully";
    }

    @PutMapping("/api/order")
    public String updateOrder() {
        return "Order updated successfully";
    }

    @DeleteMapping("/api/order")
    public String deleteOrder() {
        return "Order deleted successfully";
    }
}