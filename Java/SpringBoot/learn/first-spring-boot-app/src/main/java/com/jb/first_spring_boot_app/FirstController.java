package com.jb.first_spring_boot_app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class FirstController 
{
    @GetMapping("/hello1")
    public String greeting()
    {
        return "Hello World";
    }
    
    @GetMapping("/hello2/{name}")
    public String greeting1(@PathVariable String name)
    {
        return "Hello World "+name;
    }
    
    @GetMapping("/hello3")
    public String greeting2(@RequestParam String name)
    {
        return "Hello World "+name;
    }
    
    @GetMapping("/tharun")
    public ResponseEntity<String> instaTharun()
    {
    	return new ResponseEntity<>("jayabalajee.sk", HttpStatus.OK);
    }
    
    @GetMapping("/jaya")
    public ResponseEntity<String> instaJaya()
    {
    	return ResponseEntity.ok("jayabalajee_sk");
    }
    
    
}
