package com.api.movieinfoservice.resources;

import com.api.movieinfoservice.model.Movie;
import com.api.movieinfoservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    private MovieService movieService;

    @PostMapping("/movie")
    public void saveMovie(@RequestBody Movie movie)
    {
        movieService.saveMovie(movie);
    }
    @GetMapping("/movie/{id}")
    public Movie getMovieById(@PathVariable("id") int movieId)
    {
        return movieService.getMovie(movieId);
    }
}
