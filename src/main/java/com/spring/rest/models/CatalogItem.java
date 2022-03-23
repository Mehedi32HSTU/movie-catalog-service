package com.spring.rest.models;

public class CatalogItem {
	
	private String name;
	private String description;
	private Double rating;
	
	public CatalogItem() {
		
	}
	public CatalogItem(String name, String description, Double rating) {
		this.name = name;
		this.description = description;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public Double getRating() {
		return rating;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "CatalogItem [name=" + name + ", description=" + description + ", rating=" + rating + "]";
	}
	
	
}
