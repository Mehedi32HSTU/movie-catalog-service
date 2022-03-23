package com.spring.rest.models;


public class Rating {
	
	private Long movieId;
    private Double rating;
    
	public Rating() {
		
	}

	public Rating(Long movieId, Double rating) {
		this.movieId = movieId;
		this.rating = rating;
	}

	public Long getMovieId() {
		return movieId;
	}

	public Double getRating() {
		return rating;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}
    
    

}
