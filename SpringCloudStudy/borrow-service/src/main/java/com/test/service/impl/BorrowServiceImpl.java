package com.test.service.impl;

import com.test.dto.UserBorrowDetail;
import com.test.entity.Book;
import com.test.entity.Borrow;
import com.test.entity.User;
import com.test.feign.BookClient;
import com.test.feign.UserClient;
import com.test.mapper.BorrowMapper;
import com.test.service.BorrowService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 实现类
 *
 * @Auther wh
 * @Date 2022/11/11 9:19
 */
@Service
public class BorrowServiceImpl implements BorrowService {

    @Resource
    BorrowMapper borrowMapper;
    @Resource
    RestTemplate template;
    @Resource
    UserClient userClient;
    @Resource
    BookClient bookClient;

    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(int uid) {
        List<Borrow> borrow = borrowMapper.getBorrowsByUid(uid);
        //RestTemplate支持多种方式的远程调用
        //这里通过调用getForObject来请求其他服务，并将结果自动进行封装
        //获取User信息
        //这里不用再写IP，直接写服务名称userservice
        User user = userClient.getUserById(uid);
        //获取每一本书的详细信息
        //这里不用再写IP，直接写服务名称bookservice
        List<Book> bookList = borrow
                .stream()
                .map(b -> bookClient.findBookById(b.getBid()))
                .collect(Collectors.toList());
        return new UserBorrowDetail(user, bookList);
    }
}
