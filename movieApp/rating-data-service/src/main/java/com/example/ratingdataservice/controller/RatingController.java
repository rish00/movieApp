package com.example.ratingdataservice.controller;

import com.example.ratingdataservice.model.Rating;
import com.example.ratingdataservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RatingController {
    @Autowired
    private RatingService service;

    @PostMapping("/rating")
    public void saveRating(@RequestBody Rating rating)
    {
        service.saveRating(rating);
    }
    @GetMapping("/rating/{id}")
    public Rating getRating(@PathVariable("id") int userId)
    {
        return service.getRating(userId);
    }
}
