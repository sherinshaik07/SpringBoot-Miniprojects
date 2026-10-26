package com.miniproject.springboot.day4;
import java.util.*;
import org.springframework.stereotype.Service;

@Service 
public class EmployeeService {
    //post
    List<Employee> employees = new ArrayList<>();
    public Employee addEmployee(Employee e){
        employees.add(e);
        return e;
    }
    //get
    public List<Employee> getEmployee(){
        return employees;
    }
    //get employee by id
    public Employee getEmployeeById(int id){
        for(Employee e : employees){
            if(e.getId()==id){
                return e;
            }
        }
        return null;
    }
    //PUT - update
    public Employee updateEmployee(int id,Employee updatedemployee){
        for(Employee e : employees){
            if(e.getId()==id){
                e.setName(updatedemployee.getName());
                e.setDept(updatedemployee.getDept() );
                e.setSalary(updatedemployee.getSalary());
                return e;
            }
        }
        return null;

    }
    //DELETE 
    public boolean  deleteEmployee(int id){
      for(Employee e :employees){
        if(e.getId()==id){
            employees.remove(e);
            return true;
        }
      }
      return false;
    }

    
}
