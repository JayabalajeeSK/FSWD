package com.jb.fifth_spring_boot_app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController 
{

    @Autowired
    private StudentService studentService;

    // GET all students
    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() 
    {
        List<Student> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    // GET student by ID
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) 
    {
        Optional<Student> student = studentService.getStudentById(id);
        return student.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // POST create student
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) 
    {
        Student savedStudent = studentService.createStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    // PUT update student completely
    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) 
    {
        Optional<Student> studentOptional = studentService.getStudentById(id);
        if (studentOptional.isPresent()) 
        {
            Student student = studentOptional.get();

            student.setName(studentDetails.getName());
            student.setEmail(studentDetails.getEmail());
            student.setCourse(studentDetails.getCourse());
            student.setAge(studentDetails.getAge());

            return new ResponseEntity<>(studentService.updateStudent(student), HttpStatus.OK);
        } 
        else 
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // PATCH update student partially
	@PatchMapping("patchUpdate/{id}")
	public ResponseEntity<Student> patchStudent(@PathVariable Long id, @RequestBody Student studentDetails) 
	{
	
	    Optional<Student> studentOptional = studentService.getStudentById(id);
	
	    if (studentOptional.isPresent()) 
	    {
	        Student student = studentOptional.get();
	
	        if (studentDetails.getName() != null)
	            student.setName(studentDetails.getName());
	
	        if (studentDetails.getEmail() != null)
	            student.setEmail(studentDetails.getEmail());
	
	        if (studentDetails.getCourse() != null)
	            student.setCourse(studentDetails.getCourse());
	
	        if (studentDetails.getAge() != null) 
            {
	            student.setAge(studentDetails.getAge());
	        }
	
	
	        return ResponseEntity.ok(studentService.updateStudent(student));
	    }
	
	    return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}



    // DELETE student
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) 
    {
        Optional<Student> studentOptional = studentService.getStudentById(id);
        if (studentOptional.isPresent()) 
        {
            studentService.deleteStudent(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } 
        else 
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}