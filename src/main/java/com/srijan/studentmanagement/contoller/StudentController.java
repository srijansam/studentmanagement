package com.srijan.studentmanagement.contoller;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/students/{id}")
	public Optional<Student> getStudentById(@PathVariable int id) {
	    return studentService.getStudentById(id);
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
	    return studentService.addStudent(student);
	}
	
	@PutMapping("/students/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable int id) {
	    studentService.deleteStudent(id);
	}
}
