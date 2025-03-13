package com.example.JPAdemo.service;

import com.example.JPAdemo.model.Student;
import com.example.JPAdemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {

    @Autowired
    StudentRepo studentRepo;


    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentById(int id){
        return studentRepo.findById(id).orElse(new Student());
    }
    public void addStudent(Student student){
         studentRepo.save(student);
    }

    public void updateStudent(Student student){
        studentRepo.save(student);
    }

    public void DeleteStudentById(int id){
        studentRepo.findById(id);
    }

}