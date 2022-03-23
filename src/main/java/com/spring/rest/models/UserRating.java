package com.spring.rest.models;

import java.util.List;

public class UserRating {
	
	List<Rating> ratings;

	public UserRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	
}
