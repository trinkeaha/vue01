package com.qfedu.emp.dao;

import com.qfedu.emp.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> findAll();

    public void add(Employee emp);

    public void update(Employee emp);

    public void deleteById(Integer id);

    public Employee findById(Integer id);

    public int insertForeach(List<Employee> list);
}
