package com.rakhi.BooksManagement.service;

import com.rakhi.BooksManagement.Model.Books;
import com.rakhi.BooksManagement.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepo bookRepo;

    @Override
    public List<Books> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Books saveBook(Books book) {
        return bookRepo.save(book);
    }

    @Override
    public Books updateBook(Books book, Long id) {
        if(!bookRepo.existsById(id))
        {
            throw new RuntimeException("No such book present in db for id :" + id);
        }
        else {
            Books b = new Books();
            b=bookRepo.findById(id).get();
            b.setTitle(book.getTitle());
            b.setPages(book.getPages());
            b.setAuthor(book.getAuthor());
            return bookRepo.save(b);
        }


    }

    @Override
    public Boolean deleteBook(Long id) {
        if(!bookRepo.existsById(id)) {
            throw new RuntimeException("no such book present with id "+id);
        }
        else {
            bookRepo.deleteById(id);
            return true;
        }

    }

    @Override
    public Books getBookById(Long id) {
        return bookRepo.findById(id)
                        .orElseThrow(()-> new RuntimeException("Book not present"));
    }
}
