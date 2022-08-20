package com.kwang.movieapi.data.repository;

import com.kwang.movieapi.data.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<MovieEntity, String> {
}
