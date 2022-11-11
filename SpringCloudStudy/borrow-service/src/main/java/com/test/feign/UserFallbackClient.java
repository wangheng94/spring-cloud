package com.test.feign;

import com.test.entity.User;
import org.springframework.stereotype.Component;

/**
 * @Auther wh
 * @Date 2022/11/11 16:18
 */
@Component   //注意，需要将其注册为Bean，Feign才能自动注入
public class UserFallbackClient implements UserClient{
    @Override
    public User getUserById(int uid) {   //这里我们自行对其进行实现，并返回我们的替代方案
        User user = new User();
        user.setUid(0);
        user.setName("我是替代方案");
        user.setSex(null);
        return user;
    }
}
