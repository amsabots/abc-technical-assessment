package com.github.amsabots.practical.services;

import com.github.amsabots.practical.data.StudentRepository;
import com.github.amsabots.practical.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<User> allStudents(){
        return studentRepository.findAll();
    }
}
