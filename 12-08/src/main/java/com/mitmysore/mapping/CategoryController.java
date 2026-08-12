package com.mitmysore.mapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    @GetMapping("/api/student/all") public String allStudents() { return "All students"; }
    @GetMapping("/api/student/active") public String activeStudentList() { return "Active students"; }
    @GetMapping("/api/student/inactive") public String inactiveStudentList() { return "Inactive students"; }
    @GetMapping("/api/product/all") public String allProducts() { return "All products"; }
    @GetMapping("/api/product/electronics") public String electronics() { return "Electronics products"; }
    @GetMapping("/api/product/clothing") public String clothing() { return "Clothing products"; }
    @GetMapping("/api/employee/all") public String allEmployees() { return "All employees"; }
    @GetMapping("/api/employee/developers") public String employeeDevelopers() { return "Developer employees"; }
    @GetMapping("/api/employee/testers") public String testers() { return "Tester employees"; }
    @GetMapping("/api/course/all") public String allCourses() { return "All courses"; }
    @GetMapping("/api/course/java") public String apiJavaCourses() { return "Java courses"; }
    @GetMapping("/api/course/python") public String apiPythonCourses() { return "Python courses"; }
    @GetMapping("/api/course/react") public String reactCourses() { return "React courses"; }
    @GetMapping("/api/orders") public String orders() { return "All orders"; }
    @GetMapping("/api/orders/pending") public String pendingOrders() { return "Pending orders"; }
    @GetMapping("/api/orders/completed") public String completedOrders() { return "Completed orders"; }
    @GetMapping("/api/orders/cancelled") public String cancelledOrders() { return "Cancelled orders"; }
}
