package com.devsuperior.workshopmongo.repositories;

import com.devsuperior.workshopmongo.entities.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {

}
