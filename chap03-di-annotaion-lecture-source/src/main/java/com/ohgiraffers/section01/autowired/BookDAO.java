package com.ohgiraffers.section01.autowired;

import com.ohgiraffers.section01.autowired.subsection01.field.BookDTO;

import java.util.List;

public interface BookDAO {
    List<BookDTO> selectBookList();

    BookDTO selectOneBook(int sequence);
}
