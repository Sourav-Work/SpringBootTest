package com.springboot.test.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
	
	@Autowired
	BooksDao bookDao;
	
	public List<Book> getBooksFromDao(){
		return bookDao.getBooks();
	}

}
