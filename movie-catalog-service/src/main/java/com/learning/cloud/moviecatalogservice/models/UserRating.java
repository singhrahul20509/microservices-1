package com.learning.cloud.moviecatalogservice.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class UserRating {

    private List<Rating> userRating;

    public UserRating(){}
}
