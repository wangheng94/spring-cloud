package com.test.service;

import com.test.entity.User;

/**
 * 用户Service
 *
 * @Auther wh
 * @Date 2022/11/10 18:56
 */
public interface UserService {
    User getUserById(int uid);
}
