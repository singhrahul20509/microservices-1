package com.learning.cloud.moviecatalogservice.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Movie {

    private String movieId;
    private String name;

    public Movie(){}
}
