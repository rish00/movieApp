package com.example.ratingdataservice.repository;

import com.example.ratingdataservice.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating,Integer> {
    Rating findById(int userId);
}
