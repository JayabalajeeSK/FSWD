package com.jb.todo_management_system.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.jb.todo_management_system.entity.Todo;

public interface TodoService 
{

    Todo createTodo(Todo todo);

    // List<Todo> getAllTodos();

    Todo getTodoById(Long id);

    // Todo updateTodo(Long id, Todo todo);

    // void deleteTodo(Long id);
///////////////////////////////////////////////////////////
    Todo getTodoBySerialNo(Integer serialNo);

    Todo updateTodo(Integer serialNo, Todo todo);

    void deleteTodo(Integer serialNo);

    List<Todo> getAllTodos();
///////////////////////////////////////
    Page<Todo> getAllTodoPages(int page, int size);
}
