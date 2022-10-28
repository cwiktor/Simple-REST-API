package com.example.demo3.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany
    @JoinColumn(name ="id_university") //dlaczego ta
    private List<Student> studentList;


}
