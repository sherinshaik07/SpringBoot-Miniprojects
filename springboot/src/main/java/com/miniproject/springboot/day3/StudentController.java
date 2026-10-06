package com.miniproject.springboot.day3;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;


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
    @GetMapping 
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @PutMapping ("/{id}")
    public Student updateStudent(@PathVariable int id,@RequestBody Student s){
        return studentService.updatestudent(id, s);
    }
     @DeleteMapping("/{id}")
     public String deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
     }
    


}
