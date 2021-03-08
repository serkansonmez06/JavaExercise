package com.homeworkmod3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;

@JsonIgnoreProperties
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Movies {
	
	private int movie_id;
	private String title;
	private String director;
	private int year;
	private String genre;

}
