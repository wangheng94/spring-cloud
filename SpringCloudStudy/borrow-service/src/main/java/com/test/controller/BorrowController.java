package com.test.controller;

import com.test.dto.UserBorrowDetail;
import com.test.service.BorrowService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 借阅Controller
 *
 * @Auther wh
 * @Date 2022/11/11 9:21
 */
@RestController
public class BorrowController {

    @Resource
    BorrowService service;

    @RequestMapping(value = "/borrow/{uid}", produces = {"application/json;charset=utf-8"})
    UserBorrowDetail findUserBorrows(@PathVariable("uid") int uid){
        return service.getUserBorrowDetailByUid(uid);
    }
}
