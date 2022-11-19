package com.kwang.movieapi;

import com.kwang.movieapi.data.dto.MovieDto;
import com.kwang.movieapi.service.MovieService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import java.util.List;

@SpringBootTest
class MovieapiApplicationTests {

    @Autowired
    private Environment environment;

    @Autowired
    private MovieService movieService;




    @Test
    void contextLoads() {

        List<MovieDto> movieDtoList = movieService.getMovieList("2");
        System.out.println("Profile값 : "+ environment.getProperty("spring.profiles.active"));
        //No imple needed as we are simply loading the context
    }
    @Test
    void getMovie(){
        MovieDto movie = movieService.getMovie(2);
        System.out.println(movie.toString());
    }

}
