package com.learning.cloud.ratingdataservice.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Rating {

    private String movieId;
    private int rating;
}
