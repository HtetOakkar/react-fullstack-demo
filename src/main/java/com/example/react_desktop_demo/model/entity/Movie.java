package com.example.react_desktop_demo.model.entity;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private String releaseDate;
	
	@Column
	private String rating;
	
	@CreationTimestamp
	@Column(updatable = false)
	private Instant cratedAt;
	
	@UpdateTimestamp
	@Column
	private Instant updatedAt;
	
}
