package com.BookFinderApplication;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

//import com.BookFinderApplication.Todo;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BookFinderController {
	
	@Autowired
	private BookFinderRepository todoService;

	@Autowired
	private BookFinderRepository todoJpaRepository;

	
	@GetMapping("/jpa/users/{username}/notes")
	public List<BookFinderRecords> getAllTodos(@PathVariable String username){
		return todoJpaRepository.findByUsername(username);
		//return todoService.findAll();
	}

	@GetMapping("/jpa/users/{username}/notes/{id}")
	public BookFinderRecords getTodo(@PathVariable String username, @PathVariable long id){
		return todoJpaRepository.findById(id).get();
		//return todoService.findById(id);
	}

	
	@DeleteMapping("/jpa/users/{username}/notes/{id}")
	public ResponseEntity<Void> deleteTodo(
			@PathVariable String username, @PathVariable long id) {

		todoJpaRepository.deleteById(id);

		return ResponseEntity.noContent().build();
	}
	

	
	@PutMapping("/jpa/users/{username}/notes/{id}")
	public ResponseEntity<BookFinderRecords> updateTodo(
			@PathVariable String username,
			@PathVariable long id, @RequestBody BookFinderRecords todo){
		
        todo.setUsername(username);
		
		BookFinderRecords todoUpdated = todoJpaRepository.save(todo);
		
		return new ResponseEntity<BookFinderRecords>(todo, HttpStatus.OK);
	}
	
	@PostMapping("/jpa/users/{username}/notes")
	public ResponseEntity<Void> createTodo(
			@PathVariable String username, @RequestBody BookFinderRecords todo){

		todo.setUsername(username);
		
		BookFinderRecords createdTodo = todoJpaRepository.save(todo);
		
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
		
}
