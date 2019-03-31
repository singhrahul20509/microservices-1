package com.learning.cloud.ratingdataservice.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserRating {

    private List<Rating> userRating;
}
