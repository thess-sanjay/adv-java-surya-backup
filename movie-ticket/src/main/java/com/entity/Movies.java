package com.entity;

import jakarta.persistence.Entity;

@Entity
public class Movies {

	private int id;
	private String movieName;
	private String timing;
	
 
	public Movies(int id, String movieName, String timing) {
		this.id = id;
		this.movieName = movieName;
		this.timing = timing;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getTiming() {
		return timing;
	}


	public void setTiming(String timing) {
		this.timing = timing;
	}
	
	
	
}
