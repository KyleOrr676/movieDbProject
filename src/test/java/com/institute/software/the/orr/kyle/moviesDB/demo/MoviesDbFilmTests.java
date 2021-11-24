package com.institute.software.the.orr.kyle.moviesDB.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MoviesDbFilmTests {

//	@Test
//	void contextLoads() {
//	}
	@Test
	public void testGetFilmIDMethod(){
		Film testFilm = new Film (1, 1,"Harry Potter", 128, "A Fantasy film starring Daniel Radcliffe");
		assertEquals(1, testFilm.getFilm_id(), "The film ID is not 1");
	}
	@Test
	public void testSetFilmIDMethod(){
		int Film_ID = 1;
		Film testFilm = new Film (1, 1,"Harry Potter", 128, "A Fantasy film starring Daniel Radcliffe");
		testFilm.setFilm_id(1);
		assertEquals(1, testFilm.getFilm_id(), Film_ID);
	}
	@Test
	public void testGetFilmLanguageIDMethod(){
		Film testFilm = new Film(1, 1, "Harry Potter", 128, "A Fantasy film starring Daniel Radcliffe");
		assertEquals(1, testFilm.getLanguage_id(), "The language ID is not 1");
	}
	@Test
	public void testSetFilmLanguageIDMethod(){
		int Language_ID = 1;
		Film testFilm = new Film (1, 1, "Harry Potter", 128, "A Fantasy film starring Daniel Radcliffe");
		testFilm.setLanguage_id(1);
		assertEquals(1, testFilm.getLanguage_id(), Language_ID);
	}
	@Test
	public void testGetFilmTitleMethod(){
		Film testFilm = new Film (1, 1,"Harry Potter", 128, "A Fantasy film starring Daniel Radcliffe");
		assertEquals("Harry Potter", testFilm.getTitle(), "The film is not Harry Potter");
	}
	@Test
	public void testSetFilmTitleMethod(){
		String Title = "Harry Potter";
		Film testFilm = new Film (1, 1, "Harry Potter", 128, "A Fantasy film starring Daniel Radcliffe");
		testFilm.setTitle("Harry Potter");
		assertEquals("Harry Potter", testFilm.getTitle(), Title);
	}
	@Test
	public void testGetFilmLengthMethod(){
		Film testFilm = new Film (1, 1, "Harry Potter", 128, "A Fantasy film starring Daniel Radcliffe");
		assertEquals(128, testFilm.getLength(), "The film is not 128 mins long");
	}
	@Test
	public void testSetFilmLengthMethod(){
		int Length = 128;
		Film testFilm = new Film (1, 1, "Harry Potter", 128, "A Fantasy film starring Daniel Radcliffe");
		testFilm.setLength(128);
		assertEquals(128, testFilm.getLength(), Length);
	}
	@Test
	public void testGetFilmDescriptionMethod(){
		Film testFilm = new Film (1, 1,"Harry Potter", 128, "A Fantasy film starring Daniel Radcliffe");
		assertEquals("A Fantasy film starring Daniel Radcliffe", testFilm.getDescription(), "The film does not star Daniel Radcliffe");
	}
	@Test
	public void testSetFilmDescriptionMethod(){
		String Description = "A Fantasy film starring Daniel Radcliffe";
		Film testFilm = new Film (1, 1,"Harry Potter", 128, "A Fantasy film starring Daniel Radcliffe");
		testFilm.setDescription("A Fantasy film starring Daniel Radcliffe");
		assertEquals("A Fantasy film starring Daniel Radcliffe", testFilm.getDescription(), Description);
	}
}