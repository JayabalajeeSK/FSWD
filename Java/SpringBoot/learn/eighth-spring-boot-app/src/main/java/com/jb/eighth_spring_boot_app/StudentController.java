package com.jb.eighth_spring_boot_app;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jb.eighth_spring_boot_app.DTO.StudentDTO;
import com.jb.eighth_spring_boot_app.DTO.StudentMapper;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(name = "Student API", description = "CRUD operations for Students")
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // GET all students
    @Operation(summary = "Get all students")
    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() 
    {
        List<Student> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    // GET student by ID
    @Operation(summary = "Get student by ID")
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) 
    {
        Optional<Student> student = studentService.getStudentById(id);
        return student.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // POST create student
    @Operation(summary = "Create new student")
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody @Valid StudentDTO dto) 
    {

        Student student = StudentMapper.toEntity(dto);
        Student savedStudent = studentService.createStudent(student);

        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    // PUT update student completely
    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(
            @PathVariable Long id, @Valid
            @RequestBody StudentDTO dto) 
    {

        Optional<Student> studentOptional = studentService.getStudentById(id);

        if (studentOptional.isPresent()) 
        {
            Student student = studentOptional.get();

            student.setName(dto.getName());
            student.setEmail(dto.getEmail());
            student.setCourse(dto.getCourse());
            student.setAge(dto.getAge());

            return new ResponseEntity<>(studentService.updateStudent(student), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // PATCH update student partially
    @PatchMapping("patchUpdate/{id}")
    public ResponseEntity<Student> patchStudent(
            @PathVariable Long id, @Valid
            @RequestBody StudentDTO dto) 
    {

        Optional<Student> studentOptional = studentService.getStudentById(id);

        if (studentOptional.isPresent()) 
        {
            Student student = studentOptional.get();

            if (dto.getName() != null)
                student.setName(dto.getName());

            if (dto.getEmail() != null)
                student.setEmail(dto.getEmail());

            if (dto.getCourse() != null)
                student.setCourse(dto.getCourse());

            if (dto.getAge() != null)
                student.setAge(dto.getAge());

            return ResponseEntity.ok(studentService.updateStudent(student));
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }




    // DELETE student
    @Operation(summary = "Delete student by ID")
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

        @GetMapping("/sort")
        public ResponseEntity<List<Student>> sortStudents(
                @RequestParam(defaultValue = "id") String sortBy,
                @RequestParam(defaultValue = "asc") String order) 
        {

            List<Student> students = studentService.getStudentsSorted(sortBy, order);

            return ResponseEntity.ok(students);
        }

        @GetMapping("/paging")
        public ResponseEntity<Page<Student>> getStudentsWithPaging(
                @RequestParam(defaultValue = "0") int page,
                @RequestParam(defaultValue = "2") int size,
                @RequestParam(defaultValue = "id") String sortBy,
                @RequestParam(defaultValue = "asc") String direction
        ) 
        {
            Sort sort = direction.equalsIgnoreCase("desc")
                    ? Sort.by(sortBy).descending()
                    : Sort.by(sortBy).ascending();

            Pageable pageable = PageRequest.of(page, size, sort);

            Page<Student> students = studentService.getStudentsWithPaging(pageable);

            return new ResponseEntity<>(students, HttpStatus.OK);
        }


}

