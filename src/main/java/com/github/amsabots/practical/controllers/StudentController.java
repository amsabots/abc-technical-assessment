package com.github.amsabots.practical.controllers;

import com.github.amsabots.practical.models.User;
import com.github.amsabots.practical.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    // mock data for template testing
    //plugin the real data APIS for either dev testing and prod integration
    private static List<User> students = new ArrayList<>();
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }



   @GetMapping
   public String getStudents(Model model){
     model.addAttribute("students", studentService.allStudents());
     return "students";
   }
}
