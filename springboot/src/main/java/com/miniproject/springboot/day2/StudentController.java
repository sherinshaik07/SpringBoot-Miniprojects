package com.miniproject.springboot.day2;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
  @GetMapping("/StudentsDetails/{id}")
  public Student getStudentDetails(@PathVariable int id){
           if(id==1){
            return new Student(
              1,"sherin" ,"necn" ,"aiml" 
            );}
           else if(id==2){
           return new Student(2,"ravi" , "gist", "cse");
           }
        return null;
  }
}
