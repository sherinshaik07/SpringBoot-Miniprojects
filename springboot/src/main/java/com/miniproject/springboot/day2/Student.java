package com.miniproject.springboot.day2;

public class Student {
    private int id;
    private String name;
    private String college;
    private String course;

    public Student(int id,String name,String college,String course){
        this.id = id;
        this.name=name;
        this.college=college;
        this.course=course;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCollege(){
        return college;
    }
    public String getCourse(){
        return course;
    }
    
}
