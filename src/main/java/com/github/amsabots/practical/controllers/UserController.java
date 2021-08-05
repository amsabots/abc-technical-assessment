package com.github.amsabots.practical.controllers;

import com.github.amsabots.practical.models.User;
import com.github.amsabots.practical.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    // mock data for template testing
    //plugin the real data APIS for either dev testing and prod integration
    private static List<User> users = new ArrayList<>();
    private final UserService userService;

    public UserController(UserService studentService) {
        this.userService = studentService;
    }


    @GetMapping
    public String getUsers(Model model) {
        model.addAttribute("users", userService.allUsers());
        return "users";

    }
}
