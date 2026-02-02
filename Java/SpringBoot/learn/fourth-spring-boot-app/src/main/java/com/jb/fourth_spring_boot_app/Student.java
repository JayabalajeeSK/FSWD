package com.jb.fourth_spring_boot_app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue
    private Integer id;
    private String name;
    private int age;

    public Student() {}

    public Student(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // getters & setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }   
    public void setName(String name) {
        this.name = name;
    }   
    public int getAge() {
        return age;
    }   
    public void setAge(int age) {
        this.age = age;
    }
}
