package com.jb.fourth_spring_boot_app;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // ---------------- POST - Create ----------------
    @PostMapping("/create")
    public ResponseEntity<Student> create(@RequestBody Student student) 
    {
        Student savedStudent = service.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }

    // ---------------- GET - All ----------------
    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAll() 
    {
        List<Student> students = service.getAllStudents();
        return ResponseEntity.ok(students);
    }

    // ---------------- GET - By ID ----------------
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getById(@PathVariable int id) 
    {
        Student student = service.getStudentById(id);
        if (student != null) 
        {
            return ResponseEntity.ok(student);
        } 
        else 
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // ---------------- PUT - Update ----------------
    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable int id, @RequestBody Student student) 
    {
        int updatedRows = service.updateStudent(id, student);
        if (updatedRows > 0) 
        {
            return ResponseEntity.ok("Student updated successfully");
        } 
        else 
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
        }
    }

    // ---------------- DELETE ----------------
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) 
    {
        int deletedRows = service.deleteStudent(id);
        if (deletedRows > 0) 
        {
            return ResponseEntity.ok("Student deleted successfully");
        } 
        else 
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
        }
    }

    // ---------------- OPTIONAL: GET BY NAME ----------------
    @GetMapping("/name/{name}")
    public ResponseEntity<List<Student>> getByName(@PathVariable String name) 
    {
        List<Student> students = service.getStudentsByName(name);
        return ResponseEntity.ok(students);
    }
}
