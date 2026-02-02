package com.jb.HelloWorld;

import com.jb.HelloWorld.service.TodoService;

public class Main {
    public static void main(String[] args) {
            TodoService todoService = new TodoService();
            todoService.printTodo();
        
    }

}
