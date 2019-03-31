package com.learning.cloud.ratingdataservice.resource;

import com.learning.cloud.ratingdataservice.models.Rating;
import com.learning.cloud.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return Rating.builder()
                .movieId(movieId).rating(6)
                .build();
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
        System.out.println("userId = "+userId);
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 3)
        );
        UserRating userRating =  UserRating.builder()
                .userRating(ratings)
                .build();

        System.out.println("going to return userRating = "+userRating);
        return userRating;
    }
}
