package com.qfedu.emp.controller;

import com.qfedu.emp.commen.JsonResult;
import com.qfedu.emp.entity.Employee;
import com.qfedu.emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/myEmp")
    public JsonResult listEmp(){
        List<Employee> list = employeeService.findAllEmp();
        return new JsonResult(1,list);
    }

    @RequestMapping("/findOne")
    public JsonResult findOne(Integer id) {
        Employee employee = employeeService.findById(id);
        return new JsonResult(1,employee);
    }

    @RequestMapping("/add")
    public String newPage() {
        return "add";
    }

    @RequestMapping("/deleteEmp")
    public JsonResult delete(Integer id){
        employeeService.deleteById(id);
        return new JsonResult(1,null);
    }

    @RequestMapping("/updateEmp")
    public JsonResult update(Employee employee){
        employeeService.update(employee);

        return new JsonResult(1,null);
    }

    @RequestMapping("/addEmp")
    public JsonResult add(Employee employee){
        employeeService.add(employee);
        return new JsonResult(1,null);

    }
}
