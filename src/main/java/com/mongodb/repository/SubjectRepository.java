package com.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.entity.Subject;

@Repository
public interface SubjectRepository extends MongoRepository<Subject, String> {

}
