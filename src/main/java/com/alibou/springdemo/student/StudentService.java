package com.alibou.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student("Ali",
                        "Bouali",
                        LocalDate.now(),
                        "r@gmail.com",
                        34),

                new Student("Aziz",
                        "Bouali",
                        LocalDate.now(),
                        "r@gmail.com",
                        34));
    }
}
