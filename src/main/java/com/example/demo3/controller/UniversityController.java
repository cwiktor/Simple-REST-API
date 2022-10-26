package com.example.demo3.controller;

import com.example.demo3.model.University;
import com.example.demo3.service.UniversityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

@RestController // DZIALA
//@Controller // NIE DZIALA ????
@RequiredArgsConstructor
public class UniversityController {

    private final UniversityService universityService;

    @GetMapping("/universities")
    public List<University> getAllUniversities(){
        return universityService.getAllUniversities();
    }

    @GetMapping("/university/{id}")
    public University getUniversity(@PathVariable long id){
        return universityService.getUniversity(id);
    }

    @GetMapping("/universityName/{name}")
    public University getUniversityByName(@PathVariable String name){
        return universityService.getUniversityByName(name);
    }

    @PostMapping("/university/add")
    public void addUniversity(@RequestBody University university){
        universityService.addUniversity(university);
    }




}
