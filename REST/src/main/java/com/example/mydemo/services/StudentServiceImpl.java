package com.example.mydemo.services;

import com.example.mydemo.models.Student;
import com.example.mydemo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository repository;

    @Autowired
    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createStudent(Student student) {
        repository.createStudent(student);
    }

    @Override
    public List<Student> getStudents() {
        return null;
    }

    @Override
    public Student getStudentById(int id) {
        return repository.getStudentById(id);
    }

    @Override
    public void updateStudent(int id, Student student) {
        repository.updateStudent(id, student);
    }

    @Override
    public void deleteStudent(int id) {
        repository.deleteStudent(id);
    }
}
