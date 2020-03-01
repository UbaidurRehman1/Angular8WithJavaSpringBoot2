package com.ubaid.BootAngularApp.controller;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ubaid.BootAngularApp.entity.Todo;
import com.ubaid.BootAngularApp.service.TService;

@RestController
@RequestMapping("users")
@CrossOrigin(origins = "http://localhost:4200")
public class TodoController
{
	
	@Autowired
	@Qualifier("todoJPAService")
	TService newService;

	
	//get all
	@GetMapping("{userName}/todos")
	public List<Todo> getAllTodos(@PathVariable String userName)
	{
//		return todoService.getAllTodos(userName);
		List<Todo> todos = newService.getAllTodos(userName);
		System.out.println(Arrays.asList(todos));
		return todos;
	}
	
	//delete one
	@DeleteMapping("{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable int id)
	{
		Todo todo = newService.deleteTodo(username, id);
		System.out.println(todo);
		if(todo != null)
			return ResponseEntity.ok().build();
		return ResponseEntity.notFound().build();
	}
	
	//get one
	@GetMapping("{username}/todos/{id}")
	public Todo getTodo(@PathVariable String username, @PathVariable int id)
	{
		Todo todo = newService.getTodo(username, id);
		System.out.println(todo);
		return todo;
	}
	
	//add
	@PostMapping("{username}/todos")
	public ResponseEntity<Todo> addTodo(@PathVariable String username, @RequestBody Todo todo)
	{
		todo = newService.save(username, todo);
		if(todo != null)
		{
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(todo.getId()).toUri();
			System.out.println(todo);
			return ResponseEntity.created(uri).build();
		}
		return ResponseEntity.unprocessableEntity().build();
	}
	
	//update
	@PutMapping("{username}/todos")
	public ResponseEntity<Todo> updateTodo(@PathVariable String username, @RequestBody Todo todo)
	{
		todo = newService.save(username, todo);
		if (todo != null)
		{
			System.out.println(todo);
			return ResponseEntity.ok(todo);
		}
		return ResponseEntity.notFound().build();
	}
	
}
