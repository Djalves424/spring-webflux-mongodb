package com.devsuperior.workshopmongo.repositories;

import com.devsuperior.workshopmongo.entities.User;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<User, String> {

    @Query("{ 'email': { $regex: ?0, $options: 'i' } }")
    Mono<User> searchEmail(String email);

}
