package com.example.mydemo.controllers;

import com.example.mydemo.models.Employee;
import com.example.mydemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesRestController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeesRestController(EmployeeService service) {
        this.employeeService = service;
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getAll();
    }
}
