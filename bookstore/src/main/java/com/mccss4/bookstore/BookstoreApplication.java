package com.mccss4.bookstore;

import com.mccss4.bookstore.entity.Book;
import com.mccss4.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan("com.mccss4.bookstore")
@EntityScan("com.mccss4.bookstore.entity")
public class BookstoreApplication {

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public ApplicationRunner initializeBooks() {
		final Book defaultBook1 = new Book(684801523, "The Great Gatsby", "The_Great_Gatsby_Cover.jpg", "F.Scott Fitzgerald", "greatgatsby.pdf");
		final Book book2 = new Book(755216819, "The Secret Garden", "SecretGarden.jpg", "Frances Burnett","secret-garden.pdf" );
		final Book book3 = new Book(533526942, "Of Mice And Men", "MiceAndMen.jpg", "John Steinbeck", "OfMiceAndMen.pdf");

		return args -> bookRepository.saveAll(Arrays.asList(defaultBook1, book2, book3));
	}

}
