package com.example.szhw.service;

import com.example.szhw.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> selectAll();

    Book selectById(Long id);
    void createBook(Book book);
    void updateBook(Book book);
    int deleteBook(Long id);
}
