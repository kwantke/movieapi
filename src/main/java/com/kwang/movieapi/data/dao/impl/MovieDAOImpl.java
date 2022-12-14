package com.kwang.movieapi.data.dao.impl;

import com.kwang.movieapi.data.dao.MovieDAO;
import com.kwang.movieapi.data.entity.MovieEntity;
import com.kwang.movieapi.data.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieDAOImpl implements MovieDAO {

    MovieRepository movieRepository;

    @Autowired
    public MovieDAOImpl(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @Override
    public List<MovieEntity> getMovieListEntity(String section) {
        List<MovieEntity> movieEntityList = movieRepository.findBySection(section);
        return movieEntityList;
    }

    @Override
    public MovieEntity getMovieEntity(int id) {
        MovieEntity movieEntity = movieRepository.getReferenceById(id);

        return movieEntity;
    }
}
