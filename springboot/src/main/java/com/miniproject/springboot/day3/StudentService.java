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
    public List<Student> getAllStudents(){
        return students;
    }
    public Student updatestudent(int id,Student s){
       for(Student st : students){
        if(st.getId()==id){
            st.setName(s.getName());
            st.setBranch(s.getBranch());
            return st;
        }
       }
       return null;
    }
    public String deleteStudent(int id){
        for(Student st : students){
            if(st.getId()==id){
                students.remove(st);
                return "DELETED SUCCESSFULLY";
            }
        }
        return "STUDENT NOT FOUND";
    }
}
