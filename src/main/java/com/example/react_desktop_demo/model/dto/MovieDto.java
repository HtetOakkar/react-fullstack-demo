package com.example.react_desktop_demo.model.dto;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieDto {
	private Long id;
	private String title;
	private String description;
	private String rating;
	private String releaseDate;
	private Instant createdAt;
	private Instant updatedAt;
}
