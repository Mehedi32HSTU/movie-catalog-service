package com.spring.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.models.Movie;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@RequestMapping("/{id}")
	public ResponseEntity<?> getMovie(@PathVariable("id") Long movieId){
		
		Movie movie = new Movie(movieId, "Titanic : "+movieId);
		
		return ResponseEntity.ok().body(movie);
	}

}
