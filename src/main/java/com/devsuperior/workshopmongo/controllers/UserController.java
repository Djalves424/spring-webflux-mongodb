package com.devsuperior.workshopmongo.controllers;

import com.devsuperior.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService service;

	/*@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		List<UserDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable String id) {
		UserDTO dto = service.findById(id);
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping(value = "/{id}/posts")
	public ResponseEntity<List<PostDTO>> findPosts(@PathVariable String id) {
		List<PostDTO> list = service.findPosts(id);
		return ResponseEntity.ok().body(list);
	}

	@PostMapping
	public ResponseEntity<UserDTO> insert(@RequestBody UserDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<UserDTO> update(@PathVariable String id, @RequestBody UserDTO dto) {
		dto = service.update(id, dto);
		return ResponseEntity.ok(dto);
	}
	
	@DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }*/
}
