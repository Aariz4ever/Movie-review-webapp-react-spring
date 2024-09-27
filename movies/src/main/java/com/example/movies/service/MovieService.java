package com.example.movies.service;

import com.example.movies.model.Movie;
import com.example.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//here will be the data accessing methods from db

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    // Optional : if the id doesn't exist means it must return null
    public Optional<Movie> getMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
