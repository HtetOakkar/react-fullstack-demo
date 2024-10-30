package com.example.react_desktop_demo.service.impl;

import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import com.example.react_desktop_demo.exception.RecordNotFoundException;
import com.example.react_desktop_demo.model.dto.MovieDto;
import com.example.react_desktop_demo.model.entity.Movie;
import com.example.react_desktop_demo.model.mapper.MovieMapper;
import com.example.react_desktop_demo.repository.MovieRepository;
import com.example.react_desktop_demo.service.MovieService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService{
	
	private final MovieRepository movieRepository;
	
	private final MovieMapper movieMapper;
	
	@Override
	public MovieDto createMovie(MovieDto request) {
		Movie movie = Movie.builder()
							.title(request.getTitle())
							.description(request.getDescription())
							.releaseDate(request.getReleaseDate())
							.rating(request.getRating())
							.build();
		Movie savedMovie = movieRepository.save(movie);
		return movieMapper.toDto(savedMovie);
	}

	@Override
	public MovieDto getMovie(Long id) {
		Movie movie = movieRepository.findById(id)
				.orElseThrow(() -> new RecordNotFoundException("Movie not found. ID : " + id));
		return movieMapper.toDto(movie);
	}

}
