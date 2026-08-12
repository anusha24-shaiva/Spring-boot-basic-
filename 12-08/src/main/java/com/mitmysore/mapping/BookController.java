package com.mitmysore.mapping;

import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @GetMapping("/books") public String all() { return "All books retrieved successfully"; }
    @GetMapping("/books/java") public String java() { return "Java books retrieved successfully"; }
    @GetMapping("/books/python") public String python() { return "Python books retrieved successfully"; }
    @GetMapping("/books/database") public String database() { return "Database books retrieved successfully"; }
    @PostMapping("/books") public String create() { return "Book added successfully"; }
    @PutMapping("/books") public String update() { return "Book updated successfully"; }
    @DeleteMapping("/books") public String delete() { return "Book deleted successfully"; }
}
