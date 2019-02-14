package com.example.mydemo.services;

import com.example.mydemo.models.Employee;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    List<Employee> getByJobTitle(String jobTitle);
    List<Employee> getByJobTitleAndMinSalary(String jobTitle, BigDecimal minSalary);
    List<Employee> getByJobTitleAndMaxSalary(String jobTitle, BigDecimal maxSalary);
    BigDecimal getMinSalaryByJobTitle(String jobTitle);
    BigDecimal getMaxSalaryByJobTitle(String jobTitle);
}
