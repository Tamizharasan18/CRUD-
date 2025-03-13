package com.example.JPAdemo.controller;


import com.example.JPAdemo.model.Student;
import com.example.JPAdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getALlStudents(){
       return  studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable("Id") int id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "added";
    }

    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return "added";
    }

    @DeleteMapping("/students/{Id}")
    public String deleteStudentById(@PathVariable ("Id") int id){
        studentService.DeleteStudentById(id);
        return  "deleted";
    }

}
