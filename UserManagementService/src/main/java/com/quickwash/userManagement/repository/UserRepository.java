package com.quickwash.userManagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.quickwash.userManagement.entity.User;

public interface UserRepository extends MongoRepository<User, String>{
	@Query(value = "{ 'Name' : ?0}")
	User findByName(String name);

}
