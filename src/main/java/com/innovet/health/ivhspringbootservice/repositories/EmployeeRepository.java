package com.innovet.health.ivhspringbootservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.innovet.health.ivhspringbootservice.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>
{
    @Query(value = "select * from ivh.employee", nativeQuery = true)
    List<Employee> getAllEmployees();
}