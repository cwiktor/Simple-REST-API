package com.example.demo3.controller;


import com.example.demo3.model.Student;
import com.example.demo3.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/student/add")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @DeleteMapping("/sudent/delete/{id}")
    public void deleteStudent(@PathVariable long id){
        studentService.deleteStudent(id);
    }

}
