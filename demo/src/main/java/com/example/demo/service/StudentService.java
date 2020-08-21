package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

    public List<Student> findAll();

    public Student findByStudentNumber(long studentNumber);

    public Student findByEmail(String email);

    public List<Student> findAllByOrderByGpa();

    public void saveOrUpdateStudent(Student student);

    public void deleteStudent(String id);

}
