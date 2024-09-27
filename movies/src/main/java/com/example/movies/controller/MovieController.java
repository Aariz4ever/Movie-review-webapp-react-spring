package com.example.movies.controller;

import com.example.movies.model.Movie;
import com.example.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>>(movieService.getAllMovies(), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getMovie(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Movie>>(movieService.getMovie(imdbId), HttpStatus.OK);
    }
}
