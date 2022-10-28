package com.example.demo3.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
@Getter
@Setter
public class University {

    @Id
    private long id;
    private String name;

    @OneToMany
    @JoinColumn(name ="id_university") //dlaczego ta
    private List<Student> studentList;


}
