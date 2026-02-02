package com.jb.HelloWorld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jb.HelloWorld.repo.TodoRepository;
@Service
public class TodoService 
{
    @Autowired
	private TodoRepository todoRepository;

    public TodoService() {
        this.todoRepository = new TodoRepository();
    }
    public void printTodo()
    {
        System.out.println(todoRepository.getAllTodos());
    }
	
}
