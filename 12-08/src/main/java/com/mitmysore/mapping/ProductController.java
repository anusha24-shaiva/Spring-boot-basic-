package com.mitmysore.mapping;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @GetMapping("/products") public String all() { return "All products retrieved successfully"; }
    @GetMapping("/products/available") public String available() { return "Available products retrieved successfully"; }
    @GetMapping("/products/out-of-stock") public String outOfStock() { return "Out-of-stock products retrieved successfully"; }
    @GetMapping("/products/count") public String count() { return "Product count retrieved successfully"; }
    @PostMapping("/products") public String create() { return "Product added successfully"; }
    @PutMapping("/products") public String update() { return "Product updated successfully"; }
    @DeleteMapping("/products") public String delete() { return "Product deleted successfully"; }
}
