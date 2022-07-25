package com.example.demo.Subject.controller;

import com.example.demo.Subject.repo.SubjectRepo;
import com.example.demo.Subject.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    SubjectRepo subjectRepo;
    @GetMapping
    List<Subject>getSubject(){return subjectRepo.findAll();}
    @PostMapping
    Subject createSubject(@RequestBody Subject subject){return subjectRepo.save(subject);   }
}
