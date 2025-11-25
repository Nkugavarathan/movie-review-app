package com.cinebook.cinebook.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieRequestDTO {
    private String title;
    private String description;
    private String posterUrl;
    private String trailerUrl;
    private double duration;
    private String genre;
    private String language;
}

