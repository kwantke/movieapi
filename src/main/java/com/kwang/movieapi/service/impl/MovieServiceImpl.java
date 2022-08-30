package com.kwang.movieapi.service.impl;

import com.kwang.movieapi.data.dao.MovieDAO;
import com.kwang.movieapi.data.dto.MovieDto;
import com.kwang.movieapi.data.entity.MovieEntity;
import com.kwang.movieapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {

    MovieDAO movieDAO;

    @Autowired
    public MovieServiceImpl(MovieDAO movieDAO){
        this.movieDAO = movieDAO;
    }

    @Override
    public List<MovieDto> getMovieList(String section) {
        List<MovieEntity> movieEntityList = movieDAO.getMovieListEntity(section);

        //return movieEntityList.stream().map(movieEntity -> movieEntity.toDomain()).collect(Collectors.toList());
        return movieEntityList.stream().map(MovieEntity::toDomain).collect(Collectors.toList());
    }
}
