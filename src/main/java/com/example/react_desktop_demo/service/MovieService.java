package com.example.react_desktop_demo.service;

import com.example.react_desktop_demo.model.dto.MovieDto;

public interface MovieService {

	MovieDto createMovie(MovieDto request);

	MovieDto getMovie(Long id);

}
