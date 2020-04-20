package com.springboot.test.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@Autowired
	BooksService bookService;
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookService.getBooksFromDao();
	}

}
