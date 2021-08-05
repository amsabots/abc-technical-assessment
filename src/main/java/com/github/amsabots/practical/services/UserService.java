package com.github.amsabots.practical.services;

import com.github.amsabots.practical.data.UserRepository;
import com.github.amsabots.practical.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository studentRepository;

    public UserService(UserRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<User> allUsers(){
        return studentRepository.findAll();
    }
}
