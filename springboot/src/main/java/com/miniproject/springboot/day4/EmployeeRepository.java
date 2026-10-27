package com.miniproject.springboot.day4;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee,Integer>{
    
}
