package com.institute.software.the.orr.kyle.moviesDB.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class MoviesDBApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesDBApplication.class, args);
	}

	@GetMapping("/getfilm")
	public String filmResponse() {
		Film film = new Film("Star Wars", "Sci-Fi", 124);
		return film.getJsonObjectOfFilm();
	}
}