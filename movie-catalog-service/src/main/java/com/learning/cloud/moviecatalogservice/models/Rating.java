package com.learning.cloud.moviecatalogservice.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Rating {

    private String movieId;
    private int rating;
}
