package com.jb.todo_management_system.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jb.todo_management_system.entity.Todo;
import com.jb.todo_management_system.repository.TodoRepository;
import com.jb.todo_management_system.service.TodoService;

import jakarta.transaction.Transactional;

@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    @Transactional
    public Todo createTodo(Todo todo) 
    {

        Integer maxSerial = todoRepository.findMaxSerialNo();
        int nextSerial = maxSerial + 1;

        todo.setSerialNo(nextSerial);
        return todoRepository.save(todo);
    }


    @Override
    public Todo getTodoBySerialNo(Integer serialNo) {
        return todoRepository.findBySerialNo(serialNo)
                .orElseThrow(() -> new RuntimeException("Todo not found with serialNo: " + serialNo));
    }
    @Override
    public Todo getTodoById(Long id) 
    {
        throw new UnsupportedOperationException("Use serialNo instead of id");
    }

//////////////////////////////////////////////////

    @Override
    public Todo updateTodo(Integer serialNo, Todo todo) {

        Todo existing = getTodoBySerialNo(serialNo);

        existing.setTitle(todo.getTitle());
        // existing.setDescription(todo.getDescription());
        existing.setIsCompleted(todo.getIsCompleted());

        return todoRepository.save(existing);
    }

/////////////////////////////////////////////////

    @Override
    @Transactional
    public void deleteTodo(Integer serialNo) {

        if (!todoRepository.existsBySerialNo(serialNo)) {
            throw new RuntimeException("Todo not found with serialNo: " + serialNo);
        }

        // 1. Delete the selected todo
        todoRepository.deleteBySerialNo(serialNo);

        // 2. Shift remaining serial numbers
        todoRepository.shiftSerialNumbersDown(serialNo);
    }


    @Override
    public List<Todo> getAllTodos() {
        return todoRepository.findAllByOrderBySerialNoAsc();
    }


///////////////////////////////////////////
    @Override
    public Page<Todo> getAllTodoPages(int page, int size) {

        Pageable pageable = PageRequest.of(page, size);
        return todoRepository.findAllByOrderBySerialNoAsc(pageable);
    }

    // @Override
    // public Todo createTodo(Todo todo) {
    //     return todoRepository.save(todo);
    // }

    // @Override
    // public List<Todo> getAllTodos() {
    //     return todoRepository.findAll();
    // }

    // @Override
    // public Todo getTodoById(Long id) {
    //     return todoRepository.findById(id)
    //             .orElseThrow(() -> new RuntimeException("Todo not found"));
    // }

    // @Override
    // public Todo updateTodo(Long id, Todo todo) {
    //     Todo existing = getTodoById(id);
    //     existing.setTitle(todo.getTitle());
    //     existing.setDescription(todo.getDescription());
    //     existing.setIsCompleted(todo.getIsCompleted());
    //     return todoRepository.save(existing);
    // }

    // @Override
    // public void deleteTodo(Long id) {
    //     todoRepository.deleteById(id);
    // }
}

