package com.springboot.test.demo;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BooksServiceTest {

	@InjectMocks
	BooksService booksService;

	@Mock
	BooksDao bookDao;

	@Test
	public void getAllBooks() {
		Mockito.when(bookDao.getBooks()).thenReturn(Arrays.asList(new Book(1l, "Spring Demo Book", "Sourav")));
		List<Book> bookList = booksService.getBooksFromDao();
		Assert.assertEquals(1l, bookList.get(0).getId());
	}

}
