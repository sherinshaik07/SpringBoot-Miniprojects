package com.miniproject.springboot.day2;

public class Student {
    private int id;
    private String name;
    private String college;
    private String course;
//parameterized constructor used for GET APIs
    public Student(int id,String name,String college,String course){
        this.id = id;
        this.name=name;
        this.college=college;
        this.course=course;
    }

    //Default constructor for @RequestBody
    public Student(){

    }
    //getters
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
    //setters
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCollege(String college){
        this.college = college;
    }
    public void setCourse(String course){
        this.course = course;
    }

    
}
