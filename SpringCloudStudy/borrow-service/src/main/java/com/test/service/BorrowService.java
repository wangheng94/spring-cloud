package com.test.service;

import com.test.dto.UserBorrowDetail;

/**
 * 借阅Service
 *
 * @Auther wh
 * @Date 2022/11/11 9:08
 */
public interface BorrowService {

    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}
