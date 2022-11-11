package com.test.service;

import com.test.entity.Book;

/**
 * 书籍Service
 *
 * @Auther wh
 * @Date 2022/11/11 8:58
 */
public interface BookService {
    
    Book getBookById(int bid);
}
