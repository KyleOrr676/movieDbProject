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
	public void testFilmTitleMethod(){

		Film testFilm = new Film ("Harry Potter and The Chamber of Secrets", 128, 2001, "PG", "A Fantasy film Starring Daniel Radcliffe");
		assertEquals("The Film is not Harry Potter", "Harry Potter", testFilm.getTitle());
	}
	@Test
	public void testFilmLengthMethod(){

		Film testFilm = new Film ("Harry Potter", 128, 2001, "PG", "A Fantasy film starring Daniel Radcliffe");
		assertEquals(129, 128, testFilm.getLength());
	}
}