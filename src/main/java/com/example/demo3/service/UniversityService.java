package com.example.demo3.service;

import com.example.demo3.model.University;
import com.example.demo3.repository.UniversityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UniversityService {

    private final UniversityRepository universityRepository;

    public List<University> getAllUniversities(){
        return universityRepository.findAll();
    }

    public University getUniversity(long id) {
        return universityRepository.findById(id).orElseThrow();
    }
}
