package com.srijan.studentmanagement.contoller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srijan.studentmanagement.entity.Student;
import com.srijan.studentmanagement.service.StudentService;

@RestController
public class StudentController {
	private final StudentService studentService;

	public StudentController(StudentService studentService) {
	    this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
	    return studentService.getAllStudents();
	}
}
