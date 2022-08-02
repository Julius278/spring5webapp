package guru.springframework.spring5webapp.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.repositories.AuthorRepository;

@RestController
public class AuthorRestController {

	@Autowired
	private final AuthorRepository authorRepository;

	public AuthorRestController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	
	@GetMapping("rest/authors")
	public ArrayList<Author> getBooks() {
		return (ArrayList<Author>) authorRepository.findAll();
	}
}
