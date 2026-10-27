package com.miniproject.springboot.day4;
import java.util.*;
import org.springframework.stereotype.Service;

@Service 
public class EmployeeService {
    
    private final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }
    //post
    public Employee addEmployee(Employee e){
       return employeeRepository.save(e);
       
    }
    //get
    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }
    //get employee by id
    public Employee getEmployeeById(int id){
      return employeeRepository.findById(id).orElse(null);
    }
    //PUT - update
    public Employee updateEmployee(int id,Employee updatedemployee){
       Employee e = employeeRepository.findById(id).orElse(null);
       if(e!=null){
                e.setName(updatedemployee.getName());
                e.setDept(updatedemployee.getDept() );
                e.setSalary(updatedemployee.getSalary());
                return employeeRepository.save(e);
            }
        return null;
    }
    //DELETE 
    public boolean  deleteEmployee(int id){
      if(employeeRepository.existsById(id)){
        employeeRepository.deleteById(id);
            return true;
        }
      
      return false;
    }

    
}
