package com.learning.cloud.moviecatalogservice.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class CatalogItem {

    private String name;
    private String desc;
    private int rating;

    public CatalogItem(){}
}
