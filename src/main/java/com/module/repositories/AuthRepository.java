package com.module.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.module.beans.User;

@Repository
public interface AuthRepository extends MongoRepository<User, String>{

	public User findByUser(String user);
}
