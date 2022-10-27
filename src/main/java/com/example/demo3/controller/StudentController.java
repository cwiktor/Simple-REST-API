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

    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable long id){
        studentService.deleteStudent(id);
    }

    @PutMapping("/student/put/{id}")
    public void updateStudentName(@PathVariable long id, String name, String lastname){
        studentService.updateStudent(id, name, lastname);
    }

}
