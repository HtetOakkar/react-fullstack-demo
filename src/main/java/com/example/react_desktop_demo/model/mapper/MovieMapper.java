package com.example.react_desktop_demo.model.mapper;

import com.example.react_desktop_demo.model.dto.MovieDto;
import com.example.react_desktop_demo.model.entity.Movie;

public interface MovieMapper {

	MovieDto toDto(Movie movie);

}
