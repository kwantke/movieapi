package com.kwang.movieapi.data.entity;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.kwang.movieapi.data.dto.MovieDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;


import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="movie")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String img;
    private String name;
    private String type;
    private String score;
    private String star;
    private String section;

    public MovieEntity(MovieDto movieDto){
        /*this.id = movieDto.getId();
        this.img = movieDto.getImg();*/
        BeanUtils.copyProperties(movieDto, this);
    }

    public MovieDto toDomain(){
        MovieDto movieDto = new MovieDto();
        movieDto.setId(this.id);
        movieDto.setImg(this.img);
        movieDto.setName(this.name);
        movieDto.setScore(this.score);
        movieDto.setSection(this.section);
        return movieDto;
    }

}
