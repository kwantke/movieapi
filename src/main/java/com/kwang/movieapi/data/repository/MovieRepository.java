package com.kwang.movieapi.data.repository;

import com.kwang.movieapi.data.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface MovieRepository extends JpaRepository<MovieEntity, String> {

    List<MovieEntity> findBySection(@Param("section") String section);

    MovieEntity getReferenceById(@Param("id") int id);
}
