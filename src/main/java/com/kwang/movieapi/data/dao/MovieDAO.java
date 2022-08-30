package com.kwang.movieapi.data.dao;

import com.kwang.movieapi.data.entity.MovieEntity;

import java.util.List;

public interface MovieDAO {
    public List<MovieEntity> getMovieListEntity(String section);
}
