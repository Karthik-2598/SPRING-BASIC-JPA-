package com.learn.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.learn.spring.model.*;

@Repository
public interface bookrepo extends MongoRepository<Book,Integer>{

}
