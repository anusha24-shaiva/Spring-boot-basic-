package com.mitmysore.mapping;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @GetMapping("/employees") public String all() { return "All employees retrieved successfully"; }
    @GetMapping("/employees/developers") public String developers() { return "Developers retrieved successfully"; }
    @GetMapping("/employees/trainers") public String trainers() { return "Trainers retrieved successfully"; }
    @GetMapping("/employees/managers") public String managers() { return "Managers retrieved successfully"; }
    @PostMapping("/employees") public String create() { return "Employee created successfully"; }
    @PutMapping("/employees") public String update() { return "Employee updated successfully"; }
    @DeleteMapping("/employees") public String delete() { return "Employee deleted successfully"; }
}
