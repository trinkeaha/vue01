package com.qfedu.emp.service.impl;

import com.qfedu.emp.dao.EmployeeDao;
import com.qfedu.emp.entity.Employee;
import com.qfedu.emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired(required = false)
    private EmployeeDao employeeDao;
    @Override
    public List<Employee> findAllEmp() {
        return employeeDao.findAll();
    }

    @Override
    public void add(Employee emp) {
        employeeDao.add(emp);
    }

    @Override
    public void update(Employee emp) {
        employeeDao.update(emp);
    }

    @Override
    public void deleteById(Integer id) {
        employeeDao.deleteById(id);
    }

    @Override
    public Employee findById(Integer id) {
        return employeeDao.findById(id);
    }
}
