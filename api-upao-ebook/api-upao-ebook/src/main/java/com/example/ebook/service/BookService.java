package com.example.ebook.service;

import com.example.ebook.model.Book;

import java.util.List;

public interface BookService {

    Book createBook(Book book);
    List<Book> getAllBooks();
}
