package com.spring.rest.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.rest.models.CatalogItem;
import com.spring.rest.models.Movie;
import com.spring.rest.models.Rating;
import com.spring.rest.models.UserRating;


@RestController
@RequestMapping("/catalog")
public class CatalogController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/{userId}")
	public ResponseEntity<?> getCatalog(@PathVariable("userId") String userId){
		
//		get All rated movie Ids
		UserRating userRating = restTemplate.getForObject("http://localhost:8083/rating/user/"+userId, UserRating.class);

		List<CatalogItem> movieCatalogs =new ArrayList<>();
		
		for(Rating rating : userRating.getRatings()) {
//			for each movie id, call movie info service and get details
			Movie movie =  restTemplate.getForObject("http://localhost:8082/movie/" + rating.getMovieId(),Movie.class);
//			put them all together
			movieCatalogs.add(new CatalogItem( movie.getMovieName(), "Hello Description for : " + movie.getMovieName(),rating.getRating()));
		}
		return ResponseEntity.ok().body(movieCatalogs);
	}



}
