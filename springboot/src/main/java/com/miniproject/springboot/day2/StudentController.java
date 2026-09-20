package com.miniproject.springboot.day2;
import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.bind.annotation.RequestParam;
import  org.springframework.web.bind.annotation.PathVariable;
import  org.springframework.web.bind.annotation.PutMapping;

@RestController
public class StudentController {
      @PutMapping("/students/{id}")
      public Student updateStudent(@PathVariable int id,@RequestBody Student s){
           s.setId(id);
           return s;
      }
      @DeleteMapping("/studentsdelete/{id}")
      public String DeleteStudent(@PathVariable int id){
        return "Deleted "+id+ "successfully";
      }

  }

