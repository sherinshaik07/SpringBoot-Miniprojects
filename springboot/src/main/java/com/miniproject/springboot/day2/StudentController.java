package com.miniproject.springboot.day2;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    /*@GetMapping("/StudentDetails")
   public Student getStudentDetails(){
     Student s = new Student(2,"sherin","NECN","CSE-AIML");
   return s; 
  }--for only one object*/

  /*for list of objects */
  @GetMapping("/StudentsDetails")
  public List<Student> getStudentDetails(){
            List<Student> s = new ArrayList<>();
            s.add(new Student(
              1,"sherin" ,"necn" ,"aiml" 
            ));
            s.add(new Student(2,"ravi" , "gist", "cse"));
        return s;
  }
}
