package com.jb.third_spring_boot_app;


import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) 
    {
        this.repo = repo;
    }

    public Student addStudent(Student student) 
    {
        return repo.save(student);
    }

    public List<Student> getAllStudents() 
    {
        return repo.findAll();
    }

    public Student getStudentById(int id) 
    {
        return repo.findById(id);
    }

    public Student updateStudent(int id, Student student) 
    {
        return repo.update(id, student);
    }

    public String deleteStudent(int id) 
    {
        return repo.delete(id);
    }
}
