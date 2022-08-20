package com.kwang.movieapi.controller;


import com.kwang.movieapi.data.dto.MovieDto;
import com.kwang.movieapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @PostMapping(value="/movieList")
    public List<MovieDto> postMovieList(){
        List<MovieDto> movieDtoList = movieService.getMovieList();
        System.out.println(movieDtoList.toString());
        return movieService.getMovieList();
    }

    @GetMapping(value="/movieList")
    public List<MovieDto> getMovieList(){
        List<MovieDto> movieDtoList = movieService.getMovieList();
        System.out.println(movieDtoList.toString());
        return movieService.getMovieList();
    }
}