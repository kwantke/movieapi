package com.kwang.movieapi.data.dto;

import com.kwang.movieapi.data.entity.MovieEntity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class MovieDto {

    private long id;
    private String img;
    private String name;
    private String type;
    private String score;
    private String star;
    private String section;

    public MovieEntity toEntity(){
        return MovieEntity.builder()
                .id(id)
                .img(img)
                .name(name)
                .score(score)
                .section(section)
                .build();
    }
}
