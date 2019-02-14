package com.example.mydemo;

import com.example.mydemo.models.Employee;
import com.example.mydemo.repositories.EmployeeRepository;

import java.util.List;

public class FakeEmployeeRepository implements EmployeeRepository {
    private List<Employee> employees;

    public FakeEmployeeRepository(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }
}
