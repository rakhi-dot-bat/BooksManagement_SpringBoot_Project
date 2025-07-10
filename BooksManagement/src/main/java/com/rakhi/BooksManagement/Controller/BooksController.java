package com.rakhi.BooksManagement.Controller;

import com.rakhi.BooksManagement.Model.Books;
import com.rakhi.BooksManagement.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/books")
public class BooksController {

    @Autowired
    BookServiceImpl service;

    @GetMapping("/")
    public ResponseEntity<List> getBooks()
    {
        List<Books> allBooks = new ArrayList();
        allBooks = service.getAllBooks();
        return  ResponseEntity.status(HttpStatus.FOUND).body(allBooks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Books> getBookById(@PathVariable Long id)
    {
        return ResponseEntity.status(HttpStatus.OK).body(service.getBookById(id));
    }

    @PostMapping("/")
    public ResponseEntity<Books> save(@RequestBody Books books)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveBook(books));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id)
    {
        if(service.deleteBook(id)!= null)
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Deleted successfully");
        else
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("NO SUCH DATA");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Books book)
    {
        return ResponseEntity.status(HttpStatus.OK).body(service.updateBook(book,id));
    }
}
