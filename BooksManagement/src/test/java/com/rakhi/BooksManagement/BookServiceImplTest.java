package com.rakhi.BooksManagement;

import com.rakhi.BooksManagement.Model.Books;
import com.rakhi.BooksManagement.service.BookServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceImplTest {

    @Autowired
    BookServiceImpl service;

    @Test
    void saveBookTest()
    {
        Books book = new Books();
        book.setAuthor("Naruto");
        book.setPages(500);
        book.setTitle("Naruto Uzumaki");
        Books saved = service.saveBook(book);
        Assertions.assertNotNull(saved.getId());
    }
}
