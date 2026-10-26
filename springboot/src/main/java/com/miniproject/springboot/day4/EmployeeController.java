package com.miniproject.springboot.day4;
import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/Employees")
public class EmployeeController {
    private EmployeeService employeeService;
 public EmployeeController(EmployeeService employeeService){
    this.employeeService= employeeService;
 }
 @PostMapping 
 public Employee addEmployee(@RequestBody  Employee e){
    return  employeeService.addEmployee(e);
 }
 @GetMapping 
 public List<Employee> getEmployee(){
    return employeeService.getEmployee();
 }
 @GetMapping("/{id}")
 public Employee getEmployeeById(@PathVariable int id){
    return employeeService.getEmployeeById(id);
 }
 @PutMapping ("/{id}")
    public Employee updateEmployee(@PathVariable  int id,@RequestBody Employee e){
        return employeeService.updateEmployee(id, e);
    }
 
@DeleteMapping ("/{id}")
    public String deleteEmployee(@PathVariable int id){
       boolean deleted = employeeService.deleteEmployee(id);
       if(deleted){
        return "EMPLOYEE DELETED SUCCESSFULLY";
       }
       return "EMPLOYEE NOT FOUND";
    }
}

