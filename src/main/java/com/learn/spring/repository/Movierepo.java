package com.learn.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.spring.model.Movie;

@Repository
public interface Movierepo extends JpaRepository<Movie,Long>{

}
