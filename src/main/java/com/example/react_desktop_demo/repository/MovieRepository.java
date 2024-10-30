package com.example.react_desktop_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.react_desktop_demo.model.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
