package com.miniproject.springboot.day2;
import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.bind.annotation.RequestParam;
import  org.springframework.web.bind.annotation.PathVariable;
import  org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.ResponseEntity;


@RestController
//request mapping makes the common starting point for all student apis
@RequestMapping("/students")
public class StudentController {
      @PostMapping
      public Student add(@RequestBody  Student stud){
        return stud;
      }
       @GetMapping
      public String getDetail(){
        return "student List";
      }
      @PutMapping("/{id}")
      public Student updateStudent(@PathVariable int id,@RequestBody Student s){
           s.setId(id);
           return s;
      }
      @DeleteMapping("/{id}")
      public String DeleteStudent(@PathVariable int id){
        return "Deleted "+id+ "successfully";
      }
      //ResponseEntity-->Allows us to control response body with http status as 200ok
      @GetMapping("/response")
      public ResponseEntity<String> welcomeResponse(){
        return ResponseEntity.ok("Welcome");
      }
      //to test 201 created 
      @PostMapping("/stu")
      public ResponseEntity<Student> addStudent(@RequestBody Student s){
        return ResponseEntity.status(201).body(s);
      }

  }

