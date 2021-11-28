package com.institute.software.the.orr.kyle.moviesDB.demo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmRepository extends CrudRepository <Film, Integer> {

    @Query("SELECT m from Film m WHERE m.title LIKE %:title%")
    List<Film> searchByTitleLike(@Param("title") String title);
}
