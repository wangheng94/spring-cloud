package com.test.service.impl;

import com.test.entity.Book;
import com.test.mapper.BookMapper;
import com.test.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 实现类
 *
 * @Auther wh
 * @Date 2022/11/11 8:59
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper bookMapper;

    @Override
    public Book getBookById(int bid) {
        return bookMapper.getBookById(bid);
    }
}
