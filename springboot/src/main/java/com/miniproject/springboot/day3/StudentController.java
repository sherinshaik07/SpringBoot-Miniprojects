package com.miniproject.springboot.day3;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/student")
public class StudentController {
   
    private StudentService studentService;
    public StudentController(StudentService stuservice){
        this.studentService=stuservice;
    }
    @PostMapping
    public Student addStudent(@RequestBody Student s){
        return studentService.addStudent(s);
    }
}
