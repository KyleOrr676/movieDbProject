package com.institute.software.the.orr.kyle.moviesDB.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="actor")
public class Actor {

    private String FirstName;
    private String LastName;
    @Id
    private int actor_id;

    public Actor(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public Actor(){
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}