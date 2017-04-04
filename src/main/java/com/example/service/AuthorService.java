package com.example.service;

import com.example.dao.AuthorRepository;
import com.example.domain.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by huanglei on 17/4/4.
 */
@Service("authorService")
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAll(){
        return this.authorRepository.findAll();
    }

    public Author findAuthor(Long id){
        return this.authorRepository.findAuthor(id);
    }
}
