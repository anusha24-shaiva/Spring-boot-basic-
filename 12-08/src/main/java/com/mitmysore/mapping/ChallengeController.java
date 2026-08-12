package com.mitmysore.mapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChallengeController {
    @GetMapping("/bank/accounts") public String accounts() { return "Bank accounts retrieved"; }
    @PostMapping("/bank/account") public String addAccount() { return "Bank account created successfully"; }
    @PutMapping("/bank/account") public String updateAccount() { return "Bank account updated successfully"; }
    @DeleteMapping("/bank/account") public String deleteAccount() { return "Bank account deleted successfully"; }

    @GetMapping("/hospital/patients") public String patients() { return "Hospital patients retrieved"; }
    @GetMapping("/hospital/doctors") public String doctors() { return "Hospital doctors retrieved"; }
    @PostMapping("/hospital/patient") public String addPatient() { return "Patient added successfully"; }
    @PutMapping("/hospital/patient") public String updatePatient() { return "Patient updated successfully"; }
    @DeleteMapping("/hospital/patient") public String deletePatient() { return "Patient deleted successfully"; }

    @GetMapping("/placement/students") public String placementStudents() { return "Placement students retrieved"; }
    @GetMapping("/placement/companies") public String placementCompanies() { return "Placement companies retrieved"; }
    @GetMapping("/placement/drives") public String placementDrives() { return "Placement drives retrieved"; }
    @PostMapping("/placement/student") public String addPlacementStudent() { return "Placement student added successfully"; }
    @PutMapping("/placement/student") public String updatePlacementStudent() { return "Placement student updated successfully"; }
    @DeleteMapping("/placement/student") public String deletePlacementStudent() { return "Placement student deleted successfully"; }

    @GetMapping("/lms/courses") public String lmsCourses() { return "LMS courses retrieved"; }
    @GetMapping("/lms/students") public String lmsStudents() { return "LMS students retrieved"; }
    @GetMapping("/lms/trainers") public String lmsTrainers() { return "LMS trainers retrieved"; }
    @PostMapping("/lms/course") public String addLmsCourse() { return "LMS course added successfully"; }
    @PutMapping("/lms/course") public String updateLmsCourse() { return "LMS course updated successfully"; }
    @DeleteMapping("/lms/course") public String deleteLmsCourse() { return "LMS course deleted successfully"; }

    @GetMapping("/expenses") public String expenses() { return "Expenses retrieved"; }
    @GetMapping("/expenses/monthly") public String monthlyExpenses() { return "Monthly expenses retrieved"; }
    @GetMapping("/expenses/yearly") public String yearlyExpenses() { return "Yearly expenses retrieved"; }
    @PostMapping("/expenses") public String addExpense() { return "Expense added successfully"; }
    @PutMapping("/expenses") public String updateExpense() { return "Expense updated successfully"; }
    @DeleteMapping("/expenses") public String deleteExpense() { return "Expense deleted successfully"; }
}
