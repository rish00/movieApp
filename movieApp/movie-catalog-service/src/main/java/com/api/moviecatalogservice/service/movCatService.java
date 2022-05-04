package com.api.moviecatalogservice.service;

import com.api.moviecatalogservice.Movie;
import com.api.moviecatalogservice.Rating;
import com.api.moviecatalogservice.model.CatalogItem;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class movCatService {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "getFallbackCatalog")
    public CatalogItem getMovieCatalog(int movieId)
    {
        Movie movie = restTemplate
                .getForObject("http://movie-info-service/movie/"+movieId, Movie.class);

        Rating rating = restTemplate
                .getForObject("http://rating-data-service/rating/"+movieId, Rating.class);

        CatalogItem catalogItem = new CatalogItem();
        catalogItem.setId(movieId);
        catalogItem.setDescription(movie.getDescription());
        catalogItem.setName(movie.getName());
        catalogItem.setRating(rating.getRating());

        return catalogItem;

    }
    public CatalogItem getFallbackCatalog(int movieId)
    {
        CatalogItem catalogItem = new CatalogItem();
        catalogItem.setId(0);
        catalogItem.setDescription("");
        catalogItem.setName("");
        catalogItem.setRating(0);
        return catalogItem;
    }
}
