package com.mitmysore.mapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RealWorldController {
    @GetMapping("/college") public String college() { return "College details retrieved"; }
    @GetMapping("/college/students") public String collegeStudents() { return "College students retrieved"; }
    @GetMapping("/college/faculty") public String faculty() { return "College faculty retrieved"; }
    @PostMapping("/college/student") public String addCollegeStudent() { return "College student added successfully"; }
    @PutMapping("/college/student") public String updateCollegeStudent() { return "College student updated successfully"; }
    @DeleteMapping("/college/student") public String removeCollegeStudent() { return "College student deleted successfully"; }

    @GetMapping("/library/books") public String libraryBooks() { return "Library books retrieved"; }
    @GetMapping("/library/members") public String members() { return "Library members retrieved"; }
    @PostMapping("/library/book") public String addLibraryBook() { return "Library book added successfully"; }
    @PutMapping("/library/book") public String updateLibraryBook() { return "Library book updated successfully"; }
    @DeleteMapping("/library/book") public String removeLibraryBook() { return "Library book deleted successfully"; }

    @GetMapping("/products/available") public String apiAvailableProducts() { return "Available products retrieved"; }

    @GetMapping("/food") public String food() { return "Food items retrieved"; }
    @GetMapping("/food/veg") public String vegFood() { return "Vegetarian food retrieved"; }
    @GetMapping("/food/nonveg") public String nonVegFood() { return "Non-vegetarian food retrieved"; }
    @PostMapping("/food") public String addFood() { return "Food item added successfully"; }
    @PutMapping("/food") public String updateFood() { return "Food item updated successfully"; }
    @DeleteMapping("/food") public String deleteFood() { return "Food item deleted successfully"; }

    @GetMapping("/movies") public String movies() { return "Movies retrieved"; }
    @GetMapping("/movies/available") public String availableMovies() { return "Available movies retrieved"; }
    @GetMapping("/movies/upcoming") public String upcomingMovies() { return "Upcoming movies retrieved"; }
    @PostMapping("/movies") public String addMovie() { return "Movie added successfully"; }
    @PutMapping("/movies") public String updateMovie() { return "Movie updated successfully"; }
    @DeleteMapping("/movies") public String deleteMovie() { return "Movie deleted successfully"; }
}
