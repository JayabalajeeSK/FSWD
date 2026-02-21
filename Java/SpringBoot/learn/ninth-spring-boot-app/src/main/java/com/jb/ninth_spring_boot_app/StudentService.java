package com.jb.ninth_spring_boot_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;
@Service

public class StudentService {
    private static final Logger log =
            LoggerFactory.getLogger(StudentService.class);
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        log.info("Fetching all students");
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        log.info("Fetching student with id {}", id);
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        log.info("Creating student with email {}", student.getEmail());
        return studentRepository.save(student);
    }

    public Student updateStudent(Student student) {
        log.info("Updating student with id {}", student.getId());
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        log.warn("Deleting student with id {}", id);
        studentRepository.deleteById(id);
    }

    public Page<Student> getStudentsWithPaging(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    public List<Student> getStudentsSorted(String sortBy, String order) {

        Sort sort = order.equalsIgnoreCase("desc")
                ? Sort.by(sortBy).descending()
                : Sort.by(sortBy).ascending();

        return studentRepository.findAll(sort);
    }

    
}

