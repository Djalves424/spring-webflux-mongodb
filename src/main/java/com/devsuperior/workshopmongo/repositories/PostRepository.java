package com.devsuperior.workshopmongo.repositories;

import com.devsuperior.workshopmongo.entities.Post;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

import java.time.Instant;

public interface PostRepository extends ReactiveMongoRepository<Post, String> {

    @Query("{ 'user' : ?0 }")
    Flux<Post> findByUser(Object id);

    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    Flux<Post> searchTitle(String text);

    Flux<Post> findByTitleContainingIgnoreCase(String text);

    @Query("{ $and: [ { date: {$gte: ?1} }, { date: { $lte: ?2} } , { $or: [ { 'title': { $regex: ?0, $options: 'i' } }, { 'body': { $regex: ?0, $options: 'i' } }, { 'comments.text': { $regex: ?0, $options: 'i' } } ] } ] }")
    Flux<Post> fullSearch(String text, Instant minDate, Instant maxDate);
}
