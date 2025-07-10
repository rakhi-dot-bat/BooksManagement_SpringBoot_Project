package com.rakhi.BooksManagement.Repository;

import com.rakhi.BooksManagement.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Books,Long> {
}
