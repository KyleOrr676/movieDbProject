package com.institute.software.the.orr.kyle.moviesDB.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class MoviesDBApplication {

	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private ActorRepository actorRepository;

	public static void main(String[] args) {
		SpringApplication.run(MoviesDBApplication.class, args);
	}

	@GetMapping("/films")
	public @ResponseBody Iterable<Film> getAllFilms(){
		return filmRepository.findAll();
	}

	@GetMapping("/actors")
	public @ResponseBody Iterable<Actor> getAllActors(){
		return actorRepository.findAll();
	}
	@PostMapping("/addFilm")
	public @ResponseBody String addAFilm (@RequestParam String title
			,@RequestParam int releaseyear , @RequestParam int length, @RequestParam String rating, @RequestParam String description) {


		Film savedFilm = new Film(title, releaseyear, length, rating, description);
		filmRepository.save(savedFilm);
		return "Saved";
	}
}