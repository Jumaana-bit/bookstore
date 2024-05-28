package com.mccss4.bookstore.controller;

import com.mccss4.bookstore.entity.Book;
import com.mccss4.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping({"", "/"})
    public String showBooks(Model model){
        List<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "index";
    }

    @GetMapping("/read")
    public String readBook(Model model, @RequestParam int id) {
        Book book = bookRepository.findById(id).get();
        model.addAttribute("book", book);
        return "read";
    }
}
