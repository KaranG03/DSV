package com.KaranGautam.DSV_Assignment.service;
import com.KaranGautam.DSV_Assignment.model.Movie;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class MovieService {

    // In-memory storage
    private final List<Movie> movieList = new ArrayList<>();

    // AtomicLong handles ID generation safely
    private final AtomicLong counter = new AtomicLong();

    public Movie addMovie(Movie movie) {
        movie.setId(counter.incrementAndGet());
        movieList.add(movie);
        return movie;
    }

    public Optional<Movie> getMovieById(Long id) {
        return movieList.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst();
    }

    public List<Movie> getAllMovies() {
        return movieList;
    }
}