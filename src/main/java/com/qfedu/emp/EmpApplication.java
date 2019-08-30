package com.qfedu.emp;

import com.qfedu.emp.entity.Employee;
import com.qfedu.emp.service.EmployeeService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.List;

@SpringBootApplication
@MapperScan("com.qfedu.emp.dao")
public class EmpApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EmpApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(EmpApplication.class,args);
    }
}
