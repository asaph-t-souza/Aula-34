package com.t3.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.t3.springrest.dto.StudentDto;
import com.t3.springrest.entity.Student;
import com.t3.springrest.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> findAll() {
        return studentService.findAllStudents();
    }

    @GetMapping("/students/{id}")
    public StudentDto findById(@PathVariable(name = "id") Long id) {
        return studentService.retrieveStudent(id);
    }

    @PostMapping("/students")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Student create(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable(name = "id") Long id, @RequestBody Student student){
        return studentService.updateStudent(student, id);
    }

    @DeleteMapping("/students/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable(name = "id") Long id){
        studentService.deleteStudentById(id);
    }

}
