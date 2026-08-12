package com.mitmysore.mapping;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @GetMapping("/students") public String all() { return "All students retrieved successfully"; }
    @GetMapping("/students/active") public String active() { return "Active students retrieved successfully"; }
    @GetMapping("/students/inactive") public String inactive() { return "Inactive students retrieved successfully"; }
    @GetMapping("/students/count") public String count() { return "Student count retrieved successfully"; }
    @PostMapping("/students") public String create() { return "Student added successfully"; }
    @PutMapping("/students") public String update() { return "Student updated successfully"; }
    @DeleteMapping("/students") public String delete() { return "Student deleted successfully"; }
}
