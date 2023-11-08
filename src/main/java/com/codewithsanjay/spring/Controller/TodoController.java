package com.codewithsanjay.spring.Controller;

import com.codewithsanjay.spring.Repository.TodoRepository;

import com.codewithsanjay.spring.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RequestMapping("/api")
@RestController
@CrossOrigin
public class TodoController {
    @Autowired
    TodoRepository todoRepository;

@GetMapping("todo/all")
    public List<Todo> gettodo(){
        return todoRepository.findall();
    }

    @PostMapping("/todo")
    public List<Todo> addtodo(@RequestBody Todo todo){
    return todoRepository.insert(todo);
    }

    @PutMapping("/todo")
    public List<Todo> upadte(@RequestBody Todo todo){
        return todoRepository.update(todo);
    }

    @DeleteMapping ("/todo/{id}")
    public  List<Todo> delete(@PathVariable  int id){
    return todoRepository.delete(id);
    }



}
