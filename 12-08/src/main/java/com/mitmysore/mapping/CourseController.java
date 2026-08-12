package com.mitmysore.mapping;

import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {
    @GetMapping("/courses") public String all() { return "All courses retrieved successfully"; }
    @GetMapping("/courses/java") public String java() { return "Java courses retrieved successfully"; }
    @GetMapping("/courses/python") public String python() { return "Python courses retrieved successfully"; }
    @GetMapping("/courses/mern") public String mern() { return "MERN courses retrieved successfully"; }
    @PostMapping("/courses") public String create() { return "Course created successfully"; }
    @PutMapping("/courses") public String update() { return "Course updated successfully"; }
    @DeleteMapping("/courses") public String delete() { return "Course deleted successfully"; }
}
