package com.in28minutes.spring.basics.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book(1l, "Master Spring Famework 5.1", "in28minutes"));
	}

}
