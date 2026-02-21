package com.jb.second_spring_boot_app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") 
public class SecondController {


    @GetMapping("/hello")	
    public String getHello() 
    {
        return "GET: Hello World";
    }


    @PostMapping("/create")
    public ResponseEntity<String> createDemo(@RequestParam String name) 
    {
        return ResponseEntity.status(HttpStatus.CREATED).body("POST: Created " + name);
    }

    @PostMapping("/create1")
    public ResponseEntity<String> createDemo1(@RequestBody String name) 
    {
        return ResponseEntity.status(HttpStatus.CREATED).body("POST: Created " + name);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateDemo(@PathVariable int id, @RequestBody String name) 
    {
        return ResponseEntity.ok("PUT: Updated id " + id + " with name " + name);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDemo(@PathVariable int id) 
    {
        return ResponseEntity.ok("DELETE: Deleted id " + id);
    }

    @PatchMapping("/updateName/{id}")
    public ResponseEntity<String> patchDemo(@PathVariable int id, @RequestBody String name) 
    {
        return ResponseEntity.ok("PATCH: Updated name for id " + id + " to " + name);
    }

}

