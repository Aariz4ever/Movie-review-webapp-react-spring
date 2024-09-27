package com.example.movies.repository;

import com.example.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//it is a repo of all methods and functions for data queries in db

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String imdbId);
}
