package com.github.volkovEvgenii.service;

import com.github.volkovEvgenii.entity.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getEmployees();
    void saveEmployee (Employee employee);
    Employee getEmployee(int id);
    void deleteEmployee(int id);
}
