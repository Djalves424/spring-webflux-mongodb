package com.devsuperior.workshopmongo.controllers;

import com.devsuperior.workshopmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/posts")
public class PostController {

	@Autowired
	private PostService service;

	/*@GetMapping(value = "/{id}")
	public ResponseEntity<PostDTO> findById(@PathVariable String id) {
		PostDTO dto = service.findById(id);
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping(value = "/titlesearch")
	public ResponseEntity<List<PostDTO>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) throws UnsupportedEncodingException {
		text = URL.decodeParam(text);
		List<PostDTO> list = service.findByTitle(text);
		return ResponseEntity.ok(list);
	}
	
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
