package com.spring.rest.models;

public class Movie {
	
	private Long movieId;
	private String movieName;
	
	
	public Movie() {
		
	}
	public Movie(Long movieId, String movieName) {
		this.movieId = movieId;
		this.movieName = movieName;
	}
	public Long getMovieId() {
		return movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + "]";
	}
	
	

}
