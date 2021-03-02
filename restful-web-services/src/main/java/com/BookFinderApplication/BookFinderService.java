package com.BookFinderApplication;

import java.util.ArrayList;
import java.util.List;



public class BookFinderService {
private static List<BookFinderRecords> todos = new ArrayList<>();
private static long idCounter = 0;



public List<BookFinderRecords> findAll() {
	return todos;
}

public BookFinderRecords save(BookFinderRecords todo) {
	if(todo.getId()==-1 || todo.getId()==0) {
		todo.setId(++idCounter);
		todos.add(todo);
	} else {
		deleteById(todo.getId());
		todos.add(todo);
	}
	return todo;
}

public BookFinderRecords deleteById(long id) {
	BookFinderRecords todo = findById(id);

	if (todo == null)
		return null;

	if (todos.remove(todo)) {
		return todo;
	}

	return null;
}

public BookFinderRecords findById(long id) {
	for (BookFinderRecords todo : todos) {
		if (todo.getId() == id) {
			return todo;
		}
	}

	return null;
}

}






















//
//
//import java.net.URI;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//@CrossOrigin(origins = "http://localhost:4200")
//@RestController
//public class BookFinderService {
//
//	@Autowired
//    private TodoHardcodedService todoService;
//
//	@GetMapping("/users/{username}/todos")
//	public List<BookFinderRecord> getAllTodos(@PathVariable String username) {
//		// Thread.sleep(3000);
//		return todoService.findAll();
//	}
//	
//	@GetMapping("/users/{username}/todos/{id}")
//	public BookFinderRecord getTodo(@PathVariable String username, @PathVariable long id) {
//		// Thread.sleep(3000);
//		return todoService.findById(id);
//	}
//
//
//	// DELETE /users/{username}/todos/{id}
//	@DeleteMapping("/users/{username}/todos/{id}")
//	public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id) {
//
//		BookFinderRecord todo = todoService.deleteById(id);
//
//		if (todo != null) {
//			return ResponseEntity.noContent().build();
//		}
//
//		return ResponseEntity.notFound().build();
//	}
//	
//	//Edit/Update a Todo
//	//PUT /users/{user_name}/todos/{todo_id}
//	@PutMapping("/users/{username}/todos/{id}")
//	public ResponseEntity<BookFinderRecord> updateTodo(
//			@PathVariable String username,
//			@PathVariable long id, @RequestBody BookFinderRecord todo){
//		
//		BookFinderRecord todoUpdated = todoService.save(todo);
//		
//		return new ResponseEntity<BookFinderRecord>(todo, HttpStatus.OK);
//	}
//	
//	@PostMapping("/users/{username}/todos")
//	public ResponseEntity<Void> updateTodo(
//			@PathVariable String username, @RequestBody BookFinderRecord todo){
//		
//		BookFinderRecord createdTodo = todoService.save(todo);
//		
//		//Location
//		//Get current resource url
//		///{id}
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
//				.path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
//		
//		return ResponseEntity.created(uri).build();
//	}
//		
//}