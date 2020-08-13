package com.atroam.mangomanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.atroam.mangomanagement.model.Intense;

public interface IntenseRepository extends MongoRepository<Intense, Integer> {

}
