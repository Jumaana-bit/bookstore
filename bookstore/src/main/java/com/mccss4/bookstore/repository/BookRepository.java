package com.mccss4.bookstore.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mccss4.bookstore.entity.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer>{
    List<Book> findByTitleContainingOrAuthorContaining(String titleKeyword, String authorKeyword);
}
