package guru.springframework.spring5webapp.controllers;

import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.repositories.BookRepository;

@RestController
public class BookController {

	@Autowired
	private final BookRepository bookRepository;

	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("books")
	public ArrayList<Book> getBooks() {
		
		//model.addAttribute("books", bookRepository.findAll());
		return (ArrayList<Book>) bookRepository.findAll();
		
//		return "test";
	}
}
