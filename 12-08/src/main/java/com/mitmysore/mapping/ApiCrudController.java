package com.mitmysore.mapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiCrudController {
    @GetMapping({"/students", "/student"}) public String getStudent() { return "Students retrieved successfully"; }
    @PostMapping({"/students", "/student"}) public String postStudent() { return "Student created successfully"; }
    @PutMapping({"/students", "/student"}) public String putStudent() { return "Student updated successfully"; }
    @DeleteMapping({"/students", "/student"}) public String deleteStudent() { return "Student deleted successfully"; }

    @GetMapping({"/products", "/product"}) public String getProduct() { return "Products retrieved successfully"; }
    @PostMapping({"/products", "/product"}) public String postProduct() { return "Product created successfully"; }
    @PutMapping({"/products", "/product"}) public String putProduct() { return "Product updated successfully"; }
    @DeleteMapping({"/products", "/product"}) public String deleteProduct() { return "Product deleted successfully"; }

    @GetMapping({"/employees", "/employee"}) public String getEmployee() { return "Employees retrieved successfully"; }
    @PostMapping({"/employees", "/employee"}) public String postEmployee() { return "Employee created successfully"; }
    @PutMapping({"/employees", "/employee"}) public String putEmployee() { return "Employee updated successfully"; }
    @DeleteMapping({"/employees", "/employee"}) public String deleteEmployee() { return "Employee deleted successfully"; }

    @GetMapping("/books") public String getBook() { return "Books retrieved successfully"; }
    @PostMapping("/books") public String postBook() { return "Book created successfully"; }
    @PutMapping("/books") public String putBook() { return "Book updated successfully"; }
    @DeleteMapping("/books") public String deleteBook() { return "Book deleted successfully"; }

    @GetMapping({"/courses", "/course"}) public String getCourse() { return "Courses retrieved successfully"; }
    @PostMapping({"/courses", "/course"}) public String postCourse() { return "Course created successfully"; }
    @PutMapping({"/courses", "/course"}) public String putCourse() { return "Course updated successfully"; }
    @DeleteMapping({"/courses", "/course"}) public String deleteCourse() { return "Course deleted successfully"; }
}
