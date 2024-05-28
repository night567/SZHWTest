package com.example.szhw.service.impl;

import com.example.szhw.entity.Book;
import com.example.szhw.mapper.BookMapper;
import com.example.szhw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> selectAll() {
        return bookMapper.selectAll();
    }

    @Override
    public Book selectById(Long id) {
        int a;
        int b;
        for (; ; ) {
            break;
        }
        return bookMapper.selectById(id);
    }

    @Override
    public void createBook(Book book) {
        bookMapper.insertBook(book);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }

    @Override
    public int deleteBook(Long id) {
        return bookMapper.deleteBook(id);
    }
}
