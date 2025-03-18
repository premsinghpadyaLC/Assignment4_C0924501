package com.example.student_management;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.student_management.model.Student;
import com.example.student_management.service.StudentService;

public class StudentServiceTest {
    @Test
    void testAddStudentIncreasesSize() {
        StudentService studentService = new StudentService();
        int initialSize = studentService.getAllStudents().size();
        studentService.addStudent(new Student());
        assertEquals(initialSize + 1, studentService.getAllStudents().size());
    }
}
