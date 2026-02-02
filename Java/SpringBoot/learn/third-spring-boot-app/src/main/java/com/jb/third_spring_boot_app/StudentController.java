package com.jb.third_spring_boot_app;


import java.util.List;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/students")
public class StudentController 
{

    private final StudentService service;

    public StudentController(StudentService service) 
    {
        this.service = service;
    }

    // POST - Create
    @PostMapping("/create")
    public ResponseEntity<Student> create(@RequestBody Student student) 
    {
        return new ResponseEntity<>(service.addStudent(student), HttpStatus.CREATED);
    }

    // GET - All
    @GetMapping("/all")
    public List<Student> getAll() 
    {
        return service.getAllStudents();
    }

    // GET - By ID
    @GetMapping("/get/{id}")
    public Student getById(@PathVariable int id) 
    {
        return service.getStudentById(id);
    }

    // PUT - Update
    @PutMapping("/update/{id}")
    public Student update(@PathVariable int id, @RequestBody Student student) 
    {
        return service.updateStudent(id, student);
    }

    // DELETE
    @DeleteMapping("/delele/{id}")
    public String delete(@PathVariable int id) 
    {
        return service.deleteStudent(id);
    }
}
