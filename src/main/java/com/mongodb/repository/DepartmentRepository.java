package com.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.entity.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

}
