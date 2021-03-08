package com.homeworkmod3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.homeworkmod3.model.Movies;

@RestController
public class MoviesController {

	@GetMapping("/movies")
	public Movies[] getAllMovies() {
		
		 String url = "https://my.api.mockaroo.com/movie.json?key=bb299fd0";

	     RestTemplate restTemplate = new RestTemplate();

	     Movies [] response  = null;

	      response = restTemplate.getForObject(url, Movies[].class);
	      
	      System.out.println(response[0]);
	      
	      return response;
	}
	
}
