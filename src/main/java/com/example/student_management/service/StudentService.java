package com.example.student_management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student_management.model.Student;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}
