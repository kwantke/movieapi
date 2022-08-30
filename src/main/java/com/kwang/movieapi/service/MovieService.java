package com.kwang.movieapi.service;

import com.kwang.movieapi.data.dto.MovieDto;
import org.springframework.stereotype.Component;

import java.util.List;


public interface MovieService {

    public List<MovieDto> getMovieList(String section);

}
