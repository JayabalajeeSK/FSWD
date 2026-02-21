package com.jb.fourth_spring_boot_app;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService 
{

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) 
    {
        this.repo = repo;
    }

    // ---------------- CREATE ----------------
    public Student addStudent(Student student) 
    {
        return repo.save(student); // save() works with JpaRepository
    }

    // ---------------- READ ALL ----------------
    public List<Student> getAllStudents() 
    {
        return repo.findAllNative(); // Calls native SQL query
    }

    // ---------------- READ BY ID ----------------
    public Student getStudentById(int id) 
    {
        return repo.findByIdNative(id); // Calls native SQL query
    }

    // ---------------- UPDATE ----------------
    @Transactional
    public int updateStudent(int id, Student student) 
    {
        return repo.updateStudentNative(id, student.getName(), student.getAge());
    }

    // ---------------- DELETE ----------------
    @Transactional
    public int deleteStudent(int id) 
    {
        return repo.deleteStudentNative(id);
    }

    // ---------------- OPTIONAL: FIND BY NAME ----------------
    public List<Student> getStudentsByName(String name) 
    {
        return repo.findByNameNative(name);
    }
}
