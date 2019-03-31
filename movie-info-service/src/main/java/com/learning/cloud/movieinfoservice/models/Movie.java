package com.learning.cloud.movieinfoservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Movie {

    private String movieId;
    private String name;
}
