package com.example.ratingdataservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rating {
    @Id
    private int userId;
    private int rating;
    private int movieId;

    public Rating() {
    }

    public Rating(int userId, int rating, int movieId) {
        this.userId = userId;
        this.rating = rating;
        this.movieId = movieId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}
