package com.innovet.health.ivhspringbootservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovet.health.ivhspringbootservice.entities.Employee;
import com.innovet.health.ivhspringbootservice.repositories.EmployeeRepository;

@Service
public class EmployeeService
{
    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees()
    {
        return employeeRepository.getAllEmployees();
    }
}