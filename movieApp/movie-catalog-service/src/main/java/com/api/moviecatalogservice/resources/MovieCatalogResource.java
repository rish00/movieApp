package com.api.moviecatalogservice.resources;

import com.api.moviecatalogservice.model.CatalogItem;
import com.api.moviecatalogservice.service.movCatService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieCatalogResource {

    @Autowired
    private movCatService service;

    @GetMapping("/catalog/{id}")
    public CatalogItem getCMovieCatalog(@PathVariable("id") int movieId)
    {
        return service.getMovieCatalog(movieId);
    }
}
