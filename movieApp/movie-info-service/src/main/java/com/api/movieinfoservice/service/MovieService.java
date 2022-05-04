package com.api.movieinfoservice.service;

import com.api.movieinfoservice.model.Movie;
import com.api.movieinfoservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public void saveMovie(Movie movie)
    {
        movieRepository.save(movie);
    }

    public Movie getMovie(int id)
    {
        return movieRepository.findById(id);
    }
}
