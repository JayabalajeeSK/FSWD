package com.jb.todo_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jb.todo_management_system.entity.Todo;
import com.jb.todo_management_system.service.TodoService;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.transaction.Transactional;


@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService; //final

    // public TodoController(TodoService todoService) {
    //     this.todoService = todoService;
    // }
    @ApiResponses({
        @ApiResponse(
            responseCode = "200",
            description = "Todos fetched successfully",
            content = @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = Todo.class)
            )
        ),
        @ApiResponse(
            responseCode = "500",
            description = "Internal server error"
        )
    })


    // CREATE TODO
    @PostMapping("/create")
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) 
    {
        Todo createdTodo = todoService.createTodo(todo);
        return new ResponseEntity<>(createdTodo, HttpStatus.CREATED);
    }

    // GET ALL TODOS (ordered by serialNo)
    @GetMapping("/view/AllTodos")
    public ResponseEntity<List<Todo>> getAllTodos() 
    {
        List<Todo> todos = todoService.getAllTodos();
        return ResponseEntity.ok(todos);
    }

    // GET TODO BY SERIAL NO
    @GetMapping("/view/{serialNo}")
    public ResponseEntity<Todo> getTodoBySerialNo(@PathVariable Integer serialNo) 
    {
        Todo todo = todoService.getTodoBySerialNo(serialNo);
        return ResponseEntity.ok(todo);
    }

    // UPDATE TODO BY SERIAL NO
    @PutMapping("/update/{serialNo}")
    public ResponseEntity<Todo> updateTodo(@PathVariable Integer serialNo, @RequestBody Todo todo) 
    {

        Todo updatedTodo = todoService.updateTodo(serialNo, todo);
        return ResponseEntity.ok(updatedTodo);
    }

    // DELETE TODO BY SERIAL NO
    @Transactional
    @DeleteMapping("/delete/{serialNo}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Integer serialNo) {
        todoService.deleteTodo(serialNo);
        return ResponseEntity.noContent().build();
    }
//////////////////////////////////

    @GetMapping("/view")
    public ResponseEntity<Page<Todo>> getAllTodos(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size
    ) 
    {
        Page<Todo> todos = todoService.getAllTodoPages(page, size);

        if (todos.isEmpty()) 
        {
            return ResponseEntity.noContent().build(); // 204
        }

        return ResponseEntity.ok(todos); // 200
    }





















    
}
// @RestController
// @RequestMapping("/api/todos")
// public class TodoController {

//     private final TodoService todoService;

//     public TodoController(TodoService todoService) {
//         this.todoService = todoService;
//     }

//     // CREATE TODO
//     @PostMapping("/create")
//     public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
//         Todo createdTodo = todoService.createTodo(todo);
//         return new ResponseEntity<>(createdTodo, HttpStatus.CREATED);
//     }

//     // GET ALL TODOS
//     @GetMapping
//     public ResponseEntity<List<Todo>> getAllTodos() {
//         List<Todo> todos = todoService.getAllTodos();
//         return new ResponseEntity<>(todos, HttpStatus.OK);
//     }

//     // GET TODO BY ID
//     @GetMapping("/{id}")
//     public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
//         Todo todo = todoService.getTodoById(id);
//         return new ResponseEntity<>(todo, HttpStatus.OK);
//     }

//     // UPDATE TODO
//     @PutMapping("/{id}")
//     public ResponseEntity<Todo> updateTodo(
//             @PathVariable Long id,
//             @RequestBody Todo todo) {

//         Todo updatedTodo = todoService.updateTodo(id, todo);
//         return new ResponseEntity<>(updatedTodo, HttpStatus.OK);
//     }

//     // DELETE TODO
//     @DeleteMapping("delete/{id}")
//     public ResponseEntity<String> deleteTodo(@PathVariable Long id) {
//         todoService.deleteTodo(id);
//         return new ResponseEntity<>("Todo deleted successfully", HttpStatus.NO_CONTENT);
//     }
// }


// package com.jb.todo_management_system.controller;

// import java.util.List;

// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.jb.todo_management_system.entity.Todo;
// import com.jb.todo_management_system.service.TodoService;

// @RestController
// @RequestMapping("/api/todos")
// public class TodoController {

//     private final TodoService todoService;

//     public TodoController(TodoService todoService) {
//         this.todoService = todoService;
//     }

//     @PostMapping
//     public Todo createTodo(@RequestBody Todo todo) {
//         return todoService.createTodo(todo);
//     }

//     @GetMapping
//     public List<Todo> getAllTodos() {
//         return todoService.getAllTodos();
//     }

//     @GetMapping("/{id}")
//     public Todo getTodoById(@PathVariable Long id) {
//         return todoService.getTodoById(id);
//     }

//     @PutMapping("/{id}")
//     public Todo updateTodo(@PathVariable Long id, @RequestBody Todo todo) {
//         return todoService.updateTodo(id, todo);
//     }

//     @DeleteMapping("/{id}")
//     public String deleteTodo(@PathVariable Long id) {
//         todoService.deleteTodo(id);
//         return "Todo deleted successfully";
//     }
// }
