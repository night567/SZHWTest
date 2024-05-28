package com.example.szhw.Controller;


import com.example.szhw.entity.Book;
import com.example.szhw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/Book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> selectAll(){
        return bookService.selectAll();
    }
    @GetMapping("/{id}")
    public Book selectById(@PathVariable Long id){
        return bookService.selectById(id);
    }

    @PostMapping
    public void createBook(@RequestBody Book book){
        System.out.println(book);
        bookService.createBook(book);
    }
    @PutMapping("")
    public void updateBook( @RequestBody Book book) {
        bookService.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        int check = bookService.deleteBook(id);
        
    }

}
