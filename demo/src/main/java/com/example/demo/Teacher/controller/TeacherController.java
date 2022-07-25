package com.example.demo.Teacher.controller;

import com.example.demo.Teacher.repo.TeacherRepo;
import com.example.demo.Teacher.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherRepo teacherRepo;
    @GetMapping
    List<Teacher>getTeacher(){return teacherRepo.findAll();}
    @PostMapping
    Teacher createTeacher(@RequestBody Teacher teacher){return teacherRepo.save(teacher);}
}
