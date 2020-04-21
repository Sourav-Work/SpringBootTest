package com.springboot.test.demo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootTestApplication.class)
public class BooksServiceSpringTest {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(BooksServiceSpringTest.class);

	@Autowired
	BooksService booksService;

	@Test
	public void getAllBooks() throws Exception {
		List<Book> bookList = booksService.getBooksFromDao();
		LOGGER.info("{}",bookList);
		Assert.assertEquals(1l, bookList.get(0).getId());
	}

}
