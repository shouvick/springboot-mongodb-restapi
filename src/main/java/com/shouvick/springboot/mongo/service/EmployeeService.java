package com.shouvick.springboot.mongo.service;

import com.shouvick.springboot.mongo.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Optional<Employee> getEmployeeById(String id);

    Employee updateEmployeeById(String id, Employee employee);

    ResponseEntity<HttpStatus> deleteEmployeeById(String id);
}
