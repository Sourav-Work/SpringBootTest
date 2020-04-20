package com.springboot.test.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BooksDao {

	public List<Book> getBooks() {
		return Arrays.asList(new Book(1l, "Spring Demo Book", "Sourav"));
	}

}
