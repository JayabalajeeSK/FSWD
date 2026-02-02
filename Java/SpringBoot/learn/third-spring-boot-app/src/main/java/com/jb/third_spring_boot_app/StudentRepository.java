package com.jb.third_spring_boot_app;


import java.util.*;
import org.springframework.stereotype.Repository;


@Repository
public class StudentRepository {

    private Map<Integer, Student> db = new HashMap<>();

    // CREATE
    public Student save(Student student) {
        db.put(student.getId(), student);
        return student;
    }

    // READ ALL
    public List<Student> findAll() {
        return new ArrayList<>(db.values());
    }

    // READ BY ID
    public Student findById(int id) {
        return db.get(id);
    }

    // UPDATE
    public Student update(int id, Student student) {
        db.put(id, student);
        return student;
    }

    // DELETE
    public String delete(int id) {
        db.remove(id);
        return "Student deleted with id " + id;
    }
}
