package com.jb.HelloWorld.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorld/Todo")
public class TodoController 
{
	@GetMapping("/todo")
	String todo()
	{
		return "Todo";
	}
	
	@GetMapping("/todo/{id}")
	String GetTodoByID_PV(@PathVariable Long id)
	{
		return "Todo with ID: " + id;
	}
	@GetMapping
	String GetTodoByID_RP(@RequestParam("todoID") Long id)
	{
		return "Todo with ID: " + id;
	}

	@GetMapping("/createUser_RP")
	String createUser_RP(@RequestParam String userID, @RequestParam String password)
	{
		return "Username: "+userID+" "+"Password: "+password; 
	}
	
	
	@PostMapping("/createUser_RB")
	String createUser_RB(@RequestBody String body)
	{
		return body;
	}
	
	@PutMapping("/todo/{id}")
	String updateTodoByID_PV(@PathVariable Long id)
	{
		return "Todo Updated with ID: " + id;
	}
	
	@DeleteMapping("/todo/{id}")
	String DeleteTodoByID_PV(@PathVariable Long id)
	{
		return "Todo Deleted with ID: " + id;
	}
}
