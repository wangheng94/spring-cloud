package com.test.feign;

import com.test.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * feign调用User服务
 *
 * @Auther wh
 * @Date 2022/11/11 15:29
 */
@FeignClient("userservice")     //声明为userservice服务的HTTP请求客户端
public interface UserClient {

    //路径保证和其他微服务提供的一致即可
    @RequestMapping("/user/{uid}")
    User getUserById(@PathVariable("uid") int uid);  //参数和返回值也保持一致
}
