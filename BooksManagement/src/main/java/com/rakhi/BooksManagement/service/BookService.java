package com.rakhi.BooksManagement.service;

import com.rakhi.BooksManagement.Model.Books;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public interface BookService {

    public List<Books> getAllBooks();
    public Books saveBook(Books book);
    public Books updateBook(Books book, Long id);
    public Boolean deleteBook(Long id);
    public Books getBookById(Long id);

}
