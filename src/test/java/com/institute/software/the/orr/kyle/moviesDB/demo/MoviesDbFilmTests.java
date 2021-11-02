package com.institute.software.the.orr.kyle.moviesDB.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MoviesDbFilmTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void testGetFilmLengthMethod(){
		Film testFilm = new Film ("Harry Potter", 128, 2001, "PG", "A Fantasy film starring Daniel Radcliffe");
		assertEquals(128, testFilm.getLength(), "The film is not 128 mins long");
	}
	@Test
	public void testSetFilmLengthMethod(){
		int Length = 128;
		Film testFilm = new Film ("Harry Potter", 128, 2001, "PG", "A Fantasy film starring Daniel Radcliffe");
		testFilm.setLength(128);
		assertEquals(128, testFilm.getLength(), Length);
	}
	@Test
	public void testGetFilmTitleMethod(){
		Film testFilm = new Film ("Harry Potter", 128, 2001, "PG", "A Fantasy film starring Daniel Radcliffe");
		assertEquals("Harry Potter", testFilm.getTitle(), "The film is not Harry Potter");
	}
	@Test
	public void testSetFilmTitleMethod(){
		String Title = "Harry Potter";
		Film testFilm = new Film ("Harry Potter", 128, 2001, "PG", "A Fantasy film starring Daniel Radcliffe");
		testFilm.setTitle("Harry Potter");
		assertEquals("Harry Potter", testFilm.getTitle(), Title);
	}
	@Test
	public void testGetFilmReleaseYearMethod(){
		Film testFilm = new Film ("Harry Potter", 128, 2001, "PG", "A Fantasy film starring Daniel Radcliffe");
		assertEquals(2001, testFilm.getReleaseyear(), "The film was not released in 2001");
	}
	@Test
	public void testSetFilmReleaseYearMethod(){
		int ReleaseYear = 128;
		Film testFilm = new Film ("Harry Potter", 128, 2001, "PG", "A Fantasy film starring Daniel Radcliffe");
		testFilm.setReleaseyear(2001);
		assertEquals(2001, testFilm.getReleaseyear(), ReleaseYear);
	}
}