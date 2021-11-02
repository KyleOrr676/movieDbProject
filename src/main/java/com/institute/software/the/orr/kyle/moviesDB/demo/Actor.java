package com.institute.software.the.orr.kyle.moviesDB.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name ="actor")
public class Actor {

    @Id
    private int actor_id;
    @Column(name= "first_name")
    private String FirstName;
    @Column(name= "last_name")
    private String LastName;
    private Date last_update;

    public Actor(int actor_id, String firstName, String lastName, Date last_update) {
        this.actor_id = actor_id;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.last_update = last_update;
    }

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

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}