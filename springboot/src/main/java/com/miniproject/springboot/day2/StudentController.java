package com.miniproject.springboot.day2;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StudentController {
  /*@Requestparam is used to get a value from urls query parameter 
  EX : GET/searchStudents/name?sherin */
  @GetMapping("/searchStudents")
  public String searchStudents(@RequestParam String name){
          return "Searching for student: "+name;
  }
  @PostMapping("/students")
  public Student addStudent(@RequestBody Student s){
    return s;
  }
}
