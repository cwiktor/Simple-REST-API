package com.example.demo3.controller;

import com.example.demo3.model.University;
import com.example.demo3.service.UniversityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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




}
