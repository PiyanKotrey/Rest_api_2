package com.example.test_api_student.controller;

import com.example.test_api_student.model.Student;
import com.example.test_api_student.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentRestController {
    private final StudentService studentService;

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    List<Student> selectAll(){
        return studentService.findAll();
    }
}
