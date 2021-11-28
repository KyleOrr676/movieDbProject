package com.institute.software.the.orr.kyle.moviesDB.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ActorRepository extends CrudRepository <Actor, Integer> {
//    @Query("SELECT m from Actor m WHERE m.firstName LIKE %:firstName%")
//    List<Actor> searchByfirstNameLike(@Param("firstName") String firstName);
}
