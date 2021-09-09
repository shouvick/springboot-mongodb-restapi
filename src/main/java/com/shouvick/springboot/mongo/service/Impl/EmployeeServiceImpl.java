package com.shouvick.springboot.mongo.service.Impl;

import com.shouvick.springboot.mongo.entity.Employee;
import com.shouvick.springboot.mongo.repository.EmployeeRepository;
import com.shouvick.springboot.mongo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee updateEmployeeById(String id, Employee employee) {
        Optional<Employee> employee1 = employeeRepository.findById(id);
        employee1.get().setName(employee.getName());
        return employeeRepository.save(employee1.get());
    }

    @Override
    public ResponseEntity<HttpStatus> deleteEmployeeById(String id) {
         employeeRepository.deleteById(id);
         return ResponseEntity.ok(HttpStatus.OK);
    }
}
