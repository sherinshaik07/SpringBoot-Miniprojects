package com.miniproject.springboot.day2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/StudentDetails")
   public Student getStudentDetails(){
     Student s = new Student(2,"sherin","NECN","CSE-AIML");
   
   return s;
  }
}
