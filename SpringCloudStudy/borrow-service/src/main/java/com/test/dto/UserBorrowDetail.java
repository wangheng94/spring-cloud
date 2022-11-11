package com.test.dto;

import com.test.entity.Book;
import com.test.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * 用户借阅详情
 *
 * @Auther wh
 * @Date 2022/11/11 9:11
 */
@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}
