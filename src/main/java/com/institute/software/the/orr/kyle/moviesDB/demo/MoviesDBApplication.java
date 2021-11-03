package com.institute.software.the.orr.kyle.moviesDB.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


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

	/////// CREATE Function, enter option below to add film or actor to database using postman and entering values

	@PostMapping("/addFilm")
	public @ResponseBody
	String newFilm(@RequestParam int film_id, @RequestParam int language_id, @RequestParam String title, @RequestParam int length, @RequestParam int releaseyear, @RequestParam String description) {
		Film savedFilm = new Film(film_id, language_id, title, length, releaseyear, description);
		filmRepository.save(savedFilm);
		return "Film Added Successfully";
	}

	@PostMapping("/addActor")
	public @ResponseBody
	String newActor(@RequestParam int actor_id, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String last_update) {
		Actor savedActor = new Actor(actor_id, firstName, lastName, last_update);
		actorRepository.save(savedActor);
		return "Actor Added Successfully";
	}

	///////READ Function, enter option below to see list of all films and select certain films from their ID

	@GetMapping("/films")
	public @ResponseBody Iterable<Film> getAllFilms() {
		return filmRepository.findAll();
}

	@GetMapping("/filmsSearch/{film_id}")
	public @ResponseBody Film findById(@PathVariable("film_id") int film_id) {
		Film filmSearch = filmRepository.findById(film_id).orElse(null);
		return filmSearch;
	}

	///////READ Function, enter option below to see list of all actors and select certain actors from their ID

	@GetMapping("/actors")
	public @ResponseBody
	Iterable<Actor> getAllActors() {
		return actorRepository.findAll();
	}

	@GetMapping("/actorSearch/{actor_id}")
	public @ResponseBody Actor findByActorId(@PathVariable("actor_id") int actor_id) {
		Actor actorSearch = actorRepository.findById(actor_id).orElse(null);
		return actorSearch;
	}

	////// UPDATE Function

//	@PutMapping("/updateFilm{film_id}")
//	public String editFilm(@PathVariable ("film_id") int film_id {
//		filmRepository.setId(film_id);
//		return filmRepository.update(film_id);
//	}

	////// DELETE Function, enter option below to remove film or actor from database

	@DeleteMapping("/removeFilm/{film_id}")
	public String deleteFilm(@PathVariable("film_id") int film_id) {
		filmRepository.deleteById(film_id);
		return "Film Removed Successfully";
	}

	@DeleteMapping("/removeActor/{actor_id}")
	public String deleteActor(@PathVariable("actor_id") int actor_id) {
		actorRepository.deleteById(actor_id);
		return "Actor Removed Successfully";
	}
}