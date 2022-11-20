package com.kwang.movieapi.controller;


import com.kwang.movieapi.data.dto.MovieDto;
import com.kwang.movieapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
        //List<MovieDto> movieDtoList = movieService.getMovieList();

        //System.out.println(movieDtoList.toString());


        List list = new ArrayList();

        return list ;
    }

    @GetMapping(value="/movieList")
    public List<MovieDto> getMovieList(@RequestParam String section){
        List<MovieDto> movieDtoList = movieService.getMovieList(section);
        System.out.println(movieDtoList.toString());
        return movieDtoList;
    }

    @GetMapping(value="/movie")
    public MovieDto getMovie(@RequestParam int id){
        MovieDto movieDto = movieService.getMovie(id);

        System.out.println("chang to commit on dev");

        return movieDto;
    }
}