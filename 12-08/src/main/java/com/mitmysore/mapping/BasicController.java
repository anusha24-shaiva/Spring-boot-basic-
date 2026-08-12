package com.mitmysore.mapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @GetMapping("/hello") public String hello() { return "Hello World"; }
    @GetMapping("/student") public String student() { return "Welcome to Student Management System"; }
    @GetMapping("/college") public String college() { return "MIT Mysore"; }
    @GetMapping("/course") public String course() { return "Java Full Stack Development"; }
    @GetMapping("/home") public String home() { return "Welcome to the home page"; }
    @GetMapping("/about") public String about() { return "About our student management system"; }
    @GetMapping("/contact") public String contact() { return "Contact us at mitmysore@example.com"; }
    @GetMapping("/services") public String services() { return "Our services include training and placement support"; }
    @GetMapping("/api/company") public String company() { return "MIT Mysore"; }
    @GetMapping("/api/trainer") public String trainer() { return "Java Full Stack Trainer"; }
    @GetMapping("/api/department") public String department() { return "Computer Science and Business Systems"; }
    @GetMapping("/api/location") public String location() { return "Karnataka"; }
    @GetMapping("/api/status") public String status() { return "Server is running successfully"; }
}
