package com.Security.BasicSecurity.controller;

import com.Security.BasicSecurity.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")
    public List<Student> student() {
        return new ArrayList<Student>();
    }

    @PostMapping("/student")
    public Student student(@RequestBody Student student) {
        return student;
    }
}
