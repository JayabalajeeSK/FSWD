package com.jb.todo_management_system.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jb.todo_management_system.entity.User;
import com.jb.todo_management_system.repository.UserRepository;
import com.jb.todo_management_system.service.UserService;
import com.jb.todo_management_system.utils.JwtUtils;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController 
{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Map<String, String> body)
    {
        String email = body.get("email");
        String password =  passwordEncoder.encode(body.get("password"));
       
        if(userRepository.findByEmail(email).isPresent())
        {
            return new ResponseEntity<>("Email Already Exist", HttpStatus.CONFLICT);
            //return ResponseEntity.status(HttpStatus.CONFLICT).body("Email Already Exist");
        }
        userService.createUser(User.builder().email(email).password(password).build());
        return new ResponseEntity<>("Successfully Registered", HttpStatus.CREATED);


    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody Map<String, String> body)
    {
        String email = body.get("email");
        String password = body.get("password");
        var userOptional = userRepository.findByEmail(email);
        if(userOptional.isEmpty())
        {
            return new ResponseEntity<>("User Not Registered", HttpStatus.UNAUTHORIZED);
            //return ResponseEntity.status(HttpStatus.CONFLICT).body("Email Already Exist");
        }
        User user = userOptional.get();
        if(!passwordEncoder.matches(password, user.getPassword()))
        {
            return new ResponseEntity<>("Invalid User", HttpStatus.UNAUTHORIZED);
        }
        String token = jwtUtils.generateToken(email);
        return ResponseEntity.ok(Map.of("token", token));


    }
    
}
