package com.qa.persistence.repository;

public interface MovieRepository {

	String getAllMovies();

	String addMovie(String movie);

	String deleteMovie(Long id);
	
	String getMovie(Long id);
	
	String updateMovie(Long id);
}
