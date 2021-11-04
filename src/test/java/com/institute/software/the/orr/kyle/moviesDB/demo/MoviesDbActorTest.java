package com.institute.software.the.orr.kyle.moviesDB.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoviesDbActorTest {

	@Test
	public void testGetActorIDMethod(){
		Actor testActor = new Actor (205, "Daniel", "Radcliffe", "2021-11-04");
		assertEquals(205, testActor.getActor_id(), "The actor ID is not 205");
	}
	@Test
	public void testSetActorIDMethod(){
		int actorID = 205;
		Actor testActor = new Actor (205, "Daniel", "Radcliffe", "2021-11-08");
		testActor.setActor_id(205);
		assertEquals(205, testActor.getActor_id(), actorID);
	}
    @Test
	public void testGetActorFirstNameMethod(){
		Actor testActor = new Actor (205, "Daniel", "Radcliffe", "2021-11-04");
		assertEquals("Daniel", testActor.getFirstName(), "The actor is not Daniel");
	}
	@Test
	public void testSetActorFirstNameMethod(){
		String firstName = "Daniel";
		Actor testActor = new Actor (205, "Daniel", "Radcliffe", "2021-11-08");
		testActor.setFirstName("Daniel");
		assertEquals("Daniel", testActor.getFirstName(), firstName);
	}
	@Test
	public void testGetActorLastNameMethod(){
		Actor testActor = new Actor (205, "Daniel", "Radcliffe", "2021-11-04");
		assertEquals("Radcliffe", testActor.getLastName(), "The actor is not Mr Radcliffe");
	}
	@Test
	public void testSetActorLastNameMethod(){
		String lastName = "Radcliffe";
		Actor testActor = new Actor (205, "Daniel", "Radcliffe", "2021-11-08");
		testActor.setLastName("Radcliffe");
		assertEquals("Radcliffe", testActor.getLastName(), lastName);
	}
}