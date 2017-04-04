package com.example.dao;

import com.example.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by huanglei on 17/4/4.
 */
public interface AuthorRepository extends JpaRepository<Author,Long>{

    List<Author> findAll();

    @Query("from Author where id = :id")
    Author findAuthor(@Param("id") Long id);
}
