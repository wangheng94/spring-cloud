package com.test.controller;

import com.test.entity.Book;
import com.test.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 书籍Controller
 *
 * @Auther wh
 * @Date 2022/11/11 9:00
 */
@RestController
public class BookController {

    @Resource
    BookService bookService;

    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid") int bid,
                      HttpServletRequest request){
        System.out.println(request.getHeader("Test"));
        return bookService.getBookById(bid);
    }
}
