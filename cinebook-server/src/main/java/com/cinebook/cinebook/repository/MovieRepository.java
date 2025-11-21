package com.cinebook.cinebook.repository;

import com.cinebook.cinebook.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> { }
