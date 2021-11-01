package com.institute.software.the.orr.kyle.moviesDB.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping("/films")
public class MoviesDBApplication {

	@Autowired
	private FilmRepository filmRepository;

	public static void main(String[] args) {
		SpringApplication.run(MoviesDBApplication.class, args);
	}

	@GetMapping("/all")
	public @ResponseBody Iterable<Film> getAllUsers(){
		return filmRepository.findAll();
	}
}