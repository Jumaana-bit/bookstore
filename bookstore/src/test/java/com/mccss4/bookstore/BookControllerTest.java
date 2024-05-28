package com.mccss4.bookstore.controller;

import com.mccss4.bookstore.entity.Book;
import com.mccss4.bookstore.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

class BookControllerTest {

    @Mock
    private BookRepository bookRepository;

    @Mock
    private Model model;

    @InjectMocks
    private BookController bookController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testShowBooks() {
        // Prepare data
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Author 1", "Image 1", "Title 1", "File 1"));
        books.add(new Book(2, "Author 2", "Image 2", "Title 2", "File 2"));

        // Mock behavior
        when(bookRepository.findAll()).thenReturn(books);

        // Perform test
        String viewName = bookController.showBooks(model);

        // Verify interactions and assertions
        verify(bookRepository, times(1)).findAll();
        verify(model, times(1)).addAttribute("books", books);
        assertEquals("index", viewName);
    }

    @Test
    void testReadBook() {
        // Prepare data
        Book book = new Book(1, "Author 1", "Image 1", "Title 1", "File 1");
        int id = 1;

        // Mock behavior
        when(bookRepository.findById(id)).thenReturn(Optional.of(book));

        // Perform test
        String viewName = bookController.readBook(model, id);

        // Verify interactions and assertions
        verify(bookRepository, times(1)).findById(id);
        verify(model, times(1)).addAttribute("book", book);
        assertEquals("read", viewName);
    }
}
