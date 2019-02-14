package com.example.mydemo.repositories;

import com.example.mydemo.models.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAll();
}
