package com.miniproject.springboot.day3;
import java.util.*;
import org.springframework.stereotype.Service;

@Service 
public class StudentService {
   
    List<Student> students = new ArrayList<>();
    public Student addStudent(Student s){
        students.add(s);
        return s;
    }
}
