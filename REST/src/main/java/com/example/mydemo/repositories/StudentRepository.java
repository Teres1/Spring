package com.example.mydemo.repositories;

import com.example.mydemo.models.Student;

import java.util.List;

public interface StudentRepository {
    void createStudent(Student student);
    List<Student> getStudents();
    Student getStudentById(int id);
    void updateStudent(int id, Student student);
    void deleteStudent(int id);
}
