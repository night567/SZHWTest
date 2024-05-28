package com.example.szhw.mapper;

import com.example.szhw.entity.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface BookMapper {

    @Select("select * from book")
    List<Book> selectAll();
    @Select("select * from book where id = #{id}")
    Book selectById(Long id);
    @Insert("INSERT INTO book (name, type, `describe`) VALUES (#{name}, #{type}, #{describe})")
    void insertBook(Book book);

    @Update("UPDATE book SET name = #{name}, type = #{type}, `describe` = #{describe} WHERE id = #{id}")
    void updateBook(Book book);
    @Delete("DELETE FROM book WHERE id = #{id}")
    int deleteBook(Long id);
}
