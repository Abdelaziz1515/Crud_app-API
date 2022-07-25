package com.example.demo.Student.controller;

import com.example.demo.Student.repo.StudentRepo;
import com.example.demo.Student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/all")
    List<Student> getStudents(){return studentRepo.findAll();}

    @PostMapping
    Student createStudent(@RequestBody Student student){
        return studentRepo.save(student);

    }

    @GetMapping( path = "{name}")
    Student getStudent(@PathVariable  String name){
        return studentRepo.findByName(name);
    }

}
