package com.example.demo3.repository;

import com.example.demo3.model.Student;
import com.example.demo3.model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
