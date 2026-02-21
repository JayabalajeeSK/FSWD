package com.jb.ninth_spring_boot_app.Security.Users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentAuthController {

    @GetMapping
    public String getStudents() 
    {
        return "Only AUTHENTICATED users can see this";
    }
}
