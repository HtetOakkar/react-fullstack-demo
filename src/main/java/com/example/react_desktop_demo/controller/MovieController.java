package com.example.react_desktop_demo.controller;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.react_desktop_demo.model.dto.MovieDto;
import com.example.react_desktop_demo.model.mapper.MovieMapper;
import com.example.react_desktop_demo.service.MovieService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
@Tag(description = "All the api endpoints related with movies", name = "Movie")
public class MovieController {
	private final MovieService movieService;
	private final MovieMapper movieMapper;
	
	
	@Operation(summary = "Create Movie", description = "Add movie details to database.")
	@PostMapping
	public ResponseEntity<MovieDto> postMethodName(@RequestBody MovieDto request) {
		MovieDto movieDto = movieService.createMovie(request);
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/movies/{id}")
				.buildAndExpand(movieDto.getId()).toUri();
		return ResponseEntity.created(uri).body(movieDto);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<MovieDto> getMovie(@PathVariable Long id) {
		MovieDto movieDto = movieService.getMovie(id);
		return ResponseEntity.ok(movieDto);
		
	}
}
