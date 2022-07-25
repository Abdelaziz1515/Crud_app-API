package com.example.demo.Subject.repo;

import com.example.demo.Subject.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo  extends JpaRepository<Subject,Integer> {
}
