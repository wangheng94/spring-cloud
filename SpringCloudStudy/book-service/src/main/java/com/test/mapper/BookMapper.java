package com.test.mapper;

import com.test.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 书籍Mapper
 *
 * @Auther wh
 * @Date 2022/11/11 8:57
 */
@Mapper
public interface BookMapper {
    @Select("select * from DB_BOOK where bid = #{bid}")
    Book getBookById(int bid);
}
