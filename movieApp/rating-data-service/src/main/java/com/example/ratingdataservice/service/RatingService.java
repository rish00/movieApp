package com.example.ratingdataservice.service;

import com.example.ratingdataservice.model.Rating;
import com.example.ratingdataservice.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    public void saveRating(Rating rating)
    {
        ratingRepository.save(rating);
    }

    public Rating getRating(int userId)
    {
        return ratingRepository.findById(userId);
    }

}
