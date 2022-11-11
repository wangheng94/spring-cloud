package com.test.feign;

import com.test.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * feign调用书籍服务
 *
 * @Auther wh
 * @Date 2022/11/11 15:51
 */
@FeignClient("bookservice")
public interface BookClient {

    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid") int bid);
}
