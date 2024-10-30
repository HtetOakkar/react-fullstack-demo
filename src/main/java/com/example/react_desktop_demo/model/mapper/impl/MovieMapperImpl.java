package com.example.react_desktop_demo.model.mapper.impl;

import org.springframework.stereotype.Component;

import com.example.react_desktop_demo.model.dto.MovieDto;
import com.example.react_desktop_demo.model.entity.Movie;
import com.example.react_desktop_demo.model.mapper.MovieMapper;

@Component
public class MovieMapperImpl implements MovieMapper {

	@Override
	public MovieDto toDto(Movie movie) {

		return movie == null ? null
				: MovieDto.builder().id(movie.getId()).title(movie.getTitle()).description(movie.getDescription())
						.releaseDate(movie.getReleaseDate()).rating(movie.getRating()).createdAt(movie.getCratedAt())
						.updatedAt(movie.getUpdatedAt()).build();
	}

}
