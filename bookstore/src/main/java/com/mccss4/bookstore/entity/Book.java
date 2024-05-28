package com.mccss4.bookstore.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "book")
@Data // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @Column(name = "isbn")
    private int isbn;
    @Column(name = "title")
    private String title;
    @Column(name = "image")
    private String imageFileName;
    @Column(name = "author")
    private String author;
    @Column(name = "file")
    private String file;
}
