package com.jb.seventh_spring_boot_app.DTO;
import com.jb.seventh_spring_boot_app.Student;

public class StudentMapper {

    public static Student toEntity(StudentDTO dto) {
        Student student = new Student();
        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setCourse(dto.getCourse());
        student.setAge(dto.getAge());
        return student;
    }

    public static StudentDTO toDTO(Student student) {
        StudentDTO dto = new StudentDTO();
        dto.setName(student.getName());
        dto.setEmail(student.getEmail());
        dto.setCourse(student.getCourse());
        dto.setAge(student.getAge());
        return dto;
    }
}
