package com.qfedu.emp.controller;

import com.qfedu.emp.commen.JsonResult;
import com.qfedu.emp.entity.Employee;
import com.qfedu.emp.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@Api(description = "员工管理相关")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "获取所有员工数据",notes = "获取员工数据")
    @GetMapping("/myEmp")
    public JsonResult listEmp(){
        List<Employee> list = employeeService.findAllEmp();
        return new JsonResult(1,list);
    }

    @GetMapping("/findOne")
    public JsonResult findOne(Integer id) {
        //List<Employee> list = employeeService.findAllEmp();
        //employeeService.insertForeach(list);
        Employee employee = employeeService.findById(id);
        return new JsonResult(1,employee);
    }


    @RequestMapping(value = "/deleteEmp",method = RequestMethod.GET)
    @ApiImplicitParam(name = "id", value = "员工id",required = true,dataType = "Integer")
    public JsonResult delete(Integer id){
        employeeService.deleteById(id);
        return new JsonResult(1,null);
    }

    @PostMapping("/updateEmp")
    public JsonResult update(Employee employee){
        employeeService.update(employee);

        return new JsonResult(1,null);
    }

    @PostMapping("/addEmp")
    public JsonResult add(Employee employee){
        employeeService.add(employee);
        return new JsonResult(1,null);

    }

    @RequestMapping("/addEmps")
    public JsonResult addEmps() {
        List<Employee> list = employeeService.findAllEmp();
        employeeService.insertForeach(list);
        return new JsonResult(1,null);
    }
}
