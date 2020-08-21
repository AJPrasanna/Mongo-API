package com.example.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    public Student findByStudentNumber(long studentNumber);

    public Student findByEmail(String email);

    public List<Student> findAllByOrderByGpa();

}