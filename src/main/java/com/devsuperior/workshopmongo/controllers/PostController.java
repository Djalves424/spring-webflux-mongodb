package com.devsuperior.workshopmongo.controllers;

import com.devsuperior.workshopmongo.controllers.util.URL;
import com.devsuperior.workshopmongo.dto.PostDTO;
import com.devsuperior.workshopmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping(value = "/posts")
public class PostController {

    @Autowired
    private PostService service;

    @GetMapping(value = "/{id}")
    public Mono<ResponseEntity<PostDTO>> findById(@PathVariable String id) {
        return service.findById(id).map(postDTO -> ResponseEntity.ok().body(postDTO));
    }

    @GetMapping(value = "/titlesearch")
    public Flux<PostDTO> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) throws UnsupportedEncodingException {
        text = URL.decodeParam(text);
        return service.findByTitle(text);
    }

	/*

	@GetMapping(value = "/fullsearch")
	public ResponseEntity<List<PostDTO>> fullSearch(
			@RequestParam(value = "text", defaultValue = "") String text,
			@RequestParam(value = "minDate", defaultValue = "") String minDate,
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate) throws UnsupportedEncodingException, ParseException {
		
		text = URL.decodeParam(text);
		Instant min = URL.convertDate(minDate, Instant.EPOCH);
		Instant max = URL.convertDate(maxDate, Instant.now());
		
		List<PostDTO> list = service.fullSearch(text, min, max);
		return ResponseEntity.ok(list);
	}*/
}
