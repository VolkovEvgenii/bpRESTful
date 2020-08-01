package com.github.volkovEvgenii.dao;

import com.github.volkovEvgenii.entity.Employee;

import java.util.List;

public interface IEmployeeDAO {

    List<Employee> getEmployees();
    void saveEmployee (Employee employee);
    Employee getEmployee(int id);
    void deleteEmployee(int id);
}
