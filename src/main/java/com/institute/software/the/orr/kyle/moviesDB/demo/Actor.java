package com.institute.software.the.orr.kyle.moviesDB.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="actor")
public class Actor {

/////// Attributes

    @Id
    @Column(name= "actor_id")
    private int actor_id;
    @Column(name= "first_name")
    private String FirstName;
    @Column(name= "last_name")
    private String LastName;
    @Column(name= "last_update")
    private String last_update;

/////// Constructor

    public Actor(int actor_id, String firstName, String lastName, String last_update) {
        this.actor_id = actor_id;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.last_update = last_update;
    }

/////// Getters and Setters

    public Actor(){
    }
    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
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

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}