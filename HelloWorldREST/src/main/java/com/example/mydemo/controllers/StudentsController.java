package com.example.mydemo.controllers;

import org.springframework.web.bind.annotation.*;
import slavi.example.demo.models.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentsController {
    List<Student>students= new ArrayList<>();
    {students.add(new Student(1,"Petyr","Petrov"));
            students.add(new Student(2,"Ivan","Ivanov"));
    }
    @GetMapping
    private List<Student>getStudents(){
        return students;
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id){
        return students.stream().filter(x->x.getId()==id)
                .findFirst()
                .orElse(null);
    }
    @PostMapping("/new")
    public void createStudent(@RequestBody Student student){
        students.add(student);
    }
    @PutMapping("/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Student student){
        Student s=getById(id);
        int sIndex=students.indexOf(s);
        students.set(sIndex,student);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id){
        Student s=getById(id);
        students.remove(s);
    }

    private Student getById(int id) {
        return students.stream()
                .filter(x->x.getId()==id)
                .findFirst()
                .orElse(null);
    }
}
