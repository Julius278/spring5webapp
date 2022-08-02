package guru.springframework.spring5webapp.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.repositories.BookRepository;

@RestController
public class BookRestController {

	@Autowired
	private final BookRepository bookRepository;

	public BookRestController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("rest/example")
	public String getExampleString() {
		return "books/list";
	}
	
	@GetMapping("rest/books")
	public ArrayList<Book> getBooks() {
		return (ArrayList<Book>) bookRepository.findAll();
	}
}
