package com.example.demo.Subject.entity;

import com.example.demo.Student.entity.Student;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToMany
    @JoinTable(
            name = "studentEnrolled",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns=@JoinColumn(name = "student_id")

    )
    private Set<Student>studentEnrolled=new HashSet<>();

    public Set<Student> getStudentEnrolled() {
        return studentEnrolled;
    }


    private String name;

    public Subject(String name) {
        this.name = name;
    }

    public Subject() {
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
