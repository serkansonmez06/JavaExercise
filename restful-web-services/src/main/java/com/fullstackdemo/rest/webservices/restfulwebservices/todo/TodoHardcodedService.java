package com.fullstackdemo.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "serkan","code", new Date(), false ));
		todos.add(new Todo(++idCounter, "serkan","enjoy", new Date(), false ));
		todos.add(new Todo(++idCounter, "serkan","make money", new Date(), false ));
	}
	
	public List<Todo> findAll() {
		return todos;
	}	
}
