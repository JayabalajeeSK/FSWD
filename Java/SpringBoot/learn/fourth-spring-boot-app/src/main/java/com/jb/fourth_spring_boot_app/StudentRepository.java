package com.jb.fourth_spring_boot_app;



import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // ---------------- CREATE ----------------
    // Native SQL automatically handled by save() from JpaRepository
    // JPQL equivalent (commented):
    // @Query("INSERT INTO Student s (s.name, s.age) VALUES (:name, :age)") 
    // int createStudent(@Param("name") String name, @Param("age") int age);

    // ---------------- READ ALL ----------------
    @Query(value = "SELECT * FROM student", nativeQuery = true)
    List<Student> findAllNative();
    // JPQL version:
    // @Query("SELECT s FROM Student s")
    // List<Student> findAllJPQL();

    // ---------------- READ BY ID ----------------
    @Query(value = "SELECT * FROM student WHERE id = :id", nativeQuery = true)
    Student findByIdNative(@Param("id") int id);
    // JPQL version:
    // @Query("SELECT s FROM Student s WHERE s.id = :id")
    // Student findByIdJPQL(@Param("id") int id);

    // ---------------- UPDATE ----------------
    @Modifying
    @Transactional
    @Query(value = "UPDATE student SET name = :name, age = :age WHERE id = :id", nativeQuery = true)
    int updateStudentNative(@Param("id") int id, 
                            @Param("name") String name, 
                            @Param("age") int age);
    // JPQL version:
    // @Modifying
    // @Transactional
    // @Query("UPDATE Student s SET s.name = :name, s.age = :age WHERE s.id = :id")
    // int updateStudentJPQL(@Param("id") int id, @Param("name") String name, @Param("age") int age);

    // ---------------- DELETE ----------------
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM student WHERE id = :id", nativeQuery = true)
    int deleteStudentNative(@Param("id") int id);
    // JPQL version:
    // @Modifying
    // @Transactional
    // @Query("DELETE FROM Student s WHERE s.id = :id")
    // int deleteStudentJPQL(@Param("id") int id);

    // ---------------- OPTIONAL: FIND BY NAME ----------------
    @Query(value = "SELECT * FROM student WHERE name = :name", nativeQuery = true)
    List<Student> findByNameNative(@Param("name") String name);
    // JPQL version:
    // @Query("SELECT s FROM Student s WHERE s.name = :name")
    // List<Student> findByNameJPQL(@Param("name") String name);
}
