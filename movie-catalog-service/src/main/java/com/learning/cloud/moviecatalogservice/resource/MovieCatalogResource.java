package com.learning.cloud.moviecatalogservice.resource;

import com.learning.cloud.moviecatalogservice.models.CatalogItem;
import com.learning.cloud.moviecatalogservice.models.Movie;
import com.learning.cloud.moviecatalogservice.models.Rating;
import com.learning.cloud.moviecatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
        System.out.println("userId = "+userId);
        UserRating ratings = restTemplate.getForObject("http://localhost:8083/ratingsdata/users/"+userId, UserRating.class);
        if(ratings != null) {
            System.out.println(ratings.toString());
        }else{
            return null;
        }

        return ratings.getUserRating().stream().map(rating -> {
           // for each movie id call movieinfo service and get details
           Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);

           // put them all together
           return new CatalogItem(movie.getName(), "description", rating.getRating());
        }).collect(Collectors.toList());
    }
}
