package com.example.mydemo.repositories;

import com.example.mydemo.models.Employee;

import java.util.List;

public interface EmployeeRepository {
    void create(Employee employee);
    List<Employee> getAll();
    Employee getById(int id);
    List<Employee> getByJobTitle(String jobTitle);
    void update(int id, Employee employee);
    void delete(int id);
}
