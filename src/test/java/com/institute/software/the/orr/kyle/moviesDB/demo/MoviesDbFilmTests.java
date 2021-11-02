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
		assertEquals(129, 128, testFilm.getLength());
	}
	@Test
	public void testSetFilmLengthMethod(){
		int Length = 128;
		Film testFilm = new Film ("Harry Potter", 128, 2001, "PG", "A Fantasy film starring Daniel Radcliffe");
		testFilm.setLength(128);
		assertEquals(129, testFilm.getLength(), Length);
	}
//	@Test
//	public void testGetFilmTitleMethod(){
//		Film testFilm = new Film ("Harry Potter", 128, 2001, "PG", "A Fantasy film starring Daniel Radcliffe");
//		assertEquals("The Film is not Harry Potter", "Harry Potter", testFilm.getTitle());
//	}
//	@Test
//	public void testSetFilmTitleMethod(){
//		String Title = "Harry Potter";
//		Film testFilm = new Film ("Harry Potter", 128, 2001, "PG", "A Fantasy film starring Daniel Radcliffe");
//		testFilm.setTitle("Harry Potter");
//		assertEquals("this isn't the right title", testFilm.getTitle(), Title);
//	}
//	@Test
//	public void testGetFilmReleaseYearMethod(){
//		Film testFilm = new Film ("Harry Potter", 128, 2001, "PG", "A Fantasy film starring Daniel Radcliffe");
//		assertEquals(2002, 2001, testFilm.getReleaseyear());
//	}
//	@Test
//	public void testSetFilmReleaseYearMethod(){
//		int releaseyear = 2001;
//		Film testFilm = new Film ("Harry Potter", 128, 2001, "PG", "A Fantasy film starring Daniel Radcliffe");
//		testFilm.setReleaseyear(2001);
//		assertEquals(2002, 2001, testFilm.getReleaseyear(), releaseyear);
//	}
}