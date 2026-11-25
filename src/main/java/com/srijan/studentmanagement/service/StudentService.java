package com.srijan.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.srijan.studentmanagement.entity.Student;
import com.srijan.studentmanagement.repository.StudentRepository;
@Service
public class StudentService {
	private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get student by ID
    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    // Add a new student
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    // Delete student by ID
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
